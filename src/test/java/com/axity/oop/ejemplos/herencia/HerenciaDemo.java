package com.axity.oop.ejemplos.herencia;

import com.axity.oop.ejemplos.DocumentoTributario;
import com.axity.oop.ejemplos.Factura;
import com.axity.oop.ejemplos.GuiaDespacho;
import com.axity.oop.ejemplos.NotaCredito;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HerenciaDemo {

    @Test
    public void simpleHerencia() {
        Factura factura = new Factura(100, LocalDate.now(),"10666555-9", "77665544-9", 120_000);
        assertTrue(factura instanceof Factura);
        assertTrue(factura instanceof DocumentoTributario);

        assertEquals(100, factura.getNumero());
        assertEquals("10666555-9", factura.getRutProveedor());
        assertEquals("77665544-9", factura.getRutCliente());
        assertEquals(120_000, factura.getMonto());

        GuiaDespacho guiaDespacho = new GuiaDespacho(150,  LocalDate.now(),"10666555-9", "77665544-9", 100, 120_000);
        assertTrue(guiaDespacho instanceof GuiaDespacho);
        assertTrue(guiaDespacho instanceof DocumentoTributario);

        assertEquals(150, guiaDespacho.getNumero());
        assertEquals("10666555-9", guiaDespacho.getRutProveedor());
        assertEquals("77665544-9", guiaDespacho.getRutCliente());
        assertEquals(100, guiaDespacho.getNumeroFactura());
        assertEquals(120_000, guiaDespacho.getMonto());

        NotaCredito notaCredito = new NotaCredito(200,  LocalDate.now(),"10666555-9", "77665544-9", 100, 10_000);
        assertTrue(notaCredito instanceof NotaCredito);
        assertTrue(notaCredito instanceof DocumentoTributario);

        assertEquals(200, notaCredito.getNumero());
        assertEquals("10666555-9", notaCredito.getRutProveedor());
        assertEquals("77665544-9", notaCredito.getRutCliente());
        assertEquals(100, notaCredito.getNumeroFactura());
        assertEquals(10_000, notaCredito.getMonto());

    }
}
