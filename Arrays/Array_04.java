package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> personen = new ArrayList<>();
        boolean eingabeFertig = false; // Wenn der Nutzer quasi auf Enter drückt.

        do {
            System.out.print("Name hinzufuegen: ");
            // Wenn der Nutzer ohne einen Namen einzugeben, auf Enter drückt, 
            // wird es gestoppt!
            String name = scanner.nextLine();

            if (name.equals("")) {
                eingabeFertig = true;
            } else {
                personen.add(name);
            }
        } while (!eingabeFertig);
        System.out.println("-------");
        for (int i = 0;
                i < personen.size();
                i++) {
            System.out.println("Hallo " + personen.get(i));
        }
    }
}
