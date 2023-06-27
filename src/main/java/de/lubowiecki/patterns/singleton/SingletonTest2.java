package de.lubowiecki.patterns.singleton;

public class SingletonTest2 {

    public static void main(String[] args) {

        // Alle Refernzen zeigen auf ein und das gleiche Objekt
        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();
        LazySingleton lazy3 = LazySingleton.getInstance();

        lazy1.addContent("X");
        lazy3.addContent("Y");
        lazy2.addContent("Z");

        System.out.println(lazy1.getContent());
    }
}
