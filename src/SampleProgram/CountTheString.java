package SampleProgram;
//o/p a5 b3 c3 d2 e1 f1 a3 b1 c3 d2 e1 f1
public class CountTheString {
    public static void main(String[] args) {
        String s = "aaaaabbbcccddefaaabcccddef";

        for (int i =0;i < s.length();i++ ){
            int count =1;
            while (i+1<s.length() && s.charAt(i)==s.charAt(i+1)){
                i++;
                count++;
            }
            System.out.print(s.charAt(i)+""+count+" ");
        }
    }
}
