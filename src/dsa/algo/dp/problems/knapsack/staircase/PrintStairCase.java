package dsa.algo.dp.problems.knapsack.staircase;

/*
Given an array of allowed steps and a value for step, print all possible paths to reach the step.
 */
public class PrintStairCase {
    public static void main(String[] args) {
        int[] steps = {1, 2};
        int S = 4;
        fun(steps, steps.length, S, "");
    }

    private static void fun(int[] arr, int n, int S, String path) {
        if(S == 0) {
            System.out.println(path);
            return;
        }
        if(n == 0) {
            return;
        }
        if(arr[n-1] > S) {
            fun(arr, n-1, S, path);
        } else {
            // because repetition of steps is allowed we are not decreasing n
            fun(arr, n, S-arr[n-1], path + " " + arr[n-1]);
            fun(arr, n-1, S, path);
        }
    }
}
