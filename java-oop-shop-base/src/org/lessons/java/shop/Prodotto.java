package org.lessons.java.shop;

public class Prodotto {
    // caratteristiche
    int codice;
    String nome;
    String descrizione;
    float prezzo;
    float iva;

    // costruttore
    public Prodotto(int codice, String nome, String descrizione, float prezzo, float iva) {
        this.codice = codice;
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // metodo per il prezzo base
    public void prezzoBase(float prezzo) {
        this.prezzo = prezzo;
    }

    // metodo per il prezzo comprensivo di iva
    public void prezzoConIva(float prezzo) {
        this.prezzo = prezzo * (1 + this.iva);
    }

    // metodo per il nome esteso
    public void nomeEsteso(String nome) {
        nome = this.codice + "-" + this.nome;
    }
}
