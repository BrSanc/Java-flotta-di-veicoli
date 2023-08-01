package org.java.veicoli;

public class Main {
    public static void main(String[] args) {
        Automobile a1 = new Automobile("ABC678XY", 4);
        Automobile a2 = new Automobile("DEF456DF", 4);
        Automobile a3 = new Automobile("QWE984KL", 4);

        Motociclette m1 = new Motociclette("LKJ345IO", true);
        Motociclette m2 = new Motociclette("ZXC123DF", false);
        Motociclette m3 = new Motociclette("FGH789ER", true);

        GestoreFlotta gestoreFlotta = new GestoreFlotta();
        gestoreFlotta.addList(a1);
        gestoreFlotta.addList(a2);
        gestoreFlotta.addList(a3);
        gestoreFlotta.addList(m1);
        gestoreFlotta.addList(m2);
        gestoreFlotta.addList(m3);

        System.out.println("automobili: " + gestoreFlotta.contaVeicoli("automobile"));
        System.out.println("motocicletta: " + gestoreFlotta.contaVeicoli("motocicletta"));


        try {
            gestoreFlotta.contaVeicoli(" furgoni");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        System.out.println(gestoreFlotta.trovaVeicoloPerTarga("UIO980OP"));
        System.out.println(gestoreFlotta.trovaVeicoloPerTarga("FGH789ER"));
        System.out.println(gestoreFlotta.trovaVeicoloPerTarga("LKJ345IO"));

    }

}
