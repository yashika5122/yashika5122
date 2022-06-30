package FunctionalInerfaceExample;

import FunctionalInerfaceExample.MapAndFlatMap.Customer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
/*
//      1st way to create simple class object and call the accept() by implements Consumer<String> at class
        ConsumerExample example = new ConsumerExample();
        example.accept("10");
*/
     /*2nd way by Lambda expression*/
       Consumer<String> consumer = (o) -> System.out.println("Consumer example " + o);
       consumer.accept("Hello");

     /*Now call this with Stream API*/
        List<String> list = Arrays.asList("a","b","c","d");
        list.stream().forEach(consumer); //Instead of consumer ,we can directly pass the lambda expression
        list.stream().forEach(o-> System.out.println("Array of String "+o));
    }

/*
//    use for of 1st way
    @Override
    public void accept(String o) {
        System.out.println("Consumer example "+ o);
    }
*/
}
