package de.lubowiecki.oca.playground.zufallszahlen;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        Generator1 gen1 = new Generator1(6);
        System.out.println(gen1.generate());
        System.out.println(gen1.generate());
        System.out.println(gen1.generate());
        System.out.println(gen1.generate());

        System.out.println();

        Generator1 gen2 = new Generator1(100);
        // Der Zustand der base-Variable wird für das Erzeugen der Zufallszahlen verwendet
        System.out.println(gen2.generate());
        System.out.println(gen2.generate());
        System.out.println(gen2.generate());
        System.out.println(gen2.generate());

        System.out.println();

        // Generator2 gen3 = new Generator2();
        System.out.println(Generator2.generate(6));
        System.out.println(Generator2.generate(6));
        System.out.println(Generator2.generate(6));
        System.out.println(Generator2.generate(6));

        // Utilityklassen - Haben nur statische Methoden
        // Arrays arr = new Arrays(); // nicht möglich

        int[] zahlen = {7,9,22,18,1,5};
        Arrays.sort(zahlen); // sort ist eine statische Methode, verarbeitet Parameter
        System.out.println(Arrays.toString(zahlen)); // Arrays.toString liefert den Inhalt des Arrays als eine Zeichenkette

    }
}
