package dsa.dp.problems.knapsack.subsetproduct;

public class SubsetProductBottomUp {
    public static void main(String[] args) {
        int[] arr = new int[]{2,2,3,3,6,4};
        int P = 12;
        System.out.println("subsetProduct() = " + subsetProduct(arr, arr.length, P));
    }

    private static boolean subsetProduct(int[] arr, int n, int P) {
        boolean[][] t = new boolean[n+1][P+1];
        for(int i = 0; i <= P; i++) {
            t[0][i] = false;
        }
        for(int i = 0; i <= n; i++) {
            t[i][0] = false;
        }

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                int sqrt = (int)Math.sqrt(i) + 1;
                if(arr[i-1] > j || arr[i-1] >= sqrt || j % arr[i-1] != 0) {
                    t[i][j] = t[i-1][j];
                } else {
                    t[i][j] = t[i-1][j / arr[i-1]] || t[i-1][j];
                }
            }
        }
        return t[n][P];
    }
}
