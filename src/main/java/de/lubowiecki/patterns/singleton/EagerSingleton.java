package de.lubowiecki.patterns.singleton;

public class EagerSingleton {

    // Eager: Singleton-Objekt wird beim Laden der Klasse erzeugt
    private final static EagerSingleton instance = new EagerSingleton();

    private String content = "";

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    public void addContent(String str) {
        content += str;
    }

    public String getContent() {
        return content;
    }
}
