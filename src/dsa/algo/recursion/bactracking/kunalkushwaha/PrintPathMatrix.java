package dsa.algo.recursion.bactracking.kunalkushwaha;

import commons.util.array.ArrayUtil;

/*
Find all possible paths from (0,0) to (n,n)
 */
public class PrintPathMatrix {
    public static void main(String[] args) {
        int[][] arr = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

        fun(arr, arr.length, arr[0].length, 0, 0, 1);

    }

    /*
    movements in all four directions are allowed
    diagonal is not allowed
    m is number of rows and n is number of columns
    print path matrix
     */
    private static void fun(int[][] arr, int m, int n, int i, int j, int level) {
        if(arr[i][j] != 0) {
            return;
        }
        arr[i][j] = level;
        if(i == m-1 && j == n-1) {
            ArrayUtil.printArray(arr, m, n);
            System.out.println();
            arr[i][j] = 0;
            return;
        }
        if(i == m-1) {
            fun(arr, m, n, i, j+1, level+1);
            fun(arr, m, n, i-1, j, level+1);
            if(j != 0) {
                fun(arr, m, n, i, j-1, level+1);
            }
        } else if(j == n-1) {
            fun(arr, m, n, i+1, j, level+1);
            fun(arr, m, n, i, j-1, level+1);
            if(i != 0) {
                fun(arr, m, n, i-1, j, level+1);
            }
        } else {
            fun(arr, m, n, i, j+1, level+1);
            fun(arr, m, n, i+1, j, level+1);
            if(j != 0) {
                fun(arr, m, n, i, j-1, level+1);
            }
            if(i != 0) {
                fun(arr, m, n, i-1, j, level+1);
            }
        }
        arr[i][j] = 0;
    }
}
