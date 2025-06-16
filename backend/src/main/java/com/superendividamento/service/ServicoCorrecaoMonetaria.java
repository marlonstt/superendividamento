package com.superendividamento.service;

import com.superendividamento.model.Divida;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Service
public class ServicoCorrecaoMonetaria {
    public BigDecimal calcularValorCorrigido(Divida divida, String indice) {
        BigDecimal fatorCorrecao = obterFatorDeCorrecao(indice, divida.getData(), LocalDate.now());
        return divida.getValor().multiply(fatorCorrecao);
    }
    private BigDecimal obterFatorDeCorrecao(String indice, LocalDate dataInicial, LocalDate dataFinal) {
        long meses = ChronoUnit.MONTHS.between(dataInicial.withDayOfMonth(1), dataFinal.withDayOfMonth(1));
        double fatorMensal = 1.005; // Simulação de 0.5% ao mês
        return BigDecimal.valueOf(Math.pow(fatorMensal, meses));
    }
} 