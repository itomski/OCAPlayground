package de.lubowiecki;

public class Movement {

    public static void main(String[] args) {

        int[][] feld = new int[10][10];

        int posx = 7;
        int posy = 2;

        feld[posx][posy] = 1;

        show(feld);

        int posAltX = posx;
        int posAltY = posy;

        posx++;

        feld[posAltX][posAltY] = 0;
        feld[posx][posy] = 1;

        show(feld);
    }

    private static void show(int[][] feld) {
        for(int i = 0; i < feld.length; i++) {
            for(int j = 0; j < feld[i].length; j++) {
                System.out.print(feld[i][j] + " ");
            }
            System.out.println();
        }
    }


}
