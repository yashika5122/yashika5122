package FunctionalInerfaceExample.MapAndReduce;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;

public class MapReduceExample {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,34,5,6,46);

        /*Traditional Approach*/
        int sum=0;
        for (int i:number){
            sum= sum+i;
        }
        System.out.println("Traditional Approach :"+sum);

        /*With map method*/
        int sum1 = number.stream().mapToInt(t -> t).sum();
        System.out.println("Map approach with lambda :"+sum1);

        int sum2 = number.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Map approach with method interface :"+sum2);

        IntSummaryStatistics intSummaryStatistics = number.stream().mapToInt(t -> t).summaryStatistics();
        System.out.println("Map and Reduce approach :"+intSummaryStatistics);

        /*With Reduce method*/
        Integer reduce = number.stream().reduce(0, (a, b) -> a + b);
        System.out.println("reduce approach with lambda :"+reduce);

        Optional<Integer> reduce1 = number.stream().reduce(Integer::sum);
        System.out.println("reduce approach with method interface :"+reduce1.get());

        /*Find greater value*/
        Integer greaterValue = number.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println("Maximum number :"+greaterValue);

        Integer greaterValuewithMethodReference = number.stream().reduce(Integer::max).get();
        System.out.println("Maximum number with method reference :"+greaterValuewithMethodReference);

        /*Find which word has maximum letter*/
        List<String> words=Arrays.asList("yashika","ram","soffisticated");
        words.stream().reduce((word1, word2) -> (word1.length() > word2.length()) ? word1 : word2).get();
//        System.out.println("Longest word :"+wordLength);
    }
}
