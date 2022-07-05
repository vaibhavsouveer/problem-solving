package dsa.algo.dp.problems.knapsack.staircase;

/*
You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.

You can either start from the step with index 0, or the step with index 1.

Return the minimum cost to reach the top of the floor.
 */
public class JumpStaircase {
    public static void main(String[] args) {
        int[] steps = {10,15,20};
        System.out.println("Min cost = " + fun(steps, steps.length, 0, 0));
    }

    private static int fun(int[] steps, int n, int i, int cost) {
        if(i >= n) {
            return cost;
        }
        return Math.min(fun(steps, n, i+1, cost+steps[i]), fun(steps, n, i+2, cost+steps[i]));
    }

    private static int funDP(int[] steps, int n, int i, int cost) {
        int[] t = new int[n+1];
        t[0] = 0;
        for(int k = 1; k <= n; k++) {
            //t[k] = Math.min();
        }
        return 000;
    }
}
