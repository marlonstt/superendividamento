package com.superendividamento.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Divida {
    private String credor;
    private BigDecimal valor;
    private LocalDate data;

    public Divida(BigDecimal valor, LocalDate data) {
        this.valor = valor;
        this.data = data;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDate getData() {
        return data;
    }
} 