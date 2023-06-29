package de.lubowiecki.oca.playground;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest {

    public static void main(String[] args) {

        List<String> namen = new ArrayList<>();
        // namen.add(1); // Geht nicht, ist kein String
        namen.add("Peter"); // Ein Element wird auf die nächste freie Stelle gepackt
        namen.add("Bruce");
        namen.add("Carol");
        namen.add("Natasha");
        namen.add("Tony");
        namen.add("Steve");

        // size() liefert die Anzahl Elemente
        for(int i = 0; i < namen.size(); i++) {
            System.out.println(namen.get(i)); // Liefert das Element an Position i
        }

        System.out.println();

        for(String name : namen) {
            System.out.println(name); // name enthält das aktuelle Element
        }

        // vor Java 1.7
        // List<String> namen = new ArrayList<String>();


        System.out.println();

        List<Person> personen = new ArrayList<>();

        Person p = new Person();
        p.setVorname("Peter");
        p.setNachname("Parker");
        personen.add(p);

        personen.add(new Person("Bruce", "Banner"));

        // personen = Sammlung von Person-Objekten
        // person = Variable für das aktuelle Person-Objekt
        for(Person person : personen) {
            System.out.println(person.getVorname() + " " + person.getNachname());
        }
    }
}
