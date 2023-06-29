package de.lubowiecki.oca.playground;

public class ScopeTest {

    // Instanzvariablen
    // Scope: Ab der Objekterzeugung bis zum löschen der Referenz auf das Objekt verfügbar
    public int x;

    // Klassenvariable
    // Scope: Ab dem laden der Klasse bis zum Ende des Programms verfügbar
    public static int y;

    public static void main(String[] args) { // Methodenparameter sind lokale Variablen

        // Lokale Variable
        // Sind max. bis ende der Methode sichtbar
        int z;
        // double z; Redeklartion nicht möglich. z ist als lokale Variable noch sichtbar

        {
            int a; // Ist nur bis zum Ende des Blocks sichtbar
        }
        int a; // Kann neu deklariert werden, da die alte a Variable weg ist

        int y; // Ist keine Redeklaration. lokales y überlagert das Klassen y.
    }
}
