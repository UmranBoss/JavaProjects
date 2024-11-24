package com.mycompany.meinerstesprogramm;

public class If_Else {

    public static void main(String[] args) {

        System.out.println("Aufgabe: 5");
        System.out.println("--------------------------------------------");
        System.out.println("Frage\t: Wie stehen die Werte von a, b und c zueinander?");
        int a = 12;
        int b = 12;
        int c = 12;
        System.out.println("Eingabe\t: " + "a = " + a + "," + " b = " + b + "," + " c = " + c);

        // Beginn der Auswertung der Werte a, b, c
        if (a == b) {
            if (b == c) {
                System.out.println("Ausgabe\t: " + a + " = " + b + " = " + c);
            } else if (b < c) {
                System.out.println("Ausgabe\t: " + a + " = " + b + " < " + c);
            } else {
                System.out.println("Ausgabe\t: " + a + " = " + b + " > " + c);
            }
        } else {
            if (a == c) {
                if (b < c) {
                    System.out.println("Ausgabe\t: " + a + " = " + c + " > " + b);
                } else {
                    System.out.println("Ausgabe\t: " + a + " = " + c + " < " + b);
                }
            } else if (b == c) {
                if (a > b) {
                    System.out.println("Ausgabe\t: " + a + " > " + b + " = " + c);
                } else {
                    System.out.println("Ausgabe\t: " + a + " < " + b + " = " + c);
                }
            } else if (a > b) {
                if (b > c) {
                    System.out.println("Ausgabe\t: " + c + " < " + b + " < " + a);
                } else if (a > c) {
                    System.out.println("Ausgabe\t: " + b + " < " + c + " < " + a);
                } else {
                    System.out.println("Ausgabe\t: " + b + " < " + a + " < " + c);
                }

            } else if (b > c) {
                if (a > c) {
                    System.out.println("Ausgabe\t: " + c + " < " + a + " < " + b);
                } else {
                    System.out.println("Ausgabe\t: " + a + " < " + c + " < " + b);
                }

            } else {
                System.out.println("Ausgabe\t: " + a + " < " + b + " < " + c);
            }
        }
    }
}
