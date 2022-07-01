package dsa.algo.dp.adityaverma.lcs;

public class LCSRecursive {
    public static void main(String[] args) {
        String x = "abcdg";
        String y = "abcdhr";
        System.out.println("fun() = " + fun(x, y, x.length(), y.length()));


    }

    public static int fun(String x, String y, int m, int n) {
        if(m == 0 || n == 0) {
            return 0;
        }
        if(x.charAt(m-1) == y.charAt(n-1)) {
            return 1 + fun(x, y, m-1, n-1);
        }
        return Math.max(fun(x, y, m-1, n), fun(x, y, m, n-1));
    }
}
