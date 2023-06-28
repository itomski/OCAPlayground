package de.lubowiecki.oca.playground;

import java.util.Scanner;

public class LoopTest {

    public static void main(String[] args) {

        System.out.println("START");

        Scanner scanner = new Scanner(System.in);

        boolean exit = false;

        while(!exit) { // Block wird ausgeführt solange Bedingung true ergibt (! = nicht)

            System.out.print("Eingabe: ");
            String input = scanner.nextLine();

            if(input.equalsIgnoreCase("exit")) {
                exit = true;
            }

            System.out.println("Ausgabe: " + input);
        }

        System.out.println("ENDE");
    }
}
