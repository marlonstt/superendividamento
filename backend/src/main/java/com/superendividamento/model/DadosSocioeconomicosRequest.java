package com.superendividamento.model;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class DadosSocioeconomicosRequest {
    private String nome;
    private BigDecimal rendaMensal;
    private int dependentes;
    private String situacaoProfissional;
    private String estadoCivil;
    private String outrasInformacoes;
} 