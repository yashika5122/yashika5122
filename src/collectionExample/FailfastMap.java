package collectionExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailfastMap {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
/*        to avoid ConcurrentModificationException use ConcurrentHashMap, it will not create like CopyOnWriteArrayList,
        it will add the value in the same map*/
//        Map<Integer,Integer> map = new ConcurrentHashMap<>(); //

        map.put(1,2);
        map.put(2,3);

        //Getting iterator for map
        Iterator i = map.keySet().iterator();
        while (i.hasNext()){
            Integer key = (Integer) i.next();
            System.out.println(key+" : "+ map.get(key));
            map.put(3,4);
        }
    }
}
