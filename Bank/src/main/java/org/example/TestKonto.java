package org.example;

public class TestKonto {
    public static void main(String[] args) {

        Kunde maier = new Kunde("Meier", "Klaus", 1);
        Kunde mayer = new Kunde("Mayer", "Kurt", 2);
        Konto konto1 = new Konto(500.75,0.01,maier);
        Konto konto2 = new Konto(720.50,0.02,mayer);
        konto1.verzinsen(365);
        konto2.verzinsen(750);
        System.out.println(konto1.getSaldo());
        System.out.println(konto2.getSaldo());
        konto2.einzahlen(100);
        System.out.println(konto2.getSaldo());
    }

}
