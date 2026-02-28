package Functionalinterface;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        Predicate<Integer> predicate = new Predicate<>() {
            @Override
            public boolean test(Integer integer) {
                return integer>=11;
            }
        };

        System.out.println(predicate.test(12));

        //using lambda expression
        Predicate<Integer> predicate1 = number -> number>0;

        System.out.println(predicate1.test(-1));
    }
}
