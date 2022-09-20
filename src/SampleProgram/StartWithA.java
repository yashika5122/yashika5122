package SampleProgram;

import java.util.ArrayList;
import java.util.Arrays;

public class StartWithA {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>(Arrays.asList("Asha","Yashika","Aam"));
        a.stream().filter(t->t.startsWith("A")).forEach(t-> System.out.println(t));
    }
}
