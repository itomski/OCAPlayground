package de.lubowiecki.oca.playground;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {

        // Jedes Array hat eine fixe Größe
        int[] arr1 = new int[10]; // Ein leeres (mit Standardwert 0 gefüllt) Array mit 10 Plätzen für int-Werte

        int[] arr2 = {5,7,8,15,22}; // Ein Array gefüllt mit Werten. Funktioniert nur bei Deklaration eines neuen Arrays
        // arr2 = {22,18,99,7}; // Error. Array bereits vorhanden

        arr2 = new int[]{22,18,99,7}; // Erzeugt ein neues Array und weist es auf die alte Referenz zu

        double[] arr3 = new double[5]; // Ein leeres (mit Standardwert 0.0 gefüllt) Array mit 5 Plätzen für double-Werte

        System.out.println(arr3[2]); // Liest den Wert auf dem index 2 (3. Wert, da Index bei 0 startet)
        arr3[2] = 10.5; // 10.5 wird auf den Index 2 abgelegt
        System.out.println(Arrays.toString(arr3)); // Zeigt den Inhalt des Arrays

        System.out.println();

        String[] namen = {"Peter", "Bruce", "Natasha", "Carol", "Tony"};
        System.out.println(Arrays.toString(namen));

        System.out.println();

        for(int i = 0; i < namen.length; i++) {
            System.out.println(i + ": " + namen[i]);
        }

        System.out.println();

        for(String name : namen) {
            System.out.println(name);
        }

        System.out.println();

        // Seit Java 1.8 möglich
        Arrays.stream(namen).forEach(System.out::println);

        System.out.println();

        byte[] x, y; // Zwei Variablen vom Typ byte-Array
        byte a[], b; // Eine Variable vom Typ byte-Array und eine vom Typ byte

        // Mehrdimensional

        int[][] zahlen = new int[5][5]; // 5 Positionen mit jeweils einem Array von 5 Werten

        zahlen[1][2] = 7;
        // zahlen[5][5] = 1; // ArrayIndexOutOfBoundsException!!!
        zahlen[4][4] = 1;

        // 0: 0 0 0 0 0
        // 1: 0 0 7 0 0
        // 2: 0 0 0 0 0
        // 3: 0 0 0 0 0
        // 4: 0 0 0 0 1


        zahlen = new int[5][];

        // 0: null
        // 1: null
        // 2: null
        // 3: null
        // 4: null

        zahlen[0] = new int[3];
        zahlen[3] = new int[4];

        // 0: 0, 0, 0
        // 1: null
        // 2: null
        // 3: 0, 0, 0, 0
        // 4: null


        for(int i = 0; i < zahlen.length; i++) {

            if(zahlen[i] == null)
                continue;

            for(int j = 0; j < zahlen[i].length; j++) {
                System.out.print(zahlen[i][j] + ", ");
            }
            System.out.println();
        }

        int[][] zahlen2 = new int[10][10];

        for(int i = 0; i < zahlen2.length; i++) {
            for(int j = 0; j < zahlen2[i].length; j++) {
                System.out.print(zahlen2[i][j] + ", ");
            }
            System.out.println();
        }

        System.out.println();

        for(int[] zeile : zahlen2) {
            for(int wert : zeile) {
                System.out.print(wert + ", ");
            }
            System.out.println();
        }
    }
}
