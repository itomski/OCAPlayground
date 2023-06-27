package de.lubowiecki.patterns.singleton;

public class SingletonTest {

    public static void main(String[] args) {
        int i = 10;
        machWas();


        Object o = null;
        o = new Object();
        o = null;

        String s1 = "Hallo Welt"; // Landet im Pool
        String s2 = "Hallo Welt"; // Verwendet das Objekt aus dem Pool

        s2 += "..."; // s2 = s2 + "...";

        String s3 = new String("Hallo Welt"); // Landet nicht im Pool

        System.out.println();

        EagerSingleton singleton1 = EagerSingleton.getInstance();
        EagerSingleton singleton2 = EagerSingleton.getInstance();

        singleton2.addContent("A");
        singleton1.addContent("B");

        machWas();

        System.out.println(EagerSingleton.getInstance().getContent());

    }

    public static void machWas() {
        // getInstance liefert immer eine Referenz auf das gleiche Objekt
        EagerSingleton singleton = EagerSingleton.getInstance();
        singleton.addContent("C");
        int i = 20;
    }
}
