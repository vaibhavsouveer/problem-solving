package dsa.ds.stack;

import java.util.Arrays;

public class MinStack {
    int[] s;
    int tos;
    int min;

    MinStack() {
        s = new int[16];
        tos = -1;
        min = Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(8);
        stack.push(10);
        stack.push(6);
        stack.push(3);
        stack.push(7);
        System.out.println("stack.min = " + stack.min());
        System.out.println(Arrays.toString(stack.s));
        System.out.println("popped = " + stack.pop());
        System.out.println("stack.min = " + stack.min());
        System.out.println("popped = " + stack.pop());
        System.out.println("stack.min = " + stack.min());
        System.out.println("popped = " + stack.pop());
        System.out.println("stack.min = " + stack.min());
        System.out.println("popped = " + stack.pop());
        System.out.println("stack.min = " + stack.min());
    }

    public void push(int a) {

        if(tos == -1) {
            tos++;
            s[tos] = a;
            min = a;
            return;
        }
        if(a < min) {
            tos++;
            s[tos] = 2 * a - min;
            min = a;
        } else {
            tos++;
            s[tos] = a;
        }
    }

    public int pop() {
        if(tos == -1) {
            return -1; // stack empty message
        }
        if(s[tos] < min) {
            int temp =  min;
            min = 2 * min - s[tos];
            tos--;
            return temp;
        }
        tos--;
        return s[tos+1];
    }

    public int topOfStack() {
        return s[tos];
    }

    public int min() {
        return min;
    }
}
