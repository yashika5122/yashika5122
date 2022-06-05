package FunctionalInerfaceExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
/*
//      1st way to create simple class object and call the test() by implements Predicate<Integer> at class
        PredicateExample predicateExample = new PredicateExample();
        System.out.println(predicateExample.test(11));
*/
        /*2nd way is by Lambda expression*/
        Predicate<Integer> predicate = t -> t % 2 == 0;
        System.out.println(predicate.test(10));

        /*Now call this with Stream API*/
        List<Integer> list = Arrays.asList(1,4,2,56,7);
        list.stream().filter(predicate).forEach(t-> System.out.println("Even "+t));
        list.stream().filter(t -> t % 2 == 0).forEach(t-> System.out.println("with lambda,Even "+t));
    }

/*//    Use with 1st way
    @Override
    public boolean test(Integer integer) {
        return integer % 2 == 0;
    }*/
}
