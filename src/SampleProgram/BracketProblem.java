package SampleProgram;

import java.util.Stack;

public class BracketProblem {
    public static void main(String[] args) {
        String s = "(a+b+{+c)+}";

        Stack stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == ')') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == '{' || s.charAt(i) == '}') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == '[' || s.charAt(i) == ']') {
                stack.push(s.charAt(i));
            }
        }


    }
}


