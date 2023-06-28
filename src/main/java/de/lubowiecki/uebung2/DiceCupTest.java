package de.lubowiecki.uebung2;

import java.util.Arrays;

public class DiceCupTest {

    public static void main(String[] args) {

        DiceCup cup = new DiceCup();
        System.out.println(cup.roll());

        System.out.println();

        cup = new DiceCup(100);
        System.out.println(cup.roll());

        System.out.println();

        cup = new DiceCup(10);
        int[] res = cup.roll(100);
        // String resStr = Arrays.toString(res);
        // System.out.println(resStr);

        for(int i : res) {
            System.out.print(i + ", ");
        }

        System.out.println();

        System.out.println(cup.stats(res));
    }

}
