package org.java.veicoli;

public class Veicoli {
    private String targa;
    private int anniImmatricolazione;

    //Costruttore---------------------------


    public Veicoli(String targa) {
        this.targa = targa;
        this.anniImmatricolazione = 1;
    }

    //Getter-------------------------------


    public String getTarga() {
        return targa;
    }

    public int getAnniImmatricolazione() {
        return anniImmatricolazione;
    }

    //Metodi---------------------------------


    @Override
    public String toString() {
        return " targa: " + targa + " | " +
                "anniImmatricolazione: " + anniImmatricolazione +
                '}';
    }
}
