package collectionExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            int nextElement = iterator.next();
            System.out.println(nextElement);
            list.add(3); // try to add value during iteration so it will throw ConcurrentModificationException
        }

        /*List<Integer> list = new CopyOnWriteArrayList<>(); // to avoid ConcurrentModificationException use CopyOnWriteArrayList
        list.add(1);
        list.add(2);
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            int nextElement = iterator.next();
            System.out.println(nextElement);
            list.add(3); // but it will not print this element coz it is adding in copy of list not the actual list

        }*/
    }
}
