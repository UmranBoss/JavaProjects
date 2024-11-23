# Funktionsweise der Codes

## Array_01
### Erstellen und Verwalten einer Namenliste in Java mit Benutzereingabe und Ausgabe
#### Aufgabe
Das Programm ermöglicht es dem Benutzer, eine Liste von Namen einzugeben, die dann mit einer Begrüßung ("Hallo [Name]") ausgegeben wird. Die Eingabe wird gestoppt, wenn der Benutzer einfach die Eingabetaste drückt, ohne einen Namen einzugeben.
#### Code-Erklärung:
1. Deklaration von Variablen:
Scanner scanner = new Scanner(System.in); – Ein Scanner-Objekt wird erstellt, um Benutzereingaben von der Konsole zu lesen.
ArrayList<String> personen = new ArrayList<>(); – Eine ArrayList wird erstellt, um die Namen der Personen zu speichern, die der Benutzer eingibt.
boolean eingabeFertig = false; – Eine Flag-Variable, die steuert, wann der Eingabeprozess beendet ist.
2. Eingabeschleife (do-while):
Die Schleife fragt den Benutzer nach einem Namen, solange der Benutzer keinen leeren String eingibt.
System.out.print("Name hinzufuegen: "); fordert den Benutzer auf, einen Namen einzugeben.
String name = scanner.nextLine(); liest die Benutzereingabe.
Wenn der Benutzer einen leeren String eingibt (also einfach Enter drückt), wird eingabeFertig auf true gesetzt, und die Schleife wird beendet.
Wenn der Benutzer einen Namen eingibt, wird dieser Name der ArrayList personen hinzugefügt.
3. Ausgabe der Namen:
Nachdem die Eingabe beendet ist, gibt der Code eine Begrüßung für jede Person aus der Liste aus.
for (int i = 0; i < personen.size(); i++) { ... } iteriert über die gespeicherten Namen und gibt "Hallo [Name]" für jede Person aus.

## Array_02
### Wetterstation: Temperaturauswertung und Analyse für 14 Tage
#### Aufgabe
In diesem Java-Programm geht es darum, die Temperaturen einer Wetterstation für einen Zeitraum von 14 Tagen zu speichern und auszuwerten. Der Code führt mehrere Berechnungen und Auswertungen auf den Temperaturdaten durch und gibt die Ergebnisse auf der Konsole aus.
#### Code-Erklärung:
1. Deklaration der Arrays:
Es werden zwei Arrays erstellt:
tage: Ein Array, das die Tage von 1 bis 14 speichert.
tempTage: Ein Array, das die gemessenen Temperaturen für jeden dieser Tage enthält.
2. Berechnung der Durchschnittstemperatur:
Die Durchschnittstemperatur wird berechnet, indem alle Werte im tempTage-Array summiert und anschließend durch die Anzahl der Tage (14) geteilt werden.
Das Ergebnis wird als Durchschnittstemperatur ausgegeben.
3. Bestimmung der maximalen und minimalen Temperatur:
Das Programm sucht nach der maximalen und minimalen Temperatur, indem es alle Werte im Array tempTage durchläuft und den höchsten sowie den niedrigsten Wert ermittelt.
Diese Werte werden am Ende des Programms angezeigt.
4. Berechnung des größten Temperaturumschwungs:
Der größte Temperaturumschwung wird ermittelt, indem der Unterschied zwischen den Temperaturen von aufeinanderfolgenden Tagen berechnet wird.
Das Programm findet den größten Unterschied und gibt an, an welchem Tag dieser Umschwung stattgefunden hat.
5. Tabellarische Ausgabe der Daten:
Zum Abschluss gibt das Programm die Temperaturen der 14 Tage in einer tabellarischen Form aus. Dabei wird zuerst die Tagesnummer (tage) und anschließend die Temperaturen für diese Tage (tempTage) in einer übersichtlichen Tabelle dargestellt.

