# Funktionsweise der Codes

## IfElse_01
### Vergleich von drei Werten (a, b, c)
#### Aufgabe
Dieser Code analysiert die Beziehung zwischen drei Zahlen (a, b, **c) und gibt eine entsprechende Beschreibung aus. Er nutzt verschachtelte if-else-Anweisungen, um die möglichen Beziehungen zu prüfen.
#### Code-Erklärung
1. Initialisierung der Variablen:
Drei Variablen (a, b, c) werden mit Werten initialisiert. Diese Werte sollen miteinander verglichen werden.
2. Ausgabe der Eingabewerte:
Die Werte der Variablen werden auf der Konsole angezeigt.
3. Vergleich der Werte (if-else-Logik):
Prüfung, ob a gleich b ist:
Wenn ja:
Weitere Prüfungen, ob b auch gleich c ist.
Ergebnisse: Alle gleich, a und b kleiner/größer als c.
Falls a nicht gleich b ist:
Weitere Vergleiche zwischen a, b und c.
Kombinationen wie a = c, b = c oder alle drei unterschiedlich werden geprüft.
4. Ausgabe der Beziehungen:
Basierend auf den Vergleichen wird die Beziehung der Werte in einer lesbaren Form ausgegeben:
Alle gleich: a = b = c.
Zwei gleich, einer größer oder kleiner.
Alle unterschiedlich: Werte in auf- oder absteigender Reihenfolge.
5. Struktur der Vergleiche:
Verschachtelte if-else-Bedingungen ermöglichen eine detaillierte Prüfung aller Kombinationen.
6. Endergebnis:
Die Beziehungen zwischen den drei Werten werden vollständig analysiert und ausgegeben.

[Klicke hier, um den PAP zum Code einzusehen!](https://github.com/UmranBoss/JavaProjects/blob/main/IfElse/PAP/PAP_VergleichVon3Werten.pdf)

## IfElse_02
### Prüfung des Disco-Einlasses basierend auf Alter, Geschlecht und Tanzfähigkeiten
#### Aufgabe
In diesem Java-Programm wird überprüft, ob eine Person aufgrund ihres Alters, Geschlechts und ihrer Tanzfähigkeiten in die Disco eingelassen wird. Der Benutzer wird nach verschiedenen Informationen gefragt, und je nach Antwort erhält er eine positive oder negative Rückmeldung.
#### Code-Erklärung
1. Begrüßung und Scanner-Objekt:
System.out.println(): Gibt Text aus.
Scanner survey = new Scanner(System.in);: Erstellt ein Scanner-Objekt für Benutzereingaben.
2. Benutzereingaben:
name = survey.nextLine();, age = survey.nextLine();, sex = survey.nextLine();: Liest den Namen, das Alter und das Geschlecht.
3. Bedingung für Alter und Geschlecht:
if (age.equalsIgnoreCase("yes") && (sex.equalsIgnoreCase("female") || sex.equalsIgnoreCase("male"))): Überprüft, ob der Benutzer 18 oder älter ist und ein Geschlecht angegeben hat.
4. Tanzfähigkeiten überprüfen:
dance = survey.nextLine();: Fragt nach Tanzfähigkeiten.
if (dance.equalsIgnoreCase("yes")): Wenn der Benutzer tanzen kann, gibt es eine positive Rückmeldung, sonst eine negative.
5. Verweigerung bei Minderjährigkeit:
Wenn der Benutzer unter 18 ist, erhält er eine humorvolle Nachricht.