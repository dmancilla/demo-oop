package com.axity.oop.ejemplos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class DocumentoTributario {
    private final DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MMM/yyyy");

    private final int numero;
    private final LocalDate fecha;
    private final String rutProveedor;
    private final String rutCliente;
    private final int monto;

    public DocumentoTributario(int numero, LocalDate fecha, String rutProveedor, String rutCliente, int monto) {
        this.numero = numero;
        this.fecha = fecha;
        this.rutProveedor = rutProveedor;
        this.rutCliente = rutCliente;
        this.monto = monto;
    }

    public int getNumero() {
        return numero;
    }

    @JsonIgnore
    public LocalDate getFecha() {
        return fecha;
    }

    public String getRutProveedor() {
        return rutProveedor;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public int getMonto() {
        return monto;
    }

    public String getFechaFormateada() {
        return getFecha().format(formatoFecha);
    }

    public abstract String toJson() throws JsonProcessingException;
}
