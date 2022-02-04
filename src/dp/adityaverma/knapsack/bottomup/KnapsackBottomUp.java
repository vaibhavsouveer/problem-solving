package dp.adityaverma.knapsack.bottomup;

public class KnapsackBottomUp {
    public static void main(String[] args) {
        int[] w = {1, 4, 2, 6, 5, 3, 8, 4, 11, 14, 2, 5};
        int[] v = {1, 6, 3, 7, 6, 3, 9, 5, 11, 17, 4, 7};
        int W = 13;

        int maxValue = knapSack(w, v, w.length, W);
        System.out.println("maxValue = " + maxValue);
    }


    /*
    BottomUp approach for 0/1 KnapSack
     */
    public static int knapSack(int[] w, int[] v, int n, int W) {
        int[][] t = new int[n+1][W+1];
        for(int i = 0; i <= n; i++) {
            t[i][0] = 0;
        }
        for(int j = 0; j <= W; j++ ) {
            t[0][j] = 0;
        }

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= W; j++) {
                if(w[i-1] > j) {
                    t[i][j] = t[i-1][j];
                } else {
                    t[i][j] = Math.max(v[i-1] + t[i-1][j-w[i-1]], t[i-1][j]);
                }
            }
        }
        return t[n][W];
    }
}
