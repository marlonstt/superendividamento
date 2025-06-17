package com.superendividamento.controller;

import com.superendividamento.model.GeralResponse;
import com.superendividamento.service.GeradorPlanoPagamento;
import com.superendividamento.service.ServicoCorrecaoMonetaria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/geral")
@CrossOrigin(origins = "*")
public class GeralController {
    private static final Logger logger = LoggerFactory.getLogger(GeralController.class);

    @Autowired
    private GeradorPlanoPagamento geradorPlano;
    @Autowired
    private ServicoCorrecaoMonetaria servicoCorrecao;

    @GetMapping
    public ResponseEntity<?> getResumoGeral() {
        try {
            // TODO: Implementar lógica para calcular resumo geral
            GeralResponse response = new GeralResponse();
            // Exemplo de valores
            response.setTotalDividas(new BigDecimal("10000.00"));
            response.setTotalCorrigido(new BigDecimal("12000.00"));
            response.setComprometimentoRenda(new BigDecimal("30.00"));
            response.setPrazoEstimadoMeses(24);
            response.setValorParcela(new BigDecimal("500.00"));
            response.setRendaMensal(new BigDecimal("5000.00"));
            response.setNumeroParcelas(24);

            return ResponseEntity.ok(response);
        } catch (Exception e) {
            logger.error("Erro ao gerar resumo geral: ", e);
            return ResponseEntity.internalServerError().body("Erro ao gerar resumo: " + e.getMessage());
        }
    }
} 