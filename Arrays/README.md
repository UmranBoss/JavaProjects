# Funktionsweise der Codes

## Array_01
### Erstellen und Verwalten einer Namenliste in Java mit Benutzereingabe und Ausgabe

#### Aufgabe
Das Programm ermöglicht es dem Benutzer, eine Liste von Namen einzugeben, die dann mit einer Begrüßung ("Hallo [Name]") ausgegeben wird. Die Eingabe wird gestoppt, wenn der Benutzer einfach die Eingabetaste drückt, ohne einen Namen einzugeben.

#### Die wichtigsten Schritte im Code sind:

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
