package FunctionalInerfaceExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {

/*        // 1st way to create simple class object and call the get() by implements Supplier<String> at class
        SupplierExample supplierExample = new SupplierExample();
        System.out.println(supplierExample.get());*/

        /*2nd way by lambda expression*/
        Supplier<String> supplier = ()->"hello there";
        System.out.println(supplier.get());

        /*Now call this with Stream API*/
        List<String> list = Arrays.asList("a","b");
        System.out.println( "Stream call : "+list.stream().findAny().orElseGet(supplier));

        List<String> list1 = Arrays.asList();
        System.out.println( list1.stream().findAny().orElseGet(()->"no element there"));
     }

 /*
  Use for 1st way
  @Override
    public String get() {
        return "Hello there";
    }*/
}
