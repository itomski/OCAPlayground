package de.lubowiecki.oca.playground;

// Alle Klassen aus java.lang sind automatisch importiert

import java.time.LocalDate;

/**
 * ...
 */
public class Start { // Klasse

    // End-of-Line-Comments
    /* Multi-Line-Comments */
    /** Java-Doc-Comments */

    // PascalCase: RandomNumGenerator wird für Klassen- und Interfacenamen verwendet
    // CamelCase: firstName wird für Variablen und Methodennamen verwendet
    // SnakeCase: max_value wird in Java nicht verwendet
    // ScreamingSnakeCase: MAX_VALUE wird für Konstanten verwendet

    // Methoden sind Funktionen die zu einer Klasse gehören
    // freie Funktionen gibt es in Java nicht

    // public: Access-Modifier
    // static: Methode ist ohne ein Objekt/Instanz von Start verwendbar
    // void: hat kein Rückgabewert
    // main: Name der Methode. main kann automatisch gestartet werden = Einstiegspunkt
    // (String[] args): Programm-Argumente, die beim Start des Programms vorgegeben werden

    private int zahl = 15; // Instanzvariable, gehört dem Objekt

    private static int andereZahl = 100; // Klassenvariable, gehört dem Bauplan


    // 0 Das, 1 ist, 2 das
    public static void /* bla bla bla */ main(String[] args) { // (Klassen-) Methode, werden auf dem Bauplan ausgeführt

        System.out.println("Hallo Welt! " + LocalDate.now()); // sout+Enter

        for(String s : args) { // Schleife
            System.out.println(s); // sout+Enter
        }

        System.out.println("---------------");

        // Instanzierung
        // p1 ist eine (lokale) Variable
        Person p1 = new Person(); // new es wird aus der Klasse Person ein neues Objekt gebaut
        Person p2 = new Person();
        Person p3 = new Person();

        p1.setVorname("Peter");
        p1.setNachname("Parker");

        p2.setVorname("Bruce");
        p2.setNachname("Banner");

        p3.setVorname("Carol");
        p3.setNachname("Danvers");

        System.out.println(p1.getVorname() + " " + p1.getNachname());
        System.out.println(p2.getVorname() + " " + p2.getNachname());
        System.out.println(p3.getVorname() + " " + p3.getNachname());

    }

    /**
     * Ändert einen Text in Großbuchstaben
     * @param in Der zu ändernde Text
     * @return Eingabe in Großbuchstaben
     */
    public String machWas(String in) { // Instanzmethode, werden auf dem Objekt ausgeführt
        return in.toUpperCase();
    }
}
