package de.lubowiecki.oca.playground;

public class StringTest {

    public static void main(String[] args) {

        String text = "Das ist ein Haus von Nikigraus!";

        // text.toUpperCase();
        text = text.toUpperCase(); // Neue Version wird auf die alte Referenz zugewiesen

        text = text.replace("I", "X");
        text = text.replace("HAUS", "PALAST");

        System.out.println(text);

        text = String.format("Hallo %s! Dein Alter ist %d.", "Peter", 23);
        System.out.println(text);


        final String TBL_ROW = "| %-10s | %10s | %10s | \n";

        System.out.print(String.format(TBL_ROW, "Vorname", "Nachname", "Alter"));
        System.out.println("----------------------------------------");
        System.out.print(String.format(TBL_ROW, "Peter", "Parker", 25));
        System.out.print(String.format(TBL_ROW, "Bruce", "Banner", 32));
        System.out.print(String.format(TBL_ROW, "Tony", "Stark", 40));
        System.out.print(String.format(TBL_ROW, "Carol", "Danvers", 21));
    }

}
