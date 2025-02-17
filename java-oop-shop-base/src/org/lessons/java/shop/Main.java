package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        // creo un nuovo prodotto
        Prodotto pc = new Prodotto("pc", "questo è un pc", new BigDecimal(639), new BigDecimal(0.22));

        // test prezzoBase()
        System.out.println(pc.getPrezzoBase());

        // test prezzoConIva()
        System.out.println(pc.getPrezzoConIva());

        // test nomeEsteso()
        System.out.println(pc.getNomeEsteso());

    }
}
