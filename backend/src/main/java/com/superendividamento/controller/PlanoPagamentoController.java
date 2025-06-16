package com.superendividamento.controller;

import com.superendividamento.model.Divida;
import com.superendividamento.model.ParcelaPlano;
import com.superendividamento.model.PlanoRequest;
import com.superendividamento.service.GeradorPlanoPagamento;
import com.superendividamento.service.ServicoCorrecaoMonetaria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@RequestMapping("/api/plano")
@CrossOrigin(origins = "*")
public class PlanoPagamentoController {
    private static final Logger logger = LoggerFactory.getLogger(PlanoPagamentoController.class);

    @Autowired
    private GeradorPlanoPagamento geradorPlano;
    @Autowired
    private ServicoCorrecaoMonetaria servicoCorrecao;

    @PostMapping
    public ResponseEntity<?> gerarPlano(@RequestBody PlanoRequest request) {
        try {
            logger.info("Recebendo requisição para gerar plano");

            // Validação da requisição
            if (request == null) {
                throw new IllegalArgumentException("Requisição não pode ser nula");
            }

            // Validação da renda mensal
            if (request.getRendaMensal() == null) {
                throw new IllegalArgumentException("Renda mensal é obrigatória");
            }
            if (request.getRendaMensal().compareTo(BigDecimal.ZERO) <= 0) {
                throw new IllegalArgumentException("Renda mensal deve ser maior que zero");
            }

            // Validação do número de parcelas
            if (request.getNumeroParcelas() <= 0) {
                throw new IllegalArgumentException("Número de parcelas deve ser maior que zero");
            }

            // Validação da data de homologação
            if (request.getDataHomologacao() == null || request.getDataHomologacao().trim().isEmpty()) {
                throw new IllegalArgumentException("Data de homologação é obrigatória");
            }

            // Validação do índice
            if (request.getIndice() == null || request.getIndice().trim().isEmpty()) {
                throw new IllegalArgumentException("Índice é obrigatório");
            }

            // Validação das dívidas
            if (request.getDividas() == null || request.getDividas().isEmpty()) {
                throw new IllegalArgumentException("Lista de dívidas não pode estar vazia");
            }

            // Processamento das dívidas
            BigDecimal totalCorrigido = BigDecimal.ZERO;
            for (Divida d : request.getDividas()) {
                if (d.getValor() == null) {
                    throw new IllegalArgumentException("Valor da dívida é obrigatório");
                }
                if (d.getData() == null) {
                    throw new IllegalArgumentException("Data da dívida é obrigatória");
                }
                if (d.getValor().compareTo(BigDecimal.ZERO) <= 0) {
                    throw new IllegalArgumentException("Valor da dívida deve ser maior que zero");
                }
                totalCorrigido = totalCorrigido.add(servicoCorrecao.calcularValorCorrigido(d, request.getIndice()));
            }

            // Geração do plano
            LocalDate dataInicio = LocalDate.parse(request.getDataHomologacao());
            dataInicio = dataInicio.plusDays(180);

            List<ParcelaPlano> plano = geradorPlano.gerar(
                totalCorrigido,
                request.getRendaMensal(),
                dataInicio,
                request.getNumeroParcelas()
            );

            logger.info("Plano gerado com sucesso: {} parcelas", plano.size());
            return ResponseEntity.ok(plano);
        } catch (IllegalArgumentException e) {
            logger.warn("Erro de validação: {}", e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            logger.error("Erro ao gerar plano: ", e);
            return ResponseEntity.internalServerError().body("Erro ao gerar plano: " + e.getMessage());
        }
    }
} 