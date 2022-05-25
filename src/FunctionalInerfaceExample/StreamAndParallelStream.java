package FunctionalInerfaceExample;

import java.util.stream.IntStream;

public class StreamAndParallelStream {
    public static void main(String[] args) {

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
