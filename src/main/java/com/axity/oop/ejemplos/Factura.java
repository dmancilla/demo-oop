package com.axity.oop.ejemplos;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.time.LocalDate;

public class Factura extends DocumentoTributario {

    public Factura(int numero, LocalDate fecha, String rutProveedor, String rutCliente, int monto) {
        super(numero, fecha, rutProveedor, rutCliente, monto);
    }

    public String getInfo(){
        return String.format("Factura: %d, Fecha: %s, Cliente: %s, Monto: %d", getNumero(), getFecha(), getRutCliente(), getMonto());
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).toString();
    }
}
