package org.lessons.java.shop;

import java.util.Random;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Prodotto {

    // caratteristiche
    private int codice;
    String nome;
    String descrizione;
    BigDecimal prezzo;
    BigDecimal iva;

    // costruttore
    public Prodotto(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva) {
        // creo una variabile random
        Random random = new Random();
        this.codice = random.nextInt(100000);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // metodo per il prezzo base
    public String prezzoBase() {
        return "Il prezzo base è " + this.prezzo;
    }

    // metodo per il prezzo comprensivo di iva
    public String prezzoConIva() {
        return "Il prezzo comprensivo di iva è " + prezzo.add(prezzo.multiply(iva).setScale(2, RoundingMode.DOWN));
    }

    // metodo per il nome esteso
    public String nomeEsteso() {
        return "Il nome esteso del prodotto è " + this.codice + "-" + this.nome;
    }
}
