package dsa.algo.dp.adityaverma.knapsack.unboundedknapsack.rodcutting;

/*
A rod of length len is given and for each unit cut from 1 to len is given in one array and its
selling price is given in another array. We have to find how to cut the rod so as to maximize
selling price of rod.
For above case array for cuts may not be given also as it will be from 1 unit to len unit.

Sometimes specific length cuts may be mentioned. Example a rod of length 15 can be cut into 2, 3, 5
and 6 units only.
 */

/*
int[] c = {1, 4, 2, 6};
        int[] p = {1, 6, 3, 7};
        int L = 13;
 */
public class RodCuttingBottomUp {
    public static void main(String[] args) {
        int[] c = {4, 2, 6, 7};
        int[] p = {6, 3, 7, 5};
        int L = 11;

        int maxPrice = rodCut(c, p, c.length, L);
        System.out.println("max price = " + maxPrice);
    }


    /*
    BottomUp approach for rod cutting problem
     */
    public static int rodCut(int[] c, int[] p, int n, int L) {
        int[][] t = new int[n+1][L+1];
        for(int i = 0; i <= n; i++) {
            t[i][0] = 0;
        }
        for(int j = 0; j <= L; j++ ) {
            t[0][j] = 0;
        }

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= L; j++) {
                if(c[i-1] > j) {
                    t[i][j] = t[i-1][j];
                } else {
                    t[i][j] = Math.max(p[i-1] + t[i][j-c[i-1]], t[i-1][j]);
                }
            }
        }
        return t[n][L];
    }
}
