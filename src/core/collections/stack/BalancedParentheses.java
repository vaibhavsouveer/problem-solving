package core.collections.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParentheses {
    public static void main(String[] args) {
        String input = "})";
        System.out.println("Is balanced = " + isBalanced(input));
    }

    private static boolean isBalanced(String input) {
        if(input.length()%2 != 0) {
            return false;
        }
        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i < input.length(); i++) {
            char currentCh = input.charAt(i);
            if(currentCh == '{' || currentCh == '(' || currentCh == '[') {
                stack.offerLast(currentCh);
            } else if (currentCh == '}' || currentCh == ')' || currentCh == ']') {
                if(stack.isEmpty()) {
                    return false;
                }
                char tos = stack.pollLast();
                if(!((tos == '{' && currentCh == '}') ||
                        (tos == '(' && currentCh == ')') ||
                        (tos == '[' && currentCh == ']'))) {
                    return false;
                }
            }
        }
        return true;
    }
}
