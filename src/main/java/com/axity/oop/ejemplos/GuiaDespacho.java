package com.axity.oop.ejemplos;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.time.LocalDate;

public class GuiaDespacho extends DocumentoTributario {
    private final int numeroFactura;

    public GuiaDespacho(int numero, LocalDate fecha, String rutProveedor, String rutCliente, int numeroFactura, int monto) {
        super(numero, fecha, rutProveedor, rutCliente, monto);
        this.numeroFactura = numeroFactura;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    @Override
    public String toJson() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        return objectMapper.writeValueAsString(this);
    }

    public String getInfo() {
        return String.format("Guia de Despacho: %d, Fecha: %s, Cliente: %s, Monto: %d", getNumero(), getFechaFormateada(), getRutCliente(), getMonto());
    }
}
