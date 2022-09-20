import java.util.Arrays;

public class Testing {
    public static void main(String[] args) {
        String s = "YashikaChandraJavaDev123";
        StringBuffer sb = new StringBuffer(s);
        String substring=null;
        String substring1=null;
//        99009900
        for (int i =1;i<=10;i++){
            substring = s.substring(1,s.length());
            substring1 = s.substring(0, 1);
//            sb=substring+substring1.toString()
            System.out.println(substring+substring1);
        }
    }
}
