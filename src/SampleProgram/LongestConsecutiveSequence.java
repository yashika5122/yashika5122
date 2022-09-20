package SampleProgram;

import javax.print.DocFlavor;
import java.util.*;

import static java.lang.Math.max;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] num = {100, 4, 200, 1, 3, 2};
//        int i = longestConsecutive(num);
//        System.out.println(i);
        int i1 = LongestCommonSubstr("abcedf", "sbcef");
        System.out.println(i1);

    }

    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int longestSequence = 0;

        for (int num : nums) {
            int currentNum =num;
            int currentStreak =0;
            if (!set.contains(num - 1)) {
                while (set.contains(currentNum)) {
                    currentStreak += 1;
                    currentNum+=1;
                }
                longestSequence = max(longestSequence,currentStreak);
            }
        }
        return longestSequence;
    }
    public static int LongestCommonSubstr(String X, String Y) {

        int m=X.length();
        int n=Y.length();
        int[][] dp = new int[m+1][n+1];
        int max = 0;
        int maxIndex = 0;
        // initialization
        for(int i=0;i<=m;i++)
            dp[i][0]=0;   // Eg LCS of "abc" & "" = 0
        for(int j=0;j<=n;j++)
            dp[0][j]=0;   // Eg LCS of "" & "abc" = 0

        int maxLen = 0; // Now finding the max element
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
//                    maxLen = Math.max(maxLen, dp[i][j]);
                }
                if(dp[i][j] > max){
                    max = dp[i][j];
                    maxIndex = i;
                }
                else
                    dp[i][j] = 0; // ONLY THIS CHANGE
            }
        }
        System.out.println(X.substring(maxIndex - max, maxIndex));
        return max;
    }
}
