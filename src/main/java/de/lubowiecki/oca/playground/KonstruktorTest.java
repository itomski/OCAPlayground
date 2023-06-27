package de.lubowiecki.oca.playground;

import java.time.Year;

public class KonstruktorTest {

    public static void main(String[] args) {

        Autor a1 = new Autor("Carol", "Danvers");
        System.out.println(a1.getVorname() + " " + a1.getNachname());
        System.out.println(a1); // toString wird automatisch verwendet


        Buch b1 = new Buch("Kochen ohne Fett", "Bla bla bla...", "1234-2345-34567", 100, 2020, a1);
        System.out.println(b1);

        Buch b2 = new Buch("Kochen ohne Fett", "Bla bla bla...", "1234-2345-34567");
        System.out.println(b2);

        Buch b3 = new Buch();
        System.out.println(b3);

        System.out.println();

        // zwei getrennte Objekte
        String s1 = new String("Hallo Welt");
        String s2 = new String("Hallo Welt");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        // String
        String s3 = new String(); // Leerer String

        s3 = new String("ABC");

        char[] zeichen = {'X', 'Y', 'Z'};
        s3 = new String(zeichen);

        s3 = new String(zeichen, 1, 2);
    }
}

class Buch {

    private String titel;

    private String beschreibung;

    private String isbn;

    private int seiten;

    private int erscheinungsJahr;

    private Autor autor;

    // Wird kein Konstruktor definiert, wird von Java ein Parameterloser Default-Konstruktor bereitgestellt

    public Buch(String titel, String beschreibung, String isbn, int seiten, int erscheinungsJahr, Autor autor) {
        this.titel = titel;
        this.beschreibung = beschreibung;
        this.isbn = isbn;
        this.seiten = seiten;
        this.erscheinungsJahr = erscheinungsJahr;
        this.autor = autor;
    }

    // Hier wird ein Konstruktor überladen
    // Überladen: gleicher Name aber andere Parameterliste
    public Buch(String titel, String beschreibung, String isbn) {
        this.titel = titel;
        this.beschreibung = beschreibung;
        this.isbn = isbn;
        this.seiten = 100;
        this.erscheinungsJahr = Year.now().getValue(); // Year.now() aktuelle Jahreszahl
    }

    public Buch() {
        /*
        this.titel = "Unbekannt";
        this.beschreibung = "Unbekannt";
        this.isbn = "Unbekannt";
        this.seiten = 100;
        this.erscheinungsJahr = Year.now().getValue(); // Year.now() aktuelle Jahreszahl
        */

        // Ein Konstruktor kann einen anderen Konstruktor verwenden
        this("Unbekannt", "Unbekannt", "Unbekannt");

    }


    @Override
    public String toString() { // Konvertiert ein Buch-Objekt in eine Zeichenkette
        return "Buch{" +
                "titel='" + titel + '\'' +
                ", beschreibung='" + beschreibung + '\'' +
                ", isbn='" + isbn + '\'' +
                ", seiten=" + seiten +
                ", erscheinungsJahr=" + erscheinungsJahr +
                ", autor=" + autor +
                '}';
    }
}

class Autor {

    private final String vorname; // final = Zustand der Variable kann nachträglich nicht mehr geändert werden
    private final String nachname;

    public Autor(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    // Ist hier keine toString-Methode definiert, wird die aus Object verwendet
    @Override
    public String toString() {
        /*
        return "Autor{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                '}'; */

        return vorname + " " + nachname;
    }
}
