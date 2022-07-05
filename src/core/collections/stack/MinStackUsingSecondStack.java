package core.collections.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinStackUsingSecondStack {
    public static void main(String[] args) {
        int[] input = {4, 9, 3, 2, 5, 1};
        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> minStack = new ArrayDeque<>();
        int min = Integer.MAX_VALUE;
        for(int num : input) {
            stack.offerLast(num);
            if(minStack.isEmpty()) {
                minStack.offerLast(num);
                min = num;
            } else {
                if(num < min) {
                    minStack.offerLast(num);
                    min = num;
                }
            }
            System.out.println("stack = " + stack);
            System.out.println("min value = " + minStack.peekLast());

        }
        while(!stack.isEmpty()) {
            int num = stack.pollLast();
            if(num == min) {
                minStack.pollLast();
                min = minStack.isEmpty() ? Integer.MAX_VALUE : minStack.peekLast();
            }
            System.out.println("removed = " + num);
            System.out.println("stack = " + stack);
            System.out.println("min value = " + min);
            System.out.println();

        }
    }
}
