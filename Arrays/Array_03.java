package arrays;

public class Array_03 {

    public static void main(String[] args) {

        int[] zahlenreihe = new int[1000];

        // Zum Befüllen des Arrays z.B.
        // zahlenreihe[0} = 1;
        // zahlenreihe[1] = 2;
        // zahlenreihe[3] = 3;
        // etc.
        // Mit Schleife umsetzen, da es einfacher & essentiell ist
        // hier wird zahlenreihe.length geschrieben, da die Größe [1000] sich aendern kann
        for (int i = 0; i < zahlenreihe.length; i++) {
            // das [i] steht für alle Werte von 0-999
            // i + 1, denn wir wollen bei 1 starten, siehe: zahlenreihe[0} = 1
            zahlenreihe[i] = i + 1; // Um Quadratzaheln anzuzeigen, dann: zahlenreihe[i] = i * i
            System.out.println(zahlenreihe[i]);
        }
    }
}
