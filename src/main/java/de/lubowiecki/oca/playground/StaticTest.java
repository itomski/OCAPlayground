package de.lubowiecki.oca.playground;

import java.util.*; // Importiert NUR Klassen, die direkt in java.util liegen
// Es werden keine Unterpackeges importiert

import java.util.Scanner;
import java.util.stream.*; // Importiert alle Klassen aus stream (subpackage von java.util)

public class StaticTest {

    public static void main(String... args) {

        /*
        Student s1 = new Student();
        s1.vorname = "Peter";
        s1.nachname = "Parker";

        Student s2 = new Student();
        s2.vorname = "Natasha";
        s2.nachname = "Romanov";
        */

        StaticStudent s1 = new StaticStudent();
        s1.vorname = "Peter";
        s1.nachname = "Parker";

        StaticStudent s2 = new StaticStudent();
        s2.vorname = "Natasha";
        s2.nachname = "Romanov";

        Scanner scanner = new Scanner(System.in);

    }
}

class Student {

    public String vorname;
    public String nachname;

}

class StaticStudent {

    public static String vorname;
    public static String nachname;

}