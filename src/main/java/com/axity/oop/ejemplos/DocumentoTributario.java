package com.axity.oop.ejemplos;

import java.time.LocalDate;

public class DocumentoTributario {
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
}
