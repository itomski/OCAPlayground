package de.lubowiecki.uebung1;

import java.util.Scanner;

public class RechnerTest {

    // Instanzvariablen, sind erst da, wenn ein Objekt der Klasse erzeugt wurde
    private final Scanner scanner = new Scanner(System.in);
    private final Rechner rechner = new Rechner();

    private final String FMT ="%.2f \n";

    public static void main(String[] args) {
        new RechnerTest().start();
    }

    public void start() {

        System.out.print("A: ");
        double a = scanner.nextDouble();

        System.out.print("B: ");
        double b = scanner.nextDouble();

        System.out.printf("ADD: " + FMT, rechner.add(a , b));

        System.out.print("\nA: ");
        a = scanner.nextDouble();

        System.out.print("B: ");
        b = scanner.nextDouble();

        System.out.printf("SUB: " + FMT, rechner.sub(a , b));

        System.out.print("\nA: ");
        a = scanner.nextDouble();

        System.out.print("B: ");
        b = scanner.nextDouble();

        System.out.printf("MULTI: " + FMT, rechner.multi(a , b));

        System.out.print("\nA: ");
        a = scanner.nextDouble();

        System.out.print("B: ");
        b = scanner.nextDouble();

        System.out.printf("DIV: " + FMT, rechner.div(a , b));

        System.out.println("------------");

        System.out.println(rechner.getProtokoll());

    }
}
