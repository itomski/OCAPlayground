package de.lubowiecki.uebung3;

public class Board {

    private final Bot[][] FIELDS;

    public Board(int size) {
        this.FIELDS = new Bot[size][size];
    }

    public void print() {

        for(Bot[] bots : FIELDS) {
            for(Bot bot : bots) {
                if(bot == null) System.out.print("[ ]");
                else System.out.print("[@]");
            }
            System.out.println();
        }
    }

    public boolean set(Bot bot, int x, int y) {
        FIELDS[x][y] = bot;
        // TODO: Kontrolle der Feldüberschreitung einbauen
        return true;
    }
}
