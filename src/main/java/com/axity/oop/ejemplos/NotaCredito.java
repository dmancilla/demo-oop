package com.axity.oop.ejemplos;

import java.time.LocalDate;

public class NotaCredito extends DocumentoTributario {
    private final int numeroFactura;

    public NotaCredito(int numero, LocalDate fecha, String rutProveedor, String rutCliente, int numeroFactura, int monto) {
        super(numero, fecha, rutProveedor, rutCliente, monto);
        this.numeroFactura = numeroFactura;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public String getInfo() {
        return String.format("Nota de Credito: %d, Cliente: %s, Monto: %d", getNumero(), getRutCliente(), getMonto());
    }
}
