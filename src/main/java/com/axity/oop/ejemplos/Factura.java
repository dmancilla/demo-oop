package com.axity.oop.ejemplos;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.time.LocalDate;

public class Factura extends DocumentoTributario {

    public Factura(int numero, LocalDate fecha, String rutProveedor, String rutCliente, int monto) {
        super(numero, fecha, rutProveedor, rutCliente, monto);
    }

    public String getInfo() {
        return String.format("Factura: %d, Fecha: %s, Cliente: %s, Monto: %d", getNumero(), getFechaFormateada(), getRutCliente(), getMonto());
    }

    @Override
    public String toJson() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        return objectMapper.writeValueAsString(this);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).toString();
    }
}
