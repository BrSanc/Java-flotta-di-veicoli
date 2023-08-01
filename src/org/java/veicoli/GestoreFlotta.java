package org.java.veicoli;

import java.util.ArrayList;
import java.util.List;

public class GestoreFlotta {

    private List<Veicoli> listaVeicoli;

    //Costruttore---------------------------------


    public GestoreFlotta() {
        this.listaVeicoli = new ArrayList<>();
    }

    //Metodi--------------------------------------
    public void addList(Veicoli veicoli){
        String targa = veicoli.getTarga();
        if (trovaVeicoloPerTarga(targa) != null){
            throw new IllegalArgumentException("Esiste veicolo con targa" + targa + "presente in lista");
        }
        listaVeicoli.add(veicoli);
    }

    public int contaVeicoli (String tipo) throws IllegalArgumentException{
        if(!tipo.equals("automobile") && !tipo.equals("motocicletta")){
            throw new IllegalArgumentException("tipo non valido" + tipo);
        }
        int count = 0;
        for (Veicoli veicoli:
             listaVeicoli) {
            switch (tipo){
                case "automobile":
                    if(veicoli instanceof Automobile)
                        count++;
                    break;
                case "motocicletta":
                    if (veicoli instanceof Motociclette){
                        count++;
                    }
                    break;
                default:
                    break;
            }
        }
        return count;
    }


    public Veicoli trovaVeicoloPerTarga(String targa){
        boolean trovato = false;
        int count = 0 ;
        Veicoli veicoliCercato = null;
        while(!trovato && count < listaVeicoli.size()){
            if (targa.equals(listaVeicoli.get(count).getTarga())){
                veicoliCercato = listaVeicoli.get(count);
                trovato = true;
            }
            count++;
        }
        return veicoliCercato;
    }

}
