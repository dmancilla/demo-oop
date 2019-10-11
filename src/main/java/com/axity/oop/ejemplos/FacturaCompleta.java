package com.axity.oop.ejemplos;

import java.time.LocalDate;

public class FacturaCompleta {
    private final Factura factura;
    private final GuiaDespacho guiaDespacho;
    private final NotaCredito notaCredito;

    public FacturaCompleta(Factura factura, GuiaDespacho guiaDespacho, NotaCredito notaCredito) {
        this.factura = factura;
        this.guiaDespacho = guiaDespacho;
        this.notaCredito = notaCredito;
    }

    public boolean tieneGuiaDespacho() {
        return guiaDespacho != null;
    }

    public boolean tieneNotaCredito() {
        return notaCredito != null;
    }

    public LocalDate getFecha() {
        return factura.getFecha();
    }

    public int getMonto() {
        return factura.getMonto();
    }

    public int getNumero() {
        return factura.getNumero();
    }
}
