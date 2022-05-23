package FunctionalInerfaceExample;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
       // Function<Integer,Integer> function;
        //R apply(T t);
        Function<Integer,Boolean> function= (t)-> t%2==0;
        System.out.println(function.apply(10));
    }
}
