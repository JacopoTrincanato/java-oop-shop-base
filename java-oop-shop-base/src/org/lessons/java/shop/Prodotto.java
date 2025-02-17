package org.lessons.java.shop;

import java.util.Random;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Prodotto {

    // caratteristiche
    private int codice;
    private String nome;
    private String descrizione;
    private BigDecimal prezzo;
    private BigDecimal iva;

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

    // costruttore due
    public Prodotto() {
        // creo una variabile random
        Random random = new Random();
        this.codice = random.nextInt(1000);
        nome = "termosifone";
        descrizione = "questo è un termosifone";
        prezzo = new BigDecimal(350);
        iva = new BigDecimal(0.1);
    }

    // metodo per il codice
    public String getCodice() {
        return "Il codice del prodotto è " + this.codice;
    }

    // metodo per il prezzo base
    public String getPrezzoBase() {
        return "Il prezzo base è " + this.prezzo;
    }

    // metodo per il nome
    public String getNome() {
        return "Il nome del prodotto è " + this.nome;
    }

    // metodo per la descrizione
    public String getDescrizione() {
        return "la descrizione del prodotto è " + this.descrizione;
    }

    // metodo per l'iva
    public String getIva() {
        return "l'iva del prodotto è " + this.iva;
    }

    // metodo per il prezzo comprensivo di iva
    public String getPrezzoConIva() {
        return "Il prezzo comprensivo di iva è " + prezzo.add(prezzo.multiply(iva).setScale(2, RoundingMode.DOWN));
    }

    // metodo per il nome esteso
    public String getNomeEsteso() {
        return "Il nome esteso del prodotto è " + this.codice + "-" + this.nome;
    }

    // metodo per settare il prezzo base
    public void setPrezzoBase(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    // metodo per settare il nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // metodo per settare la descrizione
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    // metodo per settare l'iva
    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }
}
