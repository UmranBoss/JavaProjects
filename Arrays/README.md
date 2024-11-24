# Funktionsweise der Codes

## Array_01
### Berechnung und Analyse von Zahlen mit Arrays
#### Aufgabe
Die erste Aufgabe berechnet die Quadratzahlen für die Positionen eines Arrays.
Die zweite Aufgabe ermittelt verschiedene Werte (Summe, Minimum, Maximum, Mittelwert und die Anzahl positiver Zahlen) basierend auf 10 vom Benutzer eingegebenen Zahlen.
#### Code-Erklärung:
1. Deklaration und Initialisierung
Array für Quadratzahlen:
int[] aiQuadratZahlen = new int[nAnzahlElemente];
Array aiQuadratZahlen mit 10 Elementen wird erstellt.
Füllen mit Quadratzahlen:
aiQuadratZahlen[i] = i * i;
Array wird mit den Quadratzahlen der Indizes (0 bis 9) befüllt.
2. Ausgabe der Quadratzahl von 5
Quadratzahl von 5 ausgeben:
System.out.println("Die Quadratzahl von 5 lautet: " + aiQuadratZahlen[5]);
Gibt 25 aus (da 5 * 5 = 25).
3. Eingabe von 10 Zahlen durch den Benutzer
Scanner für Benutzereingabe:
Scanner scanner = new Scanner(System.in);
Scanner wird verwendet, um Zahlen vom Benutzer zu lesen.
Speichern der Eingabewerte:
zahlen[i] = scanner.nextInt();
10 Zahlen werden in das Array zahlen gespeichert.
4. Berechnungen und Ausgaben
Berechnungen (Summe, Minimum, Maximum, Mittelwert, positive Werte):
Methoden wie berechneSumme(zahlen), berechneMinimum(zahlen), etc., werden verwendet.
Ergebnisse werden in der Konsole ausgegeben.
5. Methoden für Berechnungen
Summe berechnen:
summe += zahl;
Summiert alle Zahlen im Array.
Minimum berechnen:
if (zahl < min)
Sucht die kleinste Zahl.
Maximum berechnen:
if (zahl > max)
Sucht die größte Zahl.
Mittelwert berechnen:
return (double) summe / zahlen.length;
Berechnet den Mittelwert der Zahlen.
Anzahl positiver Zahlen zählen:
if (zahl > 0)
Zählt die positiven Zahlen im Array.

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

## Array_03
### Befüllen und Ausgeben einer Zahlreihe mit einer Schleife
#### Aufgabe
Das Programm erstellt ein Array mit 1000 Ganzzahlen und füllt dieses Array mit Zahlen von 1 bis 1000. Diese Zahlen werden dann mit einer Schleife in der Konsole ausgegeben. Der Code bietet eine einfache Möglichkeit, eine große Anzahl von Zahlen zu generieren und darzustellen.
#### Code-Erklärung:
1. Deklaration des Arrays:
int[] zahlenreihe = new int[1000];
Hier wird ein Array mit dem Namen zahlenreihe vom Typ int (Ganzzahl) erstellt, das 1000 Elemente speichern kann. Alle Werte im Array sind zunächst mit dem Standardwert 0 initialisiert.
2. Schleife zum Befüllen des Arrays:
for (int i = 0; i < zahlenreihe.length; i++) {
Eine for-Schleife wird verwendet, um durch jedes Element des Arrays zu iterieren. Die Schleife startet bei i = 0 und läuft, solange i kleiner ist als die Länge des Arrays (zahlenreihe.length), also 1000. Die Schleife wird also insgesamt 1000-mal durchlaufen.
3. Füllen des Arrays mit Zahlen:
zahlenreihe[i] = i + 1;
In jedem Schleifendurchgang wird das Element des Arrays an der Position i mit dem Wert i + 1 belegt. Das bedeutet, dass an der ersten Stelle (i = 0) der Wert 1 gespeichert wird, an der zweiten Stelle (i = 1) der Wert 2 und so weiter bis i = 999, wo der Wert 1000 gespeichert wird.
4. Ausgabe des aktuellen Werts:
System.out.println(zahlenreihe[i]);
Nach jedem Setzen des Wertes im Array gibt System.out.println() den Wert des aktuellen Elements des Arrays an der Position i in der Konsole aus. Es wird also die Zahl von 1 bis 1000 nacheinander ausgegeben.

## Array_04
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


