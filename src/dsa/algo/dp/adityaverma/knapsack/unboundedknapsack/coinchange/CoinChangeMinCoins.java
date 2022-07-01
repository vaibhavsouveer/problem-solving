package dsa.algo.dp.adityaverma.knapsack.unboundedknapsack.coinchange;

/*
Given set of coins and a sum, find minimum number of coins to get sum
 */
public class CoinChangeMinCoins {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5, 4};
        int S = 7;
        System.out.println("Min coins to get sum = " + coinChangeMinCoins(coins, coins.length, S));
        //System.out.println("Max coins to get sum = " + coinChangeMaxCoins(coins, coins.length, S));
    }

    private static int coinChangeMinCoins(int[] coins, int n, int S) {
        // any combination not possible to get the Sum we will mark it as infinity, i.e. MAX-1
        int[][] t = new int[n+1][S+1];

        for(int j = 0; j <= n; j++) {
            t[j][0] = 0;
        }
        for(int j = 0; j <= S; j++) {
            t[0][j] = Integer.MAX_VALUE-1;
        }
        // to initialize the second row
        for(int j = 1; j <= S; j++) {
            if(j % coins[0] == 0) {
                t[1][j] = j / coins[0];
            } else {
                t[1][j] = Integer.MAX_VALUE-1;
            }
        }

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= S; j++) {
                if(coins[i-1] > j) {
                    t[i][j] = t[i-1][j];
                } else {
                    t[i][j] = Math.min(t[i][j-coins[i-1]] + 1, t[i-1][j]);
                }
            }
        }
        return t[n][S];
    }

    private static int coinChangeMaxCoins(int[] coins, int n, int S) {
        int[][] t = new int[n+1][S+1];

        for(int j = 0; j <= n; j++) {
            t[j][0] = 0;
        }
        for(int j = 0; j <= S; j++) {
            t[0][j] = Integer.MIN_VALUE;
        }
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= S; j++) {
                if(coins[i-1] > j) {
                    t[i][j] = t[i-1][j];
                } else {
                    t[i][j] = Math.max(t[i][j-coins[i-1]] + 1, t[i-1][j]);
                }
            }
        }
        return t[n][S];
    }
}
