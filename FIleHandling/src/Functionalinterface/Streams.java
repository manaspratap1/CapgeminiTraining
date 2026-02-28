package Functionalinterface;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;

public class Streams {

    public static void main(String[] args) {
        List<String> names = List.of("Ram", "Shyam", "Mohan", "Ramesh", "Rajiv", "Shivam", "Rishabh");

        Predicate<String> filter = name->name.startsWith("R");
        Function<String, String> transform = String::toUpperCase;
        Consumer<String> print = System.out::println;

        names.stream()
                .filter(filter)
                .map(transform)
                .forEach(print);
    }
}
