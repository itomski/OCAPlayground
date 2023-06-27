package de.lubowiecki.oca.playground;

public class ArraysTest {

    public static void main(String[] args) {

        int[] arr = new int[5]; // Erzeugt ein Array für 5 Zahlen
        arr[0] = 10; // Weist eine 10 auf die erste Position des Arrays
        arr[4] = 20; // Weist eine 20 auf die letzte Position des Arrays

        printArray(arr);

        arr = genArray();
    }

    public static void printArray(int[] zahlen) {
        for(int i : zahlen) {
            System.out.println(i);
        }
    }

    public static int[] genArray() {
        return new int[]{1,2,5,7,9};
    }



}
