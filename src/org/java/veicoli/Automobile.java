package org.java.veicoli;

public class Automobile extends Veicoli {
    private int numeroPorte;

    public Automobile(String targa, int numeroPorte) {
        super(targa);
        this.numeroPorte = numeroPorte;
    }

    public int getNumeroPorte() {
        return numeroPorte;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "numeroPorte: " + numeroPorte + super.toString() + '}';
    }
}
