package de.lubowiecki.oca.playground.zufallszahlen;

import java.util.Random;

public class Generator2 {

    private static Random rand = new Random();

    private Generator2() { // Kann nicht von anderen verwendet werden
    }

    public static int generate(int base) {
        // return ((int)(Math.random() * base)) + 1;
        return rand.nextInt(base) + 1;
    }
}
