package de.lubowiecki.uebung3;

import java.util.Scanner;

public class Game {

    private final Scanner scanner;

    private Board board;

    private Bot bot;

    private static final String KEYS = "\n*********************************" +
                                        "\n exit = Programm verlassen" +
                                        "\n go   = Programm ausführen" +
                                        "\n*********************************\n";

    public static void main(String[] args) {
        new Game().start();
    }

    public Game() {
        scanner = new Scanner(System.in);
    }

    private void start() {

        String input;

        app: while(true) {

            System.out.println(KEYS);

            System.out.print("Eingabe: ");
            input = scanner.next().trim().toLowerCase(); // Bewegungssequenz wird eingelesen

            switch(input) {
                case "exit": break app; // label

                case "go":
                    if(board == null) { // Gibt es schon ein Spielfeld?
                        // TODO: Größe abfragen
                        board = new Board(20); // Wenn nicht, wird ein Board gebaut
                    }

                    if(bot == null) { // Gibt es schon einen Bot?
                        // TODO: Namen für den Bot abfragen
                        bot = new Bot("R2-D2", board); // Wenn nicht, wird ein Bot gebaut
                    }

                    System.out.println("Wo laufen wir hin?");

                    String[] steps = scanner.next().trim().toLowerCase().split("");
                    for(String step : steps) {
                        bot.move(step); // Bewegung Schritt für Schritt
                        System.out.println(bot);
                    }

                    board.print(); // Zeichnet das Spielfeld
                    break;

                default:
                    System.out.println("\nFalsche Eingabe!");
            }

        }
        scanner.close();
        System.out.println("\nProgramm beendet");
    }
}
