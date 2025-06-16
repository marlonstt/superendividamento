package com.superendividamento.service;

import com.superendividamento.model.ParcelaPlano;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
public class GeradorPlanoPagamento {
    public List<ParcelaPlano> gerar(BigDecimal valorTotalCorrigido, BigDecimal rendaMensal, LocalDate dataInicio, int numeroDeParcelas) {
        List<ParcelaPlano> plano = new ArrayList<>();
        BigDecimal valorParcela = valorTotalCorrigido.divide(new BigDecimal(numeroDeParcelas), 2, RoundingMode.HALF_UP);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        for (int i = 1; i <= numeroDeParcelas; i++) {
            LocalDate dataVencimento = dataInicio.plusMonths(i - 1);
            BigDecimal comprometimentoRenda = valorParcela.divide(rendaMensal, 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
            plano.add(new ParcelaPlano(i, dataVencimento.format(formatter), valorParcela, comprometimentoRenda));
        }
        return plano;
    }
} 