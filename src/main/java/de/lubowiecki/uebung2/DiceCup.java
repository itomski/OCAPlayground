package de.lubowiecki.uebung2;

import java.util.Random;

public class DiceCup {

    private Random rand = new Random();

    // Muss spätestens im Konstruktor zugeweisen werden und kann sich nachträglich nicht mehr ändern
    private final int size;

    public DiceCup(int size) {
        this.size = size;
    }

    public DiceCup() {
        this(6);
    }

    /* Default-Konstruktor
    public DiceCup() {
        super();
    }
    */

    public int roll() {
        return rand.nextInt(size) + 1;
    }

    public int[] roll(int num) {

        int[] results = new int[num]; // Baut ein leeres Array mit vorgegebener Größe

        for(int i = 0; i < results.length; i++) {
            results[i] = roll();
        }

        return results;
    }

    public String stats(int[] results) {

        int[] stats = new int[size];

        for(int i = 0; i < results.length; i++) {
            int index = results[i]-1;
            stats[index]++;
        }

        return createOutput(stats);
    }

    private String createOutput(int[] stats) {

        String output = "";

        for(int i = 0; i < stats.length; i++) {
            output += stats[i] + " mal " + (i + 1) + "\n";
        }

        return output;
    }
}
