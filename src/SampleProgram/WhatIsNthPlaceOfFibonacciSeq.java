package SampleProgram;

/*Suppose if input i 4 then what fibonacci no. will come at that place*/
public class WhatIsNthPlaceOfFibonacciSeq {
    /*
    *  0 ,1,1,2,3,5,8
    * */

    public static void main(String[] args) {

        System.out.println(fibonacciSeq(4));
    }

    public static int fibonacciSeq(int n){
        int a=0;
        int b=1;
        int temp = a+b;
        if (n ==0)
            return 0;
        else if (n==1)
            return 1;
        else
            while(n>1){
                temp = a+b;
                a=b;
                b=temp;
               n--;

           }

        return temp;
    }
}
