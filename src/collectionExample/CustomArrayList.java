package collectionExample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.concurrent.Callable;

public class CustomArrayList extends ArrayList {

    @Override
    public boolean add(Object o) {
        if(this.contains(o)){
            return true;
        }else {
            return super.add(o);
        }
    }


    public static void main(String[] args) {
        CustomArrayList customArrayList = new CustomArrayList();
        customArrayList.add(1);
        customArrayList.add(1);
        customArrayList.add(2);
        customArrayList.add(3);
        System.out.println(customArrayList);
    }
}
