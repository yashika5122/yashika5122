package FunctionalInerfaceExample;

import java.awt.*;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        //boolean test(T t);
        Predicate<Integer> predicate = (t) -> t % 2 == 0;
        System.out.println(predicate.test(4));
    }
}
