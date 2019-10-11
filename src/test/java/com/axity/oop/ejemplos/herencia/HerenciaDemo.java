package com.axity.oop.ejemplos.herencia;

import com.axity.oop.ejemplos.DocumentoTributario;
import com.axity.oop.ejemplos.Factura;
import com.axity.oop.ejemplos.GuiaDespacho;
import com.axity.oop.ejemplos.NotaCredito;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HerenciaDemo {
    private final String RUT_PROVEEDOR = "10666555-9";
    private final String RUT_CLIENTE = "77665544-9";

    private Factura factura;
    private GuiaDespacho guiaDespacho;
    private NotaCredito notaCredito;

    @Before
    public void setUp() throws Exception {
        factura = new Factura(100, LocalDate.now(), RUT_PROVEEDOR, RUT_CLIENTE, 120_000);
        guiaDespacho = new GuiaDespacho(150, LocalDate.now(), RUT_PROVEEDOR, RUT_CLIENTE, 100, 120_000);
        notaCredito = new NotaCredito(200, LocalDate.now(), RUT_PROVEEDOR, RUT_CLIENTE, 100, 10_000);
    }

    @Test
    public void simpleHerencia() {
        assertTrue(factura instanceof Factura);
        assertTrue(factura instanceof DocumentoTributario);

        assertEquals(100, factura.getNumero());
        assertEquals(RUT_PROVEEDOR, factura.getRutProveedor());
        assertEquals(RUT_CLIENTE, factura.getRutCliente());
        assertEquals(120_000, factura.getMonto());

        assertTrue(guiaDespacho instanceof GuiaDespacho);
        assertTrue(guiaDespacho instanceof DocumentoTributario);

        assertEquals(150, guiaDespacho.getNumero());
        assertEquals(RUT_PROVEEDOR, guiaDespacho.getRutProveedor());
        assertEquals(RUT_CLIENTE, guiaDespacho.getRutCliente());
        assertEquals(100, guiaDespacho.getNumeroFactura());
        assertEquals(120_000, guiaDespacho.getMonto());

        assertTrue(notaCredito instanceof NotaCredito);
        assertTrue(notaCredito instanceof DocumentoTributario);

        assertEquals(200, notaCredito.getNumero());
        assertEquals(RUT_PROVEEDOR, notaCredito.getRutProveedor());
        assertEquals(RUT_CLIENTE, notaCredito.getRutCliente());
        assertEquals(100, notaCredito.getNumeroFactura());
        assertEquals(10_000, notaCredito.getMonto());

    }
}
