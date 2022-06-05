package FunctionalInerfaceExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilterDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Aasha");
        list.add("Usha");
        list.add("Aditya");
        list.add("aAm");
        list.add("yashika");

//        filter out those first letter start with "A"
        list.stream().filter(l->l.startsWith("A")).forEach(t-> System.out.println(t));

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        map.put(5,"e");

//        filter out those key is even
        map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(t-> System.out.println(t));
    }
}
