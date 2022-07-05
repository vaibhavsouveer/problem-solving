package dsa.ds.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class DuplicateParenthesis {
    public static void main(String[] args) {
        String input = "((a+b) + (c))";

        System.out.println("isDuplicate() = " + isDuplicate(input));
    }

    //3.26

    public static boolean isDuplicate(String input) {
        // no need to check edge cases like 0 length or
        // "))" or "(" as input will be balanced parenthesis
        Deque<Character> stack = new ArrayDeque<>();
        int i = 0;
        while(i < input.length()) {
            char ch = input.charAt(i);
            if(ch != ')') {
                stack.offerLast(ch);
            } else {
                if(stack.peekLast() == '(') {
                    return true;
                } else {
                    while(stack.peekLast() != '(') {
                        stack.pollLast();
                    }
                    stack.pollLast();
                }
            }
            i++;
        }
        return false;
    }
}
