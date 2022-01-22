package dp.knapsack.recursive;

public class Knapsack {
    public static void main(String[] args) {
        int[] w = {1, 4, 2, 6, 5, 3, 8, 4, 11, 14, 2, 5};
        int[] v = {1, 6, 3, 7, 6, 3, 9, 5, 11, 17, 4, 7};
        int W = 13;

        int maxValue = knapSack(w, v, w.length, W);
        System.out.println("maxValue = " + maxValue);
    }

    /*
    Recursive approach for 0/1 KnapSack
     */
    public static int knapSack(int[] w, int[] v, int n, int W) {
        if (n == 0 || W == 0) {
            return 0;
        }
        if (w[n - 1] > W) {
            return knapSack(w, v, n - 1, W);
        }
        return Math.max(v[n - 1] + knapSack(w, v, n - 1, W - w[n - 1]), knapSack(w, v, n - 1, W));
    }
}
