package com.axity.oop;

import com.axity.oop.demo.Factura;

public class FacturaDemo {

    public static void main(String[] args) {
        Factura factura = new Factura(120);
        System.out.println("El numero de la factura es: " + factura.numero);
    }
}
