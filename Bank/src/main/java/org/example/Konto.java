package org.example;

public class Konto {
    private double saldo;
    private double zinssatz;

    private Kunde inhaber;

    public Konto(){
        this.zinssatz = 0.01;
    }
    public Konto(double zinssatz) {
        this.zinssatz = zinssatz;
    }

    public Konto(double saldo, double zinssatz, Kunde inhaber) {
        this.saldo = saldo;
        this.zinssatz = zinssatz;
        this.inhaber = inhaber;
    }

    public void einzahlen(double betrag){
        saldo += betrag;
    }
    public void verzinsen(int tage){
        double akutellerZinssatz = zinssatz;
        if (saldo > 50000) {
            akutellerZinssatz /= 2;
        }
        if (saldo >= 500000) {
            akutellerZinssatz = 0;
        }
        double zins = saldo * akutellerZinssatz * tage / 365;
        saldo += zins;
    }

    public double getSaldo() {
        return saldo;
    }
}
