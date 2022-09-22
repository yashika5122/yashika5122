package SampleProgram;

public class IsNumberSquare {
    public static void main(String[] args) {

        if (isPowerOfTwo(8))
            System.out.println("Yes");
        else
            System.out.println("No");

        int x = 4;

        if (isPerfectSquare(x))
            System.out.print("Yes");
        else
            System.out.print("No");

    }
    static boolean isPowerOfTwo(int n)
    {
        if (n == 0)
            return false;

        while (n != 1) {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
    }

    static boolean isPerfectSquare(int x)
    {
        if (x >= 0) {
            // Find floating point value of square root of x.
            int sr = (int)Math.sqrt(x);
            System.out.println(sr);

            // if product of square root is equal, then return T/F
            return ((sr * sr) == x);
        }
        return false;
    }
}

