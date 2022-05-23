package collectionExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FinalList {
    public static void main(String[] args) {
        // After declaring list as final we can modify the list but can not re assign it
        final List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        System.out.println(list);

        //re assign of list is not possible with final
       /* list = new ArrayList<>();*/
    Set<Integer> set = new HashSet();
    set.add(1);
    }
}
