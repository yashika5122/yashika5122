package SampleProgram;

import java.util.HashSet;
import java.util.Set;

public class palindrome {

    public void firstMethod(){
        String str = "madam";
        StringBuffer sb = new StringBuffer();
        for(int i = str.length()-1 ; i >=0;i--){
            sb.append(str.charAt(i));
        }
        if (str.equalsIgnoreCase(sb.toString())){
            System.out.println(sb + " palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }

    public void secondMethod(){
    /*using in build method*/
        String str = "NITIN";
        String reverse = new StringBuffer(str).reverse().toString();
        if(str.equalsIgnoreCase(reverse)){
            System.out.println(reverse + " palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }

    public static void main(String[] args) {
        palindrome p = new palindrome();
        p.firstMethod();
        p.secondMethod();
    }
}
