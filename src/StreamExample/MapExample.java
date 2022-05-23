package StreamExample;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(1,103);
        map.put(2,102);
        map.put(3,101);
        map.put(4,104);

        Map<Student,Integer> map1=new HashMap<>();
        map1.put(new Student(101,"Manoj",30),1001);
        map1.put(new Student(102,"Yashika",35),1002);
        map1.put(new Student(103,"Sachiv Ji",45),1003);

       // map.entrySet().stream().forEach(m-> System.out.println(m));
        map.entrySet().stream().forEach(System.out::println);
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("===========reverse order with lambda expression=============");
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(((o1, o2) -> o2-o1)))
                .forEach(System.out::println);
        System.out.println("===========reverse order without lambda expression=============");
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);

        System.out.println("===========Non Primitive=============");

        System.out.println("======Ascending order========");
        map1.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getName)))
                .forEach(System.out::println);
        System.out.println("======eversed order========");
        map1.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getName).reversed()))
                .forEach(System.out::println);
    }

 /* static   Map<Student,Integer> getAllStudentInMap()
    {
        Map<Student,Integer> map=new HashMap<>();
        map.put(new Student(101,"Manoj",30),1001);
        map.put(new Student(102,"Yashika",35),1002);
        map.put(new Student(103,"Sachiv Ji",45),1003);
        return map;
    }*/
}
