package FunctionalInerfaceExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MYFunctionImpl {
    public static void main(String[] args) {

        /*block for Void function
        MyFunction myFunction = (i)->System.out.println("testing lambda for void function");
        myFunction.test(5);*/

       /* block for int function
        MyFunction myFunction = i -> i*i;       // parentheses of i can also be removed
        System.out.println(myFunction.test(5));*/

        /*block for string function
        MyFunction myFunction = (l, m)->l+m; // assign value to the interface variable
        System.out.println(myFunction.test("yashika","chandra"));*/

       /* block for Function Interface
        Function<Integer,String> function = (t)->"output "+t;
        System.out.println(function.apply(5));*/

        /* print value greater than 4 and in sorted order
        >4, 23,6,8,9,10
         6,8,9,10,23*/
        List<Integer> list= Arrays.asList(23,4,6,8,9,1,2,10);
//        Predicate<Integer> predicate = t->t>4;

        list.stream().filter(t->t>4).sorted().forEach(System.out::println); //as filter is accepting predicate as
        // argument so we can directly passing the expression instead of filter(predicate)

        /*Method reference
        Lambda can be replace with method reference
        it work for static as well as non static methods*/
//      For static method
        list.stream().filter(t->t>4).sorted().forEach(MYFunctionImpl::methodRreferenceTest);

//      For non static method
        MYFunctionImpl myFunction = new MYFunctionImpl();
        list.stream().filter(t->t>4).sorted().forEach(myFunction::methodRreference);
    }

    //      For static method
    public static void methodRreferenceTest(Integer i){
        System.out.println("Method reference example for static method "+ i);
    }

    //      For non static method
    public void methodRreference(Integer i){
        System.out.println("Method reference example for non static method "+ i);
    }
}
