package org.java.veicoli;

public class Motociclette extends Veicoli {
    boolean cavaletto;

    public Motociclette(String targa, boolean cavaletto) {
        super(targa);
        this.cavaletto = cavaletto;
    }


    //Getter-------------------------------


    public boolean isCavaletto() {
        return cavaletto;
    }

    //Metodi-------------------------------

    public String toString() {
        return "Motociclette{" +
                "isCavaletto? : " + cavaletto + super.toString() + '}';
    }

}
