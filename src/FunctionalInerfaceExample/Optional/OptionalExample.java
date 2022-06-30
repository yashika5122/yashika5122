package FunctionalInerfaceExample.Optional;

import FunctionalInerfaceExample.MapAndFlatMap.Customer;
import FunctionalInerfaceExample.MapAndFlatMap.ECartDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class OptionalExample {
    public static void main(String[] args) {
        Customer customer = new Customer(12, "Yashika", null, Arrays.asList("345674488", "64335677"));

        /*empty
         * of
         * ofNullable */

//        Return the object of Optional
        Optional<Object> empty = Optional.empty();
        System.out.println("Line 1.." + empty);

//        If value is null then it will give NPE
        /*Optional<String> email = Optional.of(customer.getEmail());
        System.out.println("Line 2.."+email);*/

//        Its a combination of "empty" and "of" ,if value is null then return object of Optional otherwise return value
        Optional<String> email1 = Optional.ofNullable(customer.getEmail());
        System.out.println("Line 3.." + email1);

//        if value present then return the value otherwise give java.util.NoSuchElementException: No value present
//        System.out.println("Line 4.."+email1.get());

//        So to avoid this we check first if there is any value
        if (email1.isPresent()) {
            System.out.println("Line 5.." + email1.get());
        }

//        If we want to return any default value in case of null
        System.out.println("Line 6.." + email1.orElse("my@gmail.com"));

//        Diff b/w orElse and orElseGet is orElse accept string and orElseGet accept supplier otherwise both return default value
        System.out.println("Line 7.." + email1.orElseGet(() -> "mynew@gmail.com"));

//        To throw customised exception in case of null value
       /* try {
            System.out.println("Line 8.." + email1.orElseThrow(() -> new Exception("Email not present")));
        } catch (Exception exception) {
            exception.printStackTrace();
        }*/

//        Return the value in upper case else print the default value
//        System.out.println("Line 9.."+email1.map(String::toUpperCase).orElse("default email"));

//        Now use Optional with Stream API
        System.out.println(getEmailId("ya@gmail.com"));
        System.out.println(getEmailId("yashika@gmail.com"));

    }

    /*Checking the email with given and already present in DB, if match return the value else give new entry*/
    public static Customer getEmailId(String email) {
        List<Customer> customers = ECartDataBase.getAll();
//        return customers.stream().filter(customer -> customer.getEmail().equals(email)).findAny().get();
        return customers.stream().filter(customer -> customer.getEmail().equals(email)).findAny().orElse(new Customer(1,"as","as.com",Arrays.asList("8999")));
    }

    /*Best Practice
    * Directly declare the Optional are getter method
    * public String getEmail() {
        return email;
    }
    * from this to change it
    * public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }
    * */

}
