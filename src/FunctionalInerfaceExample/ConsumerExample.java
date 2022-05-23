package FunctionalInerfaceExample;

import java.util.concurrent.Flow;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        //void accept(T t)
        Consumer<Integer> consumer = (t) -> System.out.println("Consumer Example" +t);
        consumer.accept(10);
    }
}
