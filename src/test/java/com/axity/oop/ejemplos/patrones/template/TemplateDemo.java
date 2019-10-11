package com.axity.oop.ejemplos.patrones.template;

import com.axity.oop.ejemplos.Factura;
import com.axity.oop.ejemplos.GuiaDespacho;
import com.axity.oop.ejemplos.NotaCredito;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.time.LocalDate;

public class TemplateDemo {

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
    public void simpleTemplateDemo() throws Exception {
        String facturaJson = factura.toJson();
        String facturaJsonEsperado = getJsonEsperado("facturaEjemplo.json");
        Assert.assertEquals(facturaJsonEsperado, facturaJson);

        String guiaDespachoJson = guiaDespacho.toJson();
        String guiaDespachoJsonEsperado = getJsonEsperado("guiaDespachoEjemplo.json");
        Assert.assertEquals(guiaDespachoJsonEsperado, guiaDespachoJson);

        String notaCreditoJson = notaCredito.toJson();
        String notaCreditoJsonEsperado = getJsonEsperado("notaCreditoEjemplo.json");
        Assert.assertEquals(notaCreditoJsonEsperado, notaCreditoJson);
    }

    private String getJsonEsperado(String filename) throws IOException {
        ClassPathResource classPathResource = new ClassPathResource(filename, getClass());
        File file = classPathResource.getFile();
        byte[] bytes = Files.readAllBytes(file.toPath());
        Assert.assertTrue(bytes.length > 0);
        return new String(bytes, StandardCharsets.UTF_8);
    }
}
