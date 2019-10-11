package com.axity.oop.ejemplos;

import java.time.LocalDate;

public class FacturaBuilder {
    private int numero;
    private LocalDate fecha;
    private int monto;
    private String rutProveedor;
    private String rutCliente;

    public FacturaBuilder() {
        this.fecha = LocalDate.now();
    }

    public FacturaBuilder rutProveedor(String rutProveedor) {
        this.rutProveedor = rutProveedor;
        return this;
    }

    public FacturaBuilder rutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
        return this;
    }

    public FacturaBuilder monto(int monto) {
        this.monto = monto;
        return this;
    }

    public FacturaBuilder numero(int numero) {
        this.numero = numero;
        return this;
    }

    public Factura build() {
        return new Factura(numero, fecha, rutProveedor, rutCliente, monto);
    }
}
