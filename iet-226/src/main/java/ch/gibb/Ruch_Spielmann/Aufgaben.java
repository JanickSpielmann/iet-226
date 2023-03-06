package ch.gibb.Ruch_Spielmann;

import java.util.Random;

public class Aufgaben {
    public static void main(String[] args) {
        // Anzahl der Lernenden in einer Klasse
        int numberOfStudents = 30;

        // Zustand eines Lichtschalters
        boolean lightSwitch = false;

        // Saldo eines Bankkontos
        double bankBalance = 1000.50;

        // Bezeichnung einer bestimmten Linie und Reihe auf dem Schachbrett
        byte chessLine = 2;
        char chessRow = 'c'; //Unicode: 99

        // Ausgabe der Variablen
        System.out.println("Anzahl der Lernenden in einer Klasse: " + numberOfStudents);
        System.out.println("Zustand eines Lichtschalters: " + lightSwitch);
        System.out.println("Saldo eines Bankkontos: " + bankBalance);
        System.out.println("Bezeichnung einer bestimmten Linie auf dem Schachbrett: " + chessLine);
        System.out.println("Bezeichnung einer bestimmten Reihe auf dem Schachbrett: " + chessRow);

        tannenbaum(8);
        ggt(7, 2);

        for (int i = 0; i < 10; i++) {
            xo();
        }
    }

    public static void xgleichy() {
        int x = 0;
        long y = 1000;
        // x = Y; -> Y ist nicht initialisiert
        // x = y; -> ein long Wert kann nicht in einen kleineren Wert gespeichert werden.
        x = (int) y; // Wenn man den Wert castet (int) kann er gespeichert werden.
    }

    public static void tannenbaum(int grosse) {

        String ausgabe = "";
        for (int i = 1; i < grosse + 1; i++) {
            ausgabe += "*";
            System.out.println(ausgabe);
        }

    }

    public static void ggt(int p, int q) {

        int pEingabe = p;
        int qEingabe = q;
        if (p < q) {
            int x = q;
            q = p;
            p = x;
        }
        while (q != 0) {
            int r = p % q;
            p = q;
            q = r;
        }
        System.out.println("Der grösste gemeinsame Teiler von " + pEingabe + " und " + qEingabe + " ist " + p);


    }

    public static void xo() {


        String ausgabeText = "";
        Random zufall = new Random();
        int zufallszahl = zufall.nextInt(1, 5);
        int rest = 10 % zufallszahl;
        int abstand = (10 - zufallszahl - rest) / zufallszahl;
        for (int i = 0; i < zufallszahl; i++) {
            ausgabeText += "X";
            for (int j = 0; j < abstand; j++) {
                ausgabeText += "O";
            }
        }
        for (int i = 0; i < rest; i++) {
            ausgabeText += "O";
        }

        System.out.println("Mit der Random Zahl " + zufallszahl + ": " + ausgabeText);

    }
}
