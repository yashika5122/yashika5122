package FunctionalInerfaceExample;

import java.util.function.Supplier;

public class SupliarExample {
    public static void main(String[] args) {

        //T get();
        Supplier<String> supplier= ()-> "Suplier Example";
        System.out.println(supplier.get());
    }
}
