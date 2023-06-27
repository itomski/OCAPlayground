package de.lubowiecki.oca.playground;

public class VariablenTest {

    // Instanzvariable, gehören den Objekt
    private String output;

    // Klassenvariablen, gehören der Klasse
    private static String zahl;

    public static void main(String[] args) {

        // Lokale Variablen, sind nur während der ausführung der Methode verfügbar

        // Alle lokalen (in einer Methode deklarierte) Variablen müssen vor der Verwendung initialisiert werden

        // int i : Variablen Deklaration
        // = 10 : Initialisierung, zuweisung eines Startwertes
        int i = 10;
        System.out.println(i);

        int j; // primitiv (byte, short, int, char, long, float, double, boolean)
        // System.out.println(j); // Kompiler-Fehler, es können nur initialisierte Variablen verwendet werden

        Object o = new Object(); // komplex (jede Klasse definiert einen eigenen komplexen Typ)

        // byte < short < int < long < float < double
        // byte, short, int, long = Ganzzahlen
        // float, double = Zahlen mit Dezimalpunkt

        // Ganzzahlen sind per default int
        // Zahlen mit Dezimalpunkt sind per default double

        byte b = 10;
        // b = 200; // 200 ist zu groß
        int k = b; // primitive widening - kleinerer Typ wird erweitert

        // float f = 100.0; // Kompiler-Error, 100.0 ist per default double, double ist zu groß für float
        float f = 100.0f;

        long l1 = 100; // 100 ist ein int, primitive widening von int zu long
        long l2 = 100l; // hier wird direkt ein long verwendet

        // Ab Java 9 möglich
        var l3 = 100l; // der Datentyp wird beim Kompilieren automatisch ermittelt
        var d1 = 100.0;

        // l3 = 100.0; // Error. Nach der initialisierung steht der Typ fest... hier long

    }
}
