package de.lubowiecki.uebung3;

import java.awt.*;

public class Bot {

    private String name = "Unbekannt";

    private int xPos;

    private int yPos;

    private Board board;

    // TODO: Richtung implementieren

    public Bot(Board board) {
        // this.board = Instanzvariable
        // board = Methodenparameter - lokale Variable
        this.board = board;
        move(); // Initialposition 0,0
    }


    public Bot(String name, Board board) {
        this(board);
        this.name = name;
    }

    public Bot(String name, Board board, int xPos, int yPos) {
        this.name = name;
        this.board = board;
        this.xPos = xPos;
        this.yPos = yPos;
        move();
    }

    public boolean move() {
        return board.set(this, xPos, yPos); // Bot wird auf dem Spielfeld platziert
    }

    public boolean move(String step) {

        System.out.println(step);
        System.out.println(xPos + " " + yPos);

        board.set(null, xPos, yPos); // Alte Prosition auf dem Spielfeld entfernen

        switch(step) {
            case ">":
                xPos++;
                return move();

            case "<":
                xPos--;
                return move();

            default:
                return false;
        }
    }

    public String getName() {
        return name;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }
}
