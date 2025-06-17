package com.superendividamento.model;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class GeralResponse {
    private BigDecimal totalDividas;
    private BigDecimal totalCorrigido;
    private BigDecimal comprometimentoRenda;
    private int prazoEstimadoMeses;
    private BigDecimal valorParcela;
    private BigDecimal rendaMensal;
    private int numeroParcelas;

    public BigDecimal getTotalDividas() {
        return totalDividas;
    }

    public void setTotalDividas(BigDecimal totalDividas) {
        this.totalDividas = totalDividas;
    }

    public BigDecimal getTotalCorrigido() {
        return totalCorrigido;
    }

    public void setTotalCorrigido(BigDecimal totalCorrigido) {
        this.totalCorrigido = totalCorrigido;
    }

    public BigDecimal getComprometimentoRenda() {
        return comprometimentoRenda;
    }

    public void setComprometimentoRenda(BigDecimal comprometimentoRenda) {
        this.comprometimentoRenda = comprometimentoRenda;
    }

    public int getPrazoEstimadoMeses() {
        return prazoEstimadoMeses;
    }

    public void setPrazoEstimadoMeses(int prazoEstimadoMeses) {
        this.prazoEstimadoMeses = prazoEstimadoMeses;
    }

    public BigDecimal getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(BigDecimal valorParcela) {
        this.valorParcela = valorParcela;
    }

    public BigDecimal getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(BigDecimal rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }
} 