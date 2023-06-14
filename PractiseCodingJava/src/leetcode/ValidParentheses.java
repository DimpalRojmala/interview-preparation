package leetcode;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("(])"));
    }

    static boolean isValid(String s) {
        Stack newStack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (c == '(' || c == '{' || c.equals('[')) {
                newStack.push(c);
            }
            if (c.equals(')') || c.equals('}') || c.equals(']')) {
                if (newStack.isEmpty()) return false;
                if (!newStack.isEmpty()) {
                    char popedElement = (char) newStack.pop();


                    if (popedElement != '(' && c == ')') {
                        return false;
                    }
                    if (popedElement != '{' && c == '}') {
                        return false;
                    }
                    if (popedElement != '[' && c == ']') {
                        return false;
                    }
                }
            }


        }
        return newStack.empty();
    }
}
