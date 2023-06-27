package de.lubowiecki.uebung1;

import java.util.Scanner;

public class StaticRechnerTest {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("A: ");
        double a = scanner.nextDouble();

        System.out.print("B: ");
        double b = scanner.nextDouble();

        System.out.println(StaticRechner.add(a, b));

    }
}
