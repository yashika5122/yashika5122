package SampleProgram;

import java.util.*;

public class SortMap {
    public static void main(String[] args) {
        Map<Integer, String> hm=new HashMap<Integer, String>();
//addding keys and values to HashMap
        hm.put(23, "Yash");
        hm.put(17, "Arun");
        hm.put(15, "Swarit");
        hm.put(9, "Neelesh");
        System.out.println(hm);

        Map<Integer, String> tr =new  TreeMap<Integer, String>(hm);
        System.out.println(tr);

       /* List l = new LinkedList(hm.entrySet());
        Collections.sort(l, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return  ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
            }
        });
        System.out.println(l);*/
    }
}
