package com.superendividamento.model;

import java.math.BigDecimal;
import java.util.List;

public class PanoramaResponse {
    private BigDecimal totalOriginal;
    private BigDecimal totalCorrigido;
    private BigDecimal mediaParcelas;
    private BigDecimal maiorParcela;
    private BigDecimal menorParcela;
    private BigDecimal comprometimentoMaximo;
    private List<BigDecimal> evolucaoMensal;
    private BigDecimal percentualCorrecao;
    private int prazoTotal;

    public BigDecimal getTotalOriginal() {
        return totalOriginal;
    }

    public void setTotalOriginal(BigDecimal totalOriginal) {
        this.totalOriginal = totalOriginal;
    }

    public BigDecimal getTotalCorrigido() {
        return totalCorrigido;
    }

    public void setTotalCorrigido(BigDecimal totalCorrigido) {
        this.totalCorrigido = totalCorrigido;
    }

    public BigDecimal getMediaParcelas() {
        return mediaParcelas;
    }

    public void setMediaParcelas(BigDecimal mediaParcelas) {
        this.mediaParcelas = mediaParcelas;
    }

    public BigDecimal getMaiorParcela() {
        return maiorParcela;
    }

    public void setMaiorParcela(BigDecimal maiorParcela) {
        this.maiorParcela = maiorParcela;
    }

    public BigDecimal getMenorParcela() {
        return menorParcela;
    }

    public void setMenorParcela(BigDecimal menorParcela) {
        this.menorParcela = menorParcela;
    }

    public BigDecimal getComprometimentoMaximo() {
        return comprometimentoMaximo;
    }

    public void setComprometimentoMaximo(BigDecimal comprometimentoMaximo) {
        this.comprometimentoMaximo = comprometimentoMaximo;
    }

    public List<BigDecimal> getEvolucaoMensal() {
        return evolucaoMensal;
    }

    public void setEvolucaoMensal(List<BigDecimal> evolucaoMensal) {
        this.evolucaoMensal = evolucaoMensal;
    }

    public BigDecimal getPercentualCorrecao() {
        return percentualCorrecao;
    }

    public void setPercentualCorrecao(BigDecimal percentualCorrecao) {
        this.percentualCorrecao = percentualCorrecao;
    }

    public int getPrazoTotal() {
        return prazoTotal;
    }

    public void setPrazoTotal(int prazoTotal) {
        this.prazoTotal = prazoTotal;
    }
} 