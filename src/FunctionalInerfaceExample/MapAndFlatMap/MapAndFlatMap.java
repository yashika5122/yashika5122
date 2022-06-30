package FunctionalInerfaceExample.MapAndFlatMap;

import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMap {
    public static void main(String[] args) {
        List<Customer> customers = ECartDataBase.getAll();
        /* MAP
         * List<Customer>  converts to List<Integer> --> Data Transformation
         * one to one Mapping: customer -> customer.getId()*/

//        Approach 1 by collect(Collectors.toList()), which return List
        List<Integer> collect = customers.stream().map(customer -> customer.getId()).collect(Collectors.toList());
        System.out.println(collect);

//        Approach 2 by simple forEach
        customers.stream().map(customer -> customer.getName()).forEach(t -> System.out.println(t));

        /* FLATMAP
         * List<Customer>  converts to List<String> --> Data Transformation
         * Mapping one to many*/
        List<String> phoneNumber = customers.stream()
                .flatMap(customer -> customer.getPhoneNumber().stream())
                .collect(Collectors.toList());
        System.out.println(phoneNumber);

        /* without flat map it will give List of List: List<List<String>> */
        List<List<String>> phoneNumberList = customers.stream()
                .map(customer -> customer.getPhoneNumber())
                .collect(Collectors.toList());
        System.out.println(phoneNumberList);
    }
}
