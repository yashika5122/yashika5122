package FunctionalInerfaceExample;

import java.util.stream.IntStream;

public class StreamAndParallelStream {
    public static void main(String[] args) {

        /* var introduce in java 11 as local variable syntax, it will assign the datatype as per the value
        123 --> int , "123" -->string
        var test= "123";
        System.out.println(test);*/
        System.out.println("----------Sequential Stream----------");
        IntStream.rangeClosed(1, 10).forEach(
                t-> System.out.println(Thread.currentThread().getName()+ " : "+t)
        );

        System.out.println("--------Parallel Stream------------");
        IntStream.rangeClosed(1, 10).parallel().forEach(t->
                System.out.println(Thread.currentThread().getName()+ " : "+t)
        );
        System.out.println("available core in machine: "+Runtime.getRuntime().availableProcessors());
    }
}
