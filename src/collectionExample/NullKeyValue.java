package collectionExample;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class NullKeyValue {
    public static void main(String[] args) {
/*        ConcurrentHashMap throws NullPointerException as there is condition in ConcurrentHashMap that if any key or
        value is null throw exception but there is no such condition is HashMap.*/
        Map<Integer,Integer> map = new ConcurrentHashMap<>();
//        Map<Integer,Integer> map = new HashMap<>();
        map.put(null,null);
        System.out.println(map);
    }
}
