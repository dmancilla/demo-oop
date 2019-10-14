package com.axity.oop.ejemplos.builder;

import com.axity.oop.ejemplos.Factura;
import com.axity.oop.ejemplos.FacturaBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class BuilderDemo {

    @Test
    public void simpleBuilder() {
        Factura factura1 = new Factura(100, LocalDate.now().minus(1, ChronoUnit.DAYS), "10666555-9", "77665544-9", 120_000);

        Factura factura2 = new FacturaBuilder()
                .numero(100)
                .rutProveedor("10666555-9")
                .rutCliente("77665544-9")
                .monto(120_000)
                .build();

        Assert.assertEquals(factura1.getNumero(), factura2.getNumero());
        Assert.assertEquals(factura1.getFecha(), factura2.getFecha());
        Assert.assertEquals(factura1.getRutCliente(), factura2.getRutCliente());
        Assert.assertEquals(factura1.getRutProveedor(), factura2.getRutProveedor());
    }
}
