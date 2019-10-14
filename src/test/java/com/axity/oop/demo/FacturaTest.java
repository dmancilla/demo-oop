package com.axity.oop.demo;

import org.junit.Assert;
import org.junit.Test;

public class FacturaTest {

    @Test
    public void simpleFactura() {

        Factura factura = new Factura(120);

        Assert.assertEquals(120, factura.numero);
    }
}
