package SampleProgram;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonDuplicateElementFromList {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("wow");
        list.add("cow");
        list.add("wow");
        list.add("cow");
        list.add("mow");
        List<Integer> list1 = new ArrayList(Arrays.asList(1,3,4,2,3,4,5));
        list.stream()
                .filter(i -> Collections.frequency(list, i) == 1)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println(Collections.frequency(list,"cow"));

        list1.stream().filter(t->Collections.frequency(list1,t)>1).forEach(System.out::println);
    }
}
