package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_01 {

    public static void main(String[] args) {

        System.out.println("------------ Erste Aufgabe ------------");
        System.out.println();

        // Variable deklarieren für die Anzahl der Elemente im Array
        int nAnzahlElemente = 10;
        // Array deklarieren & initialisieren
        int[] aiQuadratZahlen = new int[nAnzahlElemente];
        // Aufgabe: Belege die Elemente des Arrays auQuadratZahlen jeweils
        // mit der Quadratzahl der zugehoerige Position im Array.
        // Geben dann die Quadratzahl von 5 aus!
        // Das Array mit den Quadratzahlen der Positione füllen
        for (int i = 0; i < nAnzahlElemente; i++) {
            aiQuadratZahlen[i] = i * i;
        }

        System.out.println("Die Quadratzahl von 5 lautet: " + aiQuadratZahlen[5]);

        System.out.println();
        System.out.println("------------ Zweite Aufgabe ------------");
        System.out.println();
        // Implementieren Sie ist ein Java-Programm, welches aus 10 einzugebenden Zahlen folgende Werte ermittelt:
        // Summe
        // Minimum und Maximum
        // Mittelwert
        // Anzahl positiver Werte
        // Ermitteln Sie die einzelnen Ergebnisse jeweils in einer Methode mit Rückgabewert.
        // Die Eingabe der 10 Einzelwerte und die Ausgabe der Ergebnisse soll in der main-Methode erfolgen.

        Scanner scanner = new Scanner(System.in);
        int[] zahlen = new int[10];

        // Eingabe der 10 Zahlen in das Array
        System.out.println("Bitte geben Sie 10 Zahlen ein! ");
        for (int i = 0; i < zahlen.length; i++) {
            System.out.print("Zahl " + (i + 1) + ": ");
            zahlen[i] = scanner.nextInt();
        }

        // Berechnungen
        int summe = berechneSumme(zahlen);
        int minimum = berechneMinimum(zahlen);
        int maximum = berechneMaximum(zahlen);
        double mittelwert = berechneMittelwert(zahlen);
        int anzahlPositiv = berechneAnzahlPositiv(zahlen);

        // Ergebnisse
        System.out.println("Ergebnisse");
        System.out.println("Summe: " + summe);
        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);
        System.out.println("Mittelwert: " + mittelwert);
        System.out.println("Anzahl positiver Werte: " + anzahlPositiv);

        scanner.close();
    }

    // Methode zur Berechnung der Summe
    public static int berechneSumme(int[] zahlen) {
        int summe = 0;
        for (int zahl : zahlen) {
            summe += zahl;
        }
        return summe;
    }

    // Methode zur Berechnung des Minimums
    public static int berechneMinimum(int[] zahlen) {
        int min = zahlen[0];
        for (int zahl : zahlen) {
            if (zahl < min) {
                min = zahl;
            }
        }
        return min;
    }

    // Methode zur Berechnung des Maximums
    public static int berechneMaximum(int[] zahlen) {
        int max = zahlen[0];
        for (int zahl : zahlen) {
            if (zahl > max) {
                max = zahl;
            }
        }
        return max;
    }

    // Methode zur Berechnung des Mittelwerts
    public static double berechneMittelwert(int[] zahlen) {
        int summe = berechneSumme(zahlen);
        return (double) summe / zahlen.length;
    }

    // Methode zur Berechnung der Anzahl postivier Werte
    public static int berechneAnzahlPositiv(int[] zahlen) {
        int anzahlPositiv = 0;
        for (int zahl : zahlen) {
            if (zahl > 0) {
                anzahlPositiv++;
            }
        }
        return anzahlPositiv;

    }
}
