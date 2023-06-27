package de.lubowiecki.oca.playground;

public class KlassenUndInstanzMethoden {

    // Instanzvariable
    private String text;

    // Klassenvariable
    private static String andererText;


    // Klassenmethode
    public static void main(String[] args) {

        // Statische Methoden können direkt nur statische Variblen und statische Methoden
        andererText = "Hallo static";
        machWasGanzAnderes();

        // machWas(); // Nicht verfügbar, zuerst muss ein Objekt gebaut werden
        // text = "Hallo instanz"; // Nicht verfügbar, zuerst muss ein Objekt gebaut werden

        KlassenUndInstanzMethoden obj = new KlassenUndInstanzMethoden();
        // Zugriff erfolgt über das Objekt
        obj.machWas();
        obj.text = "Hallo instanz";

    }

    // Instanzmethode
    public void machWas() {
        System.out.println("machWas");

        // Hat einen direkten Zugriff auf Instanzmethoden und Instanzvariablen
        text = "Hallo instanz ... machWas"; // this.text
        machWasAnderes(); // this.machWasAnderes();

        machWasGanzAnderes();

    }

    public void machWasAnderes() {
        System.out.println("machWasAnderes");
    }

    // Klassenmethode
    public static void machWasGanzAnderes() {
        System.out.println("machWasGanzAnderes");
    }
}
