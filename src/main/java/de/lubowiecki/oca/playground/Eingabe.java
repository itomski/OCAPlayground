package de.lubowiecki.oca.playground;

import java.util.Scanner;

public class Eingabe {

    public static void main(String[] args) {

        // System.out = Ausgabestrom / Console
        // System.in = Eingabestrom

        final Scanner scanner = new Scanner(System.in);

        System.out.print("A: ");
        double a = scanner.nextDouble();

        System.out.print("B: ");
        double b = scanner.nextDouble();

        System.out.println("Rechnerausgabe: " + (a + b));




    }
}
