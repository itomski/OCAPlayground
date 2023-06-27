package de.lubowiecki.patterns.singleton;

public class LazySingleton {

    // Lazy: Singleton-Objekt wird beim ersten aufruf von getInstance gebaut
    private static LazySingleton instance;

    private String content = "";

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {

        // TODO: Threadsicher machen
        if(instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public void addContent(String str) {
        content += str;
    }

    public String getContent() {
        return content;
    }
}
