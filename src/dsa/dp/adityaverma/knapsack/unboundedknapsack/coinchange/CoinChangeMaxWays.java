package dsa.dp.adityaverma.knapsack.unboundedknapsack.coinchange;

import commons.array.ArrayUtil;

/*
Given set of coins and a sum, how many ways are there to get that sum
 */
public class CoinChangeMaxWays {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5, 4};
        int S = 7;
        System.out.println("Ways to get sum = " + coinChange(coins, coins.length, S));
    }

    private static int coinChange(int[] coins, int n, int S) {
        int[][] t = new int[n+1][S+1];

        for(int j = 0; j <= S; j++) {
            t[0][j] = 0;
        }
        for(int j = 0; j <= n; j++) {
            t[j][0] = 1;
        }
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= S; j++) {
                if(coins[i-1] > j) {
                    t[i][j] = t[i-1][j];
                } else {
                    t[i][j] = t[i][j-coins[i-1]] + t[i-1][j];
                }
            }
        }
        ArrayUtil.printArray(t, n+1, S+1);
        return t[n][S];
    }
}
