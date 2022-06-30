package FunctionalInerfaceExample.MapAndFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ECartDataBase {

    public static List<Customer> getAll(){
        return Stream.of(
                new Customer(12,"Yashika","ya@gmail.com", Arrays.asList("345674488","64335677")),
                new Customer(10,"Sita","sa@gmail.com", Arrays.asList("67904433","23567899")),
                new Customer(19,"Manoj","ma@gmail.com", Arrays.asList("1234789","56789432")),
                new Customer(1,"Ram","ra@gmail.com", Arrays.asList("67831245","89532157"))
        ).collect(Collectors.toList());
    }
}
