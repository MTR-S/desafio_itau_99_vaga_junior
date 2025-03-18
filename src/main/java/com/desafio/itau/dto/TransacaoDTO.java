package com.desafio.itau.dto;

import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.PositiveOrZero;

public class TransacaoDTO {
    @NotNull @PositiveOrZero
    private double valor;

    @NotNull @Past
    private OffsetDateTime dataHora;

    public TransacaoDTO(double valor, OffsetDateTime dataHora) {
        this.valor = valor;
        this.dataHora = dataHora;
    }

    public double getValor() {
        return valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }
}
