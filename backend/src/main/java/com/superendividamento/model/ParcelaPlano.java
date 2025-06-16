package com.superendividamento.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class ParcelaPlano {
    private int numero;
    
    @JsonProperty("dataVencimento")
    private String dataVencimento;
    
    private BigDecimal valor;
    
    @JsonProperty("percentualComprometimentoRenda")
    private BigDecimal percentualComprometimentoRenda;

    public ParcelaPlano(int numero, String dataVencimento, BigDecimal valor, BigDecimal percentualComprometimentoRenda) {
        this.numero = numero;
        this.dataVencimento = dataVencimento;
        this.valor = valor;
        this.percentualComprometimentoRenda = percentualComprometimentoRenda;
    }
} 