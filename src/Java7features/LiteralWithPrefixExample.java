package Java7features;

public class LiteralWithPrefixExample {
    public static void main(String[] args) {
//        Binary literal with prefix 0b and 0B
        byte input1 = 0b1001;
        byte input2 = 0B1001;
        System.out.println("Binary literal byte type input1 : "+input1+"\t input2 : "+input2);

// underscore (_) is used for better visualization and readability
        short input3 = 0b10000000;
        short input4 = 0B1000_0000;
        System.out.println("Binary literal short type input3 : "+input3+"\t input4 : "+input4);

        int input5 = 0b10000001111;
        int input6 = 0B1000_000_1111;
        System.out.println("Binary literal int type input5 : "+input5+"\t input6 : "+input6);

        long input7 = 0b1000000101010110101010101010;
        long input8 = 0B1000_0001_0101_0110_1010_1010_1010;
        System.out.println("Binary literal long type input7 : "+input7+"\t input8 : "+input8);

        int input9= 1_000_123;
        long input10 =1_111_123_424;
        float input11= 3.14_234_345_713f;
        System.out.println("input9 : "+input9+"\t input10 : "+input10+"\t input11 : "+input11);

    }
}
