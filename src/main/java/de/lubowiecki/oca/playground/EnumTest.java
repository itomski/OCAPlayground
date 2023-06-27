package de.lubowiecki.oca.playground;

import de.lubowiecki.oca.playground.enums.Wochentag; // Liegt in einem anderen package, muss importiert werden

// importiert das statische Inventar einer Klasse
import static de.lubowiecki.oca.playground.enums.Wochentag.*; // Importiert alle KONSTANTEN aus Wochentag

public class EnumTest {

    public static void main(String[] args) {

        Wochentag tag1 = Wochentag.MO;
        Wochentag tag2 = MO;

    }
}
