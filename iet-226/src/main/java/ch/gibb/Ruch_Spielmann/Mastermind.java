package ch.gibb.Ruch_Spielmann;

import java.util.Random;
import java.util.Scanner;


public class Mastermind {

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();
    public static final char[] FARBEN = new char[] {'r','b','g','y','w','s'};


    public static void main(String[] args) {

        int[] geheimcode = erstelleGeheimcode();
        //  char[] eingabe = benutzereingabe();

        for (int i :
                geheimcode) {
            System.out.println(i);
        }
    }

    private static int[] erstelleGeheimcode() {
        int[] geheimcode = new int[4];

        for (int i = 0; i < geheimcode.length; i++) {
            geheimcode[i] = random.nextInt(FARBEN.length);
        }

        return geheimcode;
    }

    public static char [] benutzereingabe(){
        char[] eingabe;
        do {
            System.out.println("Geben Sie ihren versuch ein");
            eingabe = scanner.nextLine().toCharArray();

        } while (eingabe.length != 4);
        return eingabe;

    }
}































