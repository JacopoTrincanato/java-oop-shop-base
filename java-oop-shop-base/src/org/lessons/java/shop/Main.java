package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        // creo un nuovo prodotto
        Prodotto televisione = new Prodotto(15, "televisione", "questa è una televisione", 400, 0.22f);

        float prezzoConIva = televisione.prezzoConIva();

        System.out.println(prezzoConIva);
    }
}
