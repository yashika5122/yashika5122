import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        String s = "yashika";
        List<Character> list = new ArrayList();
        for (int i =0; i <= s.length()-1;i++){
            list.add(s.charAt(i));
        }
        Map<Character, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        Map<String, Long> collect1 = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect1);
    }
}
