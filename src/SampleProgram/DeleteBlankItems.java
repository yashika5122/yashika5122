package SampleProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Myshape {
   private String name;
 
    public Myshape(String name) {
        this.name = name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getName() {
        return this.name;
    }
}
 
public class DeleteBlankItems {
 
    public static void main(String[] args) throws Exception {
        Myshape shape1 = new Myshape("shape1");
        Myshape shape2 = shape1;
 
        createNewShape(shape2);
 
        System.out.println(shape2.getName());
        Consumer<List<String>> deleteBlankItms = (items)->{
            for(int i = 0 ; i < items.size(); i++){
                if(items.get(i).length() == 0){
                    items.remove(i);
                }

            }
        };
        List<String>names = new ArrayList<>(Arrays.asList("Alex", "Bob", "", "Rick", "","","","", "Rick"));
        deleteBlankItms.accept(names);
        System.out.println("deleteBlankItms "+names);
    }
 
    public static Myshape createNewShape (Myshape shape) {
        shape = new Myshape("I'm new shape!");
        System.out.println("inside createNewShape "+shape);
        return shape;
    }
}