package de.lubowiecki.oca.playground;

public class FinalizeTest {

    public static void main(String[] args) {

        Hero h1 = new Hero("Batman");
        Hero h2 = new Hero("Spiderman");
        Hero h3 = new Hero("Flash");

        h1 = null;
        h2 = null;

        System.gc(); // Eine Bitte an GC den Müll zu entfernen

        try {
            Thread.sleep(2000); // Eine Sekunde warten
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Math.PI);

        final int zahl = 100; // Lokale Konstante
        // zahl = 200; // Error, Variable kann nicht mehr geändert werden

        // Kompiletime-Konstante
        final boolean active1 = true;

        //while(active1)
        //    System.out.println("AKTIV");

        /* Nach dem Kompilieren
        if(true)
            System.out.println("AKTIV");
        */

        // Runtime-Konstante
        final boolean active2;
        active2 = true;

        // while(active2)
        //    System.out.println("AKTIV");

        /* Nach dem Kompilieren
        if(active2)
            System.out.println("AKTIV");
        */

        final String name = "PETER";
        System.out.println("HALLO " + name);
        // System.out.println("HALLO PETER"); // Nach dem Kompilieren

        final String name2;
        name2 = "PETER";
        System.out.println("HALLO " + name2); // Zur Laufzeit werden hier 2 Strigs benutzt
    }
}

class Hero {

    private String name;

    public Hero(String name) {
        this.name = name;
        System.out.println(name + ": Yup... hier bin ich.");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + ": UGHRRRRRR.... ich sterbe....");
    }
}
