package ch.gibb.Ruch_Spielmann;

public class Main {
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
    }
    public static void xgleichy(){
        int x=0;
        long y= 1000;
        // x = Y; -> Y ist nicht initialisiert
        // x = y; -> ein long Wert kann nicht in einen kleineren Wert gespeichert werden.
        x = (int) y; // Wenn man den Wert castet (int) kann er gespeichert werden.
    }

}