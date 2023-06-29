package de.lubowiecki.oca.playground;

public class DatenTypTest3 {

    public static void main(String[] args) {

        byte b1 = 10;
        byte b2 = 20;

        // Zum rechnen werden die Datentypen angeglichen, und mind. zu int angehoben
        // byte sum = b1 + b2; // Error. sum muss ein int sein
        int sum = b1 + b2;

        // sind die Typen unterschiedlich, wird zum gößeren angehoben
        double d = 10.2;
        double sum2 = d + b1;

        b1 += 10; // b1 = (byte)(b1 + 10);
        b1++; // b1 = (byte)(b1 + 1);

        b1 = 125;
        System.out.println(b1++); // postfix, Wert wird nach der Ausgabe angehoben
        System.out.println(++b1); // prefix, Wert wird vor der Ausgabe angehoben
        System.out.println(b1++); // Überlauf
        System.out.println(b1);

        System.out.println();

        b1 = -125;
        System.out.println(b1--); // postfix, Wert wird nach der Ausgabe ermäßigt
        System.out.println(--b1); // prefix, Wert wird vor der Ausgabe ermäßigt
        System.out.println(b1--);
        System.out.println(b1--); // Unterlauf
        System.out.println(b1);


        int[][] arr; // Deklaration. Es wird aber noch kein Array erzeugt und kein Speicher reserviert

    }

}
