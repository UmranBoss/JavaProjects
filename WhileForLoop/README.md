# Funktionsweise der Codes

## WhileForLoop_01
### Benutzerdefinierte Sequenz mit Hervorhebung:
#### Aufgabe
Dieser Code erstellt basierend auf Benutzereingaben eine Zahlensequenz mit variablen Start-, End- und Schrittgrößen. Er ermöglicht es, eine bestimmte Zahl innerhalb der Sequenz hervorzuheben, während Standardregeln wie "BINGO" und "JACKPOT" integriert sind.
#### Code-Erklärung
1. Begrüßung und Scanner-Initialisierung
Der Benutzer wird mit einer Begrüßung willkommen geheißen.
Ein Scanner wird erstellt, um Benutzereingaben zu lesen.
2. Eingabe des Start- und Endwerts
Der Benutzer gibt die Start- (min) und Endwerte (max) der Sequenz ein.
Validierung: Der Endwert muss größer als der Startwert sein. Bei ungültiger Eingabe wird eine Fehlermeldung ausgegeben, und der Benutzer wird erneut zur Eingabe aufgefordert.
3. Berechnung der Differenz
Die Differenz zwischen dem Endwert und dem Startwert wird berechnet (differenceStep), um Schrittgrößen zu validieren.
4. Eingabe und Validierung der Schrittgröße
Der Benutzer gibt eine Schrittgröße (step) ein.
Validierung: Die Schrittgröße muss größer als 0 sein und ein Teiler der Differenz (differenceStep).
Wenn ungültig, werden dem Benutzer alle möglichen gültigen Schrittgrößen angezeigt (Berechnung über printValidSteps).
5. Eingabe und Validierung der Highlight-Zahl
Der Benutzer gibt eine Zahl (highlight) ein, die hervorgehoben werden soll.
Validierung: Diese Zahl muss innerhalb der Sequenz zwischen min und max liegen.
6. Erzeugung der Zahlensequenz
Die Sequenz wird durch eine while-Schleife von min bis max in Schritten von step generiert.
Drei Szenarien für Highlights:
Standard-Highlight (20): Zeigt BINGO! an.
Benutzerdefinierte Highlight-Zahl: Zeigt JACKPOT! an.
Kombination beider: Zeigt BINGO & JACKPOT!!!.
Highlight-Nummer, die zwischen den Schritten liegt, wird mit ihrem Abstand zum vorherigen Schritt ausgegeben.
7. Methode zur Berechnung gültiger Schrittgrößen
printValidSteps berechnet und zeigt alle Divisoren der Differenz (differenceStep), die als gültige Schrittgrößen dienen.
Besonderheiten
Farbcodierte Ausgaben:
Fehlermeldungen und Highlights sind farblich hervorgehoben (ANSI-Escape-Codes).
Benutzerfreundliche Validierungen:
Jede Eingabe wird auf Gültigkeit geprüft und bei Fehlern erneut abgefragt.
Flexibilität:
Der Code ermöglicht beliebige Start-, End-, Schritt- und Highlight-Zahlen innerhalb der definierten Regeln.
