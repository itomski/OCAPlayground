package de.lubowiecki.oca.playground;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TimeTest {

    public static void main(String[] args) {

        Robot r1 = Robot.createCombatBot();
        Robot r2 = Robot.createComBot();

        System.out.println(r1.getName() + " " + r1.getType());

        System.out.println();

        // LocalDate d1 = new LocalDate();
        LocalDate d1 = LocalDate.now();
        System.out.println(d1);

        LocalDate d2 = LocalDate.of(2023, 6, 25);
        System.out.println(d2);

        System.out.println(d1.getYear() + " " + d1.getMonth() + " " + d1.getDayOfMonth());
        System.out.println(d1.getYear() + " " + d1.getMonthValue() + " " + d1.getDayOfMonth());

        final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        System.out.println(d1.format(fmt));
        System.out.println(d2.format(fmt));

        final DateTimeFormatter fmt2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);

        System.out.println(d1.format(fmt2));
        System.out.println(d2.format(fmt2));

        LocalDate d3 = LocalDate.parse("10.05.2023", fmt2);
        System.out.println(d3);

        LocalDate d4 = d3.plusDays(30); // LocalDate und LocalTime sind immutable

        System.out.println();

        LocalTime t1 = LocalTime.now();
        LocalTime t2 = LocalTime.of(10, 15, 20);

        final DateTimeFormatter fmt3 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

        System.out.println(t1);
        System.out.println(t1.format(fmt3));
        System.out.println(t2);
        System.out.println(t2.format(fmt3));

        System.out.println();

        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(d1, t1);
        LocalDateTime ldt3 = LocalDateTime.of(2000, 4, 10, 15, 10,15);

        System.out.println(ldt1);
        System.out.println(ldt2);
        System.out.println(ldt3);

        // final DateTimeFormatter fmt4 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        final DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd.MM.yy HH:mm");
        System.out.println(ldt1.format(fmt4));
    }
}

class Robot {

    private final String name;

    private final String type;

    private Robot(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public static Robot createComBot() {
        return new Robot("R2-D2", "Kommunikationsroboter");
    }

    public static Robot createCombatBot() {
        return new Robot("Robo", "Kampfroboter");
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
