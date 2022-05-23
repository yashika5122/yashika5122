package collectionExample;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CustomThread extends Thread{
/*
 Main thread add object and in the meantime child thread also want to add object that why
    we are getting ConcurrentModificationException as we are using HashMap, it internally lock the thread for one
    thread which main thread so modification done by another thread (child thread) coz the exception
*/
//    static Map<Integer,String> map = new HashMap<>();

/*    Now ConcurrentHashMap apply lock on the segment basis(map.put(1,"one"); -- is one segment) not on the map, so that
    why we are able to add value during iteration*/
    static Map<Integer,String> map = new ConcurrentHashMap<>();

    public void run(){
        try {
            Thread.sleep(1000);
            map.put(1,"one"); //child thread trying to add new object
        }catch (InterruptedException e){
            System.out.println("child thread going to add element");
        }
    }
    public static void main(String[] args) throws InterruptedException{
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");
        CustomThread customThread = new CustomThread();
        customThread.start();

        //main thread iteration
        for (Object o : map.entrySet()){
            Object s = o;
            System.out.println(s);
            Thread.sleep(1000);
        }
        System.out.println(map);
    }
}
