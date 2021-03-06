package dsa.algo.dp.adityaverma.lcs.palindrome;

public class LPSBottomUp {
    public static void main(String[] args) {
        String a = "agbcba";
        System.out.println("fun() = " + fun(a, new StringBuilder(a).reverse().toString(), a.length(), a.length()));

    }

    public static int fun(String x, String y, int m, int n) {
        if(m == 0 || n == 0) {
            return 0;
        }
        int[][] t = new int[m+1][n+1];
        for(int i = 0; i <= m; i++) {
            t[i][0] = 0;
        }
        for(int i = 0; i <= n; i++) {
            t[0][i] = 0;
        }

        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                }
            }
        }
        return t[m][n];

    }
}
