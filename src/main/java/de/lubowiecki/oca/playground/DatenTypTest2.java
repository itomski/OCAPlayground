package de.lubowiecki.oca.playground;

import java.time.LocalDate;

public class DatenTypTest2 {

    public static void main(String[] args) {

        String s1 = "Hallo Welt"; // Literal: Landet im String Literal Pool
        String s2 = "Hallo Welt"; // Referenz auf das Objekt im Pool
        String s3 = "Hallo Welt"; // Referenz auf das Objekt im Pool
        // 1 String Objekt im Pool und 3 Referenzen auf dem Stack

        System.out.println(s1 == s2); // Refernzvergleich: Zeigt die Referenz auf das gleiche Objekt?
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s2)); // Wertevergleich
        System.out.println(s1.equals(s3));


        System.out.println("---------------------");

        s1 = new String("Hallo Welt"); // Landet NICHT im Pool
        s2 = new String("hallo welt"); // Neues Objekt
        s3 = new String("Hallo Welt"); // Neues Objekt
        // 3 String Objekte auf dem Heap und 3 Referenzen auf dem Stack

        System.out.println(s1 == s2); // Refernzvergleich: Zeigt die Referenz auf das gleiche Objekt?
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s2)); // Wertevergleich (berücksichtigt Groß- Kleinschreibung)
        System.out.println(s1.equalsIgnoreCase(s2)); // Wertevergleich (berücksichtigt keine Groß- Kleinschreibung)
        System.out.println(s1.equals(s3));

        // Strings sind nicht veränderbar (IMMUTABLE)
        s1 = s1 + "..."; // Es wird ein neuer String gebaut und auf die Referenz zugewiesen

        System.out.println();

        LocalDate heute = LocalDate.now();
        LocalDate morgen = LocalDate.of(2023, 6, 29);

        // Referenzvergleich: Ist es das gleich Objekt auf dem Heap?
        System.out.println(heute == morgen.minusDays(1));

        // Wertvergleich: Hat es den gleichen Zustand?
        System.out.println(heute.equals(morgen.minusDays(1)));

        int i = 10;
        int j = 10;
        System.out.println(i == j); // Wertevergleich
        // System.out.println(i.equals(j)); // Error: primitive Datentypen haben keine Methoden!!!!
    }
}
