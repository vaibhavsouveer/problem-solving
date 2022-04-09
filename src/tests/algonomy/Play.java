package tests.algonomy;

public class Play {
    public static void main(String[] args) {
        System.out.println("Last kid = " + fun(6, 9, 5));
    }

    private static int fun(int n, int m, int i) {
        int giftsUsed = n - (i-1);
        m = m - giftsUsed;
        System.out.println("m = " + m);
        while(m >= n) {
            m = m - n;
            System.out.println("m in loop " + m);
        }
        return m == 0 ? n : m;
    }

}

