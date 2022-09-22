package SampleProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FingOutput
{
    public static void main(String []args)
    {
        List list= new ArrayList();
        list.add("a");
        list.add("b");

        Map<Integer, List> map = new HashMap();
        map.put(1, list);
        System.out.println(map);
        List temp = map.get(1);
        System.out.println(temp);
        temp.add("c");
        System.out.println(map.get(1));
    }
}