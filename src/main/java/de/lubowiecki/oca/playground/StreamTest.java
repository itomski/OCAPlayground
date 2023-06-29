package de.lubowiecki.oca.playground;

import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class StreamTest {

    public static void main(String[] args) {

        IntSupplier sup = () ->  {
            System.out.println(Thread.currentThread().getName());
            return ((int)(Math.random() * 6)) + 1;
        };

        IntStream.generate(sup).parallel().limit(10_000_000).forEach(System.out::println);



    }
}
