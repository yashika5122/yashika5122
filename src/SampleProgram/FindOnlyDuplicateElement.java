package SampleProgram;

import com.sun.source.doctree.StartElementTree;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOnlyDuplicateElement {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,5,6,7,7,8,8};

        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,3,5,6,1,2,5));

//      Remove duplicate values, [2, 3, 4, 5, 6, 7, 8]
        List<Integer> list=new ArrayList<>();
        ArrayList<Integer> arrayListWithDuplicate = new ArrayList<>(Arrays.asList(2,3,4,5,5,6,7,7,8,8));
        LinkedHashSet<Integer> setWithoutDuplicate = new LinkedHashSet<>(arrayListWithDuplicate);
        System.out.println("setWithoutDuplicate :"+setWithoutDuplicate);

//      How many times that value appears, {2=1, 3=1, 4=1, 5=2, 6=1, 7=2, 8=2}
        Map<Integer, Long> collect = arrayListWithDuplicate.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("collect :"+collect);

//      How many times that value appears for String, {a=2, s=1, h=1, i=1, y=1, k=1}
        String name = "yashika";
        /*1st way*/
        List<Character> l = new ArrayList();
        for (int i =0 ;i< name.length();i++){
            l.add(name.charAt(i));
        }
        Map<Character, Long> collect1 = l.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("collect1 :"+collect1);

        /*2nd way*/
        Map<String,Long> collect2 =Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("collect2 :"+collect2);

//      Only print which have duplicate value  ,[5, 7, 8]
        ArrayList<Integer> arrayListWithoutDuplicate = new ArrayList<>();
        collect.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> arrayListWithoutDuplicate.add(entry.getKey()));
        System.out.println("arrayListWithoutDuplicate :"+arrayListWithoutDuplicate);

//      Only print which have duplicate value , [5, 7, 8]
        Set<Integer> s=new LinkedHashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!s.add(arr[i]))
            {
                list.add(arr[i]);
            }
        }
        System.out.println("list :"+list);
    }
}
