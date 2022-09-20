package FunctionalInerfaceExample.sort;

import java.security.KeyStore;
import java.util.*;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("one",1);
        map.put("three",3);
        map.put("five",5);
        map.put("two",2);
        map.put("four",4);

        /*Traditional Approach*/

        List<Entry<String,Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, new Comparator<Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });// It takes list to first convert map to list, as above

        for(Entry<String,Integer> entry:entries){
            System.out.println("-------Traditional----------");
            System.out.println(entry);
        }

        /*Through Lambda expression */
        System.out.println("-------Lambda----------");
        List<Entry<String,Integer>> entryList = new ArrayList<>(map.entrySet());
        Collections.sort(entryList,(o1, o2) -> o1.getKey().compareTo(o2.getKey()));// remove anonymous function, new Comparator<Entry<String, Integer>>()

        for(Entry<String,Integer> entry:entryList){
            System.out.println(entry);
        }

        /*Now sort with stream API*/
        System.out.println("---------Stream--------");
        map.entrySet().stream().sorted((o1, o2) -> o1.getValue().compareTo(o2.getValue())).forEach(System.out::println);

        System.out.println("--------comparingByKey---------");

        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

        System.out.println("---------Reversed--------");
        map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).forEach(System.out::println);
    }
}
