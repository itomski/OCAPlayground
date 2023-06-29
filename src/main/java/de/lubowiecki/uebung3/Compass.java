package de.lubowiecki.uebung3;

public class Compass {

    public static Direction turnLeft(Direction current) {

        switch (current) {
            case EAST: return Direction.NORTH;
            case SOUTH: return Direction.EAST;
            case WEST: return Direction.SOUTH;
            case NORTH: return Direction.WEST;
        }

        return null;
    }

    public static Direction turnRight(Direction current) {

        switch (current) {
            case EAST: return Direction.SOUTH;
            case SOUTH: return Direction.WEST;
            case WEST: return Direction.NORTH;
            case NORTH: return Direction.EAST;
        }

        return null;
    }
}
