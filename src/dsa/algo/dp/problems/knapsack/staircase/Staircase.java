package dsa.algo.dp.problems.knapsack.staircase;

/*
Given an array of allowed steps and a value for step, count number of paths possible to reach the step.

This is exact problem for count of subset sum for unbounded KnapSack.
 */
public class Staircase {
    public static void main(String[] args) {
        int[] steps = {1, 2};
        int topStep = 4;
        System.out.println("Total count = " + fun(steps, steps.length, topStep));
    }

    private static int fun(int[] arr, int n, int S) {
        int[][] t = new int[n+1][S+1];
        for(int j = 0; j <= S; j++) {
            t[0][j] = 0;
        }
        for(int i = 0; i <= n; i++) {
            t[i][0] = 1;
        }

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= S; j++) {
                if(arr[i-1] > j) {
                    t[i][j] = t[i-1][j];
                } else {
                    t[i][j] = t[i][j-arr[i-1]] + t[i-1][j];
                }
            }
        }
        return t[n][S];
    }
}
