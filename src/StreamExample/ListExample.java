package StreamExample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(4,2,6,3,1);
       // list.stream().forEach((t)->System.out.println(t));
       // list.stream().sorted().forEach((t)->System.out.println(t));
        list.stream().sorted(Comparator.reverseOrder()).forEach((t)->System.out.println(t));


        System.out.println("===========Non primitive=============");
        //for non static method
       /* ListExample listExample=new ListExample();
        List<Student> students=listExample.getAllStudents();*/
        //for static method
        System.out.println("using lambda");
      List<Student> students=getAllStudents();
        students.stream()
                .sorted((s1,s2)->s1.getAge()-s2.getAge())
                .forEach(System.out::println);

        System.out.println("using reference operator");
        students.stream()
                .sorted(Comparator.comparing(Student::getName))
                .forEach(System.out::println);

    }

   static   List<Student> getAllStudents()
    {
       return Arrays.asList(new Student(101,"Manoj",30),
               new Student(102,"Yashika",35),
               new Student(103,"Sachiv Ji",45)
               );
    }
}
