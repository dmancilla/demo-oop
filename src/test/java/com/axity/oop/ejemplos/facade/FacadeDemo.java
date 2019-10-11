package com.axity.oop.ejemplos.facade;

import com.axity.oop.ejemplos.Factura;
import com.axity.oop.ejemplos.FacturaCompleta;
import com.axity.oop.ejemplos.GuiaDespacho;
import com.axity.oop.ejemplos.NotaCredito;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

public class FacadeDemo {

    private Factura factura;
    private GuiaDespacho guiaDespacho;
    private NotaCredito notaCredito;

    @Before
    public void setUp() {
        factura = new Factura(100, LocalDate.now(), "10666555-9", "77665544-9", 120_000);
        guiaDespacho = new GuiaDespacho(150, LocalDate.now(), "10666555-9", "77665544-9", 100, 120_000);
        notaCredito = new NotaCredito(200, LocalDate.now(), "10666555-9", "77665544-9", 100, 10_000);
    }

    @Test
    public void simpleFacadeDemo() {
        FacturaCompleta facturaCompleta = new FacturaCompleta(factura, guiaDespacho, notaCredito);

        Assert.assertEquals(100, facturaCompleta.getNumero());
        Assert.assertEquals(LocalDate.now(), facturaCompleta.getFecha());
        Assert.assertEquals(120000, facturaCompleta.getMonto());
        Assert.assertTrue(facturaCompleta.tieneGuiaDespacho());
        Assert.assertTrue(facturaCompleta.tieneNotaCredito());
    }
}
