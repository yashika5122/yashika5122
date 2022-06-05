package FunctionalInerfaceExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

//        with tradition approach
        for(Integer i : list)
            System.out.println("tradition approach "+i);

//        with for each
        list.stream().forEach(i-> System.out.println("forEach "+i));

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        map.put(5,"e");

        map.forEach((key,value)-> System.out.println(key+" : "+value)); // no stream API used
//        if we want to use the methods to stream then
        map.entrySet().stream().forEach(t-> System.out.println(t));
    }
}
