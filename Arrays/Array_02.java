package arrays;

public class Array_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Wetterstation
        // Eine Wetterstation hat für 14 Tage folgende Temperaturwerte aufgenommen.

        // Tag:         1  2  3  4  5  6  7  8  9 10 11 12 13 14
        // Temperatur: 12 14  9 12 15 16 15 15 11  8 13 13 15 12
        // 1. Speichere die folgende Tabelle mit einem geeigneten Datentyp.
        // 2. Schreibe ein Programm, welches die Durchschnittstemperatur für die zwei Wochen bestimmt.
        // 3. Schreibe ein Programm, welches die maximale und minimale Temperatur ausgibt.
        // 4. Schreibe ein Programm, welches die beiden aufeinanderfolgenden Tage angeben kann,
        // an denen es den größten Temperaturumschwung gab.
        // 4. Schreibe ein Programm, welches die Tabelle schön tabellarisch auf der Konsole ausgibt.
        // ------------------------------------------------------------------------------------------
        // ------------------------------------------------------------------------------------------
        System.out.println("--------------------------------------------------- Wetterstation BBQ ----------------------------------------------------");
        System.out.println();
        // 1. Tage & Temparaturen 
        int[] tage = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int[] tempTage = {12, 14, 9, 12, 15, 16, 15, 15, 11, 8, 13, 13, 15, 12};

        // 2. Durchschnittstemperatur
        int average = 0;
        for (int i = 0; i < tempTage.length; i++) {
            average = average + tempTage[i];
        }
        average = average / tempTage.length;
        System.out.println("Durchschnittstemperatur:\t" + average + " Grad Celsius.");
        /* int summe = 0;
        for (int temp : tempTage) {
            summe += temp;
        }
        int durchschnitt = summe / tempTage.length;
        System.out.println("Durchschnittstemperatur:\t" + durchschnitt + " Grad Celsius.");*/

        // 3. Maximale & minimale Temparatur
        int maxTemp = tempTage[0];
        int minTemp = tempTage[0];
        /*for (int temp : tempTage) {
            if (temp > maxTemp) {
                maxTemp = temp;
            }
            if (temp < minTemp) {
                minTemp = temp;
            }
        }*/
        for (int i = 0; i < tempTage.length; i++) {
            if (maxTemp < tempTage[i]) {
                maxTemp = tempTage[i];
            }
            if (minTemp > tempTage[i]) {
                minTemp = tempTage[i];
            }
        }
        System.out.println("Maximale Temparatur:\t\t" + maxTemp + " Grad Celsius.");
        System.out.println("Minimale Temparatur:\t\t" + minTemp + " Grad Celsius.");

        // 4. Groesster Temparaturumschwung
        // Variable zur Speicherung des groessten Umschwungs
        int bigChange = 0;
        // Variable zur Speicherung der 1. Tages mit dem groessten Umschwung
        int tag1 = 0;
        for (int i = 0; i < tempTage.length; i++) {
            int newBigChange = 0;
            if ((i + 1) < tempTage.length) {
                if (tempTage[i] < tempTage[i + 1]) {
                    newBigChange = tempTage[i + 1] - tempTage[i];
                }
                if (tempTage[i] >= tempTage[i + 1]) {
                    newBigChange = tempTage[i] - tempTage[i + 1];
                }
                if (bigChange < newBigChange) {
                    bigChange = newBigChange;
                    tag1 = i;
                }
            }
        }
        if (bigChange != 0) {
            System.out.println("Max. Temperaturunterschied:\t" + bigChange + " Grad Celsius, zwischen Tag " + (tag1 + 1) + " & Tag " + (tag1 + 2) + ".");
        } else {
            System.out.println("Alle Temperaturen sind gleich.");
        }
        System.out.println();
        // 5. Tabellarische Ausgabe
        System.out.println("----------------------------------------------- Wetterbericht von 2 Wochen -----------------------------------------------");
        System.out.println();
        System.out.print("Tag: \t\t");
        for (int i = 0; i < tage.length; i++) {
            System.out.print(tage[i] + "\t");
        }
        System.out.println();
        System.out.print("Temperatur: \t");
        for (int j = 0; j < tempTage.length; j++) {
            System.out.print(tempTage[j] + "\t");
        }
        System.out.println();
        System.out.println();
    }
}
