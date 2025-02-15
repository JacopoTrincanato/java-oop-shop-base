package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {

        // creo un nuovo prodotto
        Prodotto pc = new Prodotto("pc", "questo è un pc", 639, 0.22f);

        // test prezzoBase()
        System.out.println(pc.prezzoBase());

        // test prezzoConIva()
        System.out.println(pc.prezzoConIva());

        // test nomeEsteso()
        System.out.println(pc.nomeEsteso());
    }
}
