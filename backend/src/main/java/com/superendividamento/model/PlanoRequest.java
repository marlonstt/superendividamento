package com.superendividamento.model;

import java.math.BigDecimal;
import java.util.List;

public class PlanoRequest {
    private BigDecimal rendaMensal;
    private String dataHomologacao;
    private int numeroParcelas;
    private String indice;
    private List<Divida> dividas;

    public BigDecimal getRendaMensal() {
        return rendaMensal;
    }
    public String getDataHomologacao() {
        return dataHomologacao;
    }
    public int getNumeroParcelas() {
        return numeroParcelas;
    }
    public String getIndice() {
        return indice;
    }
    public List<Divida> getDividas() {
        return dividas;
    }

    public void setRendaMensal(BigDecimal rendaMensal) {
        this.rendaMensal = rendaMensal;
    }
    public void setDataHomologacao(String dataHomologacao) {
        this.dataHomologacao = dataHomologacao;
    }
    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }
    public void setIndice(String indice) {
        this.indice = indice;
    }
    public void setDividas(List<Divida> dividas) {
        this.dividas = dividas;
    }
} 