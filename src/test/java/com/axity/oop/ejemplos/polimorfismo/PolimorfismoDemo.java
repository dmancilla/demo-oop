package com.axity.oop.ejemplos.polimorfismo;

import com.axity.oop.ejemplos.DocumentoTributario;
import com.axity.oop.ejemplos.Factura;
import com.axity.oop.ejemplos.GuiaDespacho;
import com.axity.oop.ejemplos.NotaCredito;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class PolimorfismoDemo {

    @Test
    public void simplePolimorfismo() {
        Factura factura = new Factura(100, LocalDate.now(), "10666555-9", "77665544-9", 120_000);
        assertEquals("Factura: 100, Cliente: 77665544-9, Monto: 120000", factura.getInfo());

        GuiaDespacho guiaDespacho = new GuiaDespacho(150, LocalDate.now(), "10666555-9", "77665544-9", 100, 120_000);
        assertEquals("Guia de Despacho: 150, Cliente: 77665544-9, Monto: 120000", guiaDespacho.getInfo());

        NotaCredito notaCredito = new NotaCredito(200, LocalDate.now(), "10666555-9", "77665544-9", 100, 10_000);
        assertEquals("Nota de Credito: 200, Cliente: 77665544-9, Monto: 10000", notaCredito.getInfo());
    }

    @Test
    public void polimorfismoClasePadre() {
        Factura factura = new Factura(100, LocalDate.now(), "10666555-9", "77665544-9", 120_000);
        GuiaDespacho guiaDespacho = new GuiaDespacho(150, LocalDate.now(), "10666555-9", "77665544-9", 100, 120_000);
        NotaCredito notaCredito = new NotaCredito(200, LocalDate.now(), "10666555-9", "77665544-9", 100, 10_000);

        DocumentoTributario docFactura = factura;
        assertEquals(100, docFactura.getNumero());

        DocumentoTributario docGuiaDespacho = guiaDespacho;
        assertEquals(150, docGuiaDespacho.getNumero());

        DocumentoTributario docNotaCredito = notaCredito;
        assertEquals(200, docNotaCredito.getNumero());
    }
}