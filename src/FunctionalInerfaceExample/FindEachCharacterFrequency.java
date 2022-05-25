package FunctionalInerfaceExample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/*Find frequency of each character in a given String*/
public class FindEachCharacterFrequency {
    public static void main(String[] args) {
        String input = "yashikA";
        Map<String, Long> collect = Arrays.stream(input.split(""))
                .collect(
                        groupingBy(Function.identity(), counting())
                );
        System.out.println(collect);
    }
}
