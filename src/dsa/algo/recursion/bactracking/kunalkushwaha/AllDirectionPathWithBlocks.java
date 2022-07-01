package dsa.algo.recursion.bactracking.kunalkushwaha;

import java.util.ArrayList;
import java.util.List;

/*
Find all possible paths from (0,0) to (n,n)
 */
public class AllDirectionPathWithBlocks {
    public static void main(String[] args) {
        boolean[][] arr = new boolean[][]{
                new boolean[]{true, true, true},
                new boolean[]{true, true, true},
                new boolean[]{true, true, true}};

        System.out.println("Possible ways = " + fun(arr, arr.length, arr[0].length, 0, 0, ""));

    }

    /*
    movements in all four directions are allowed
    diagonal is not allowed
    m is number of rows and n is number of columns
     */
    private static List<String> fun(boolean[][] arr, int m, int n, int i, int j, String path) {
        if(!arr[i][j]) {
            return new ArrayList<>();
        }
        List<String> allPaths = new ArrayList<>();
        if(i == m-1 && j == n-1) {
            allPaths.add(path);
            return allPaths;
        }
        arr[i][j] = false;
        if(i == m-1) {
            allPaths.addAll(fun(arr, m, n, i, j+1, path + "R"));
            allPaths.addAll(fun(arr, m, n, i-1, j, path + "U"));
            if(j != 0) {
                allPaths.addAll(fun(arr, m, n, i, j-1, path + "L"));
            }
        } else if(j == n-1) {
            allPaths.addAll(fun(arr, m, n, i+1, j, path + "D"));
            allPaths.addAll(fun(arr, m, n, i, j-1, path + "L"));
            if(i != 0) {
                allPaths.addAll(fun(arr, m, n, i-1, j, path + "U"));
            }
        } else {
            allPaths.addAll(fun(arr, m, n, i, j+1, path + "R"));
            allPaths.addAll(fun(arr, m, n, i+1, j, path + "D"));
            if(j != 0) {
                allPaths.addAll(fun(arr, m, n, i, j-1, path + "L"));
            }
            if(i != 0) {
                allPaths.addAll(fun(arr, m, n, i-1, j, path + "U"));
            }
        }
        arr[i][j] = true;
        return allPaths;
    }
}
