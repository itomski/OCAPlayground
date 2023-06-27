package de.lubowiecki.oca.playground.zufallszahlen;

import java.util.Random;

public class Generator1 {

    private Random rand = new Random();

    private int base;

    public Generator1(int base) { // Konstruktor
        this.base = base;
    }

    public int generate() {
        // return ((int)(Math.random() * base)) + 1;
        return rand.nextInt(base) + 1;
    }
}
