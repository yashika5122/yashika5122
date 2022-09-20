import jdk.dynalink.linker.LinkerServices;

import java.util.LinkedList;
import java.util.List;

public class example {

    private static void example(){}

    public static void main(String[] args) {
        List<Integer> l = new LinkedList<>();
        example e = null;

//        e.abc();
        m1();
    }
    public void abc(){
        System.out.println("non static");
    }
    public static  void m1(){
        System.out.println("static");
    }
}
