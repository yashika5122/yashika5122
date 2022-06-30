package Java7features;

import java.util.ArrayList;

public class TypeInferenceForGenericType {
    public static void main(String[] args) {
/*Before Java 7 to make data generic type we need to add type of data to both side of the declaration
* but after Java 7 no need to define both side only left hand side of declaration is enough*/

        //Before 7
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");

//        In java 7
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
    }
}
