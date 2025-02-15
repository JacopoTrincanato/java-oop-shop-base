package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    // creo una variabile random
    Random random = new Random();

    // caratteristiche
    int codice = random.nextInt();
    String nome;
    String descrizione;
    float prezzo;
    float iva;

    // costruttore
    public Prodotto(String nome, String descrizione, float prezzo, float iva) {
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
        return "Il prezzo comprensivo di iva è " + this.prezzo * (1 + this.iva);
    }

    // metodo per il nome esteso
    public String nomeEsteso() {
        return "Il nome esteso del prodotto è " + this.codice + "-" + this.nome;
    }
}
