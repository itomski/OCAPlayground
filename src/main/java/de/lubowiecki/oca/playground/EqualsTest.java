package de.lubowiecki.oca.playground;

import java.util.Objects;

public class EqualsTest {
    public static void main(String[] args) {

        Fahrzeug f1 = new Fahrzeug("VW", "Polo", "HH:AB123");
        Fahrzeug f2 = new Fahrzeug("Ford", "Fiesta", "HH:XY357");
        Fahrzeug f3 = new Fahrzeug("Ford", "Fiesta", "HH:XY357");

        System.out.println(f1 == f2); // Ist es das gleiche Objekt?
        System.out.println(f1.equals(f2)); // Hat es den gleiche Zustand?

        System.out.println();

        // Sollen Objekte eigener Klassen verglichen werden können,
        // muss equals (und hashCode) überschrieben werden
        // equals und hashCode werden immer zusammen überschrieben

        System.out.println(f2 == f3); // Ist es das gleiche Objekt?
        System.out.println(f2.equals(f3)); // Hat es den gleiche Zustand?
    }
}

class Fahrzeug {

    private String marke;

    private String typ;

    private String kennzeichen;

    public Fahrzeug(String marke, String typ, String kennzeichen) {
        this.marke = marke;
        this.typ = typ;
        this.kennzeichen = kennzeichen;
    }

    public String getMarke() {
        return marke;
    }

    public String getTyp() {
        return typ;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    @Override
    public String toString() { // Konvertiert das Objekt in einen String
        return "Fahrzeug{" +
                "marke='" + marke + '\'' +
                ", typ='" + typ + '\'' +
                ", kennzeichen='" + kennzeichen + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fahrzeug fahrzeug = (Fahrzeug) o;
        return Objects.equals(marke, fahrzeug.marke) && Objects.equals(typ, fahrzeug.typ) && Objects.equals(kennzeichen, fahrzeug.kennzeichen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marke, typ, kennzeichen);
    }
}



