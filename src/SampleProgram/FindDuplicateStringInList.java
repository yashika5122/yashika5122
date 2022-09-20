package SampleProgram;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateStringInList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("a");
        list.add("a");

        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        Set set = new LinkedHashSet();
        for (String str :list){
            set.add(str);
        }
        System.out.println(set);

        String s = "yashika";
        Map<String, List<String>> collect1 = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity()));
        System.out.println("yashika "+collect1);
    }
}
