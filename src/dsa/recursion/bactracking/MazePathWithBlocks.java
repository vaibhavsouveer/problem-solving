package dsa.recursion.bactracking;

import java.util.ArrayList;
import java.util.List;

/*
Find all possible paths from (0,0) to (n,n) when certain positions in the matrix are blocked
 */
public class MazePathWithBlocks {
    public static void main(String[] args) {
        boolean[][] arr = new boolean[][]{
                new boolean[]{true, true, true},
                new boolean[]{true, false, true},
                new boolean[]{true, true, true}};
        System.out.println("Possible ways = " + fun(arr, arr.length, arr[0].length, 0, 0, ""));
    }

    /*
    only right and down movements are allowed
    diagonal is not allowed
    m is number of rows and n is number of columns
    block is represented as false in a boolean matrix
     */
    private static List<String> fun(boolean[][] arr, int m, int n, int i, int j, String path) {
        List<String> allPaths = new ArrayList<>();
        if(!arr[i][j]) {
            return allPaths;
        }
        if(i == m-1 && j == n-1) {
            allPaths.add(path);
            return allPaths;
        }
        if(i == m-1) {
            allPaths.addAll(fun(arr, m, n, i, j+1, path + "R"));
        } else if(j == n-1) {
            allPaths.addAll(fun(arr, m, n, i+1, j, path + "D"));
        } else {
            allPaths.addAll(fun(arr, m, n, i, j+1, path+"R"));
            allPaths.addAll(fun(arr, m, n, i+1, j, path+"D"));
        }
        return allPaths;
    }
}
