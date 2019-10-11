package com.axity.oop.ejemplos;

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

    public String getInfo() {
        return String.format("Guia de Despacho: %d, Cliente: %s, Monto: %d", getNumero(), getRutCliente(), getMonto());
    }
}
