package FunctionalInerfaceExample.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*FOR PRIMITIVE DATA TYPE*/

public class SortListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(2);
        list.add(34);
        list.add(24);
        list.add(57);
/*        Tradition approach to sort*/
        Collections.sort(list); //sort in ascending
        Collections.reverse(list); //sort in descending
        System.out.println(list);

        /*Sort with stream api*/
        list.stream().sorted().forEach(t-> System.out.println(t)); //sort in ascending
        list.stream().sorted(Comparator.reverseOrder()).forEach(t-> System.out.println(t));//sort in descending
    }
}
