package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        // creo un nuovo prodotto
        Prodotto pc = new Prodotto("pc", "questo è un pc", new BigDecimal(639), new BigDecimal(0.22));

        // creo un nuovo termosifone
        Prodotto termosifone = new Prodotto();

        // test prezzo base
        System.out.println(termosifone.getPrezzoBase());

        // test prezzo base
        System.out.println(pc.getPrezzoBase());

        // test prezzo con Iva
        System.out.println(pc.getPrezzoConIva());

        // test nome Esteso
        System.out.println(pc.getNomeEsteso());

        // test codice
        System.out.println(pc.getCodice());

    }
}
