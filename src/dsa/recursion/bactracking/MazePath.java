package dsa.recursion.bactracking;

import java.util.ArrayList;
import java.util.List;

/*
Find all possible paths from (0,0) to (n,n)
 */
public class MazePath {
    public static void main(String[] args) {
        System.out.println("Possible paths = " + fun(3, 3, 0, 0, ""));
    }

    /*
    only right and down movements are allowed
    diagonal is not allowed
    m is number of rows and n is number of columns
     */
    private static List<String> fun(int m, int n, int i, int j, String path) {
        List<String> paths = new ArrayList<>();
        if(i == m-1 && j == n-1) {
            paths.add(path);
            return paths;
        }
        if(i == m-1) {
            paths.addAll(fun(m, n, i, j+1, path+"R"));
        } else if(j == n-1) {
            paths.addAll(fun(m, n, i+1, j, path+"D"));
        } else {
            paths.addAll(fun(m, n, i, j+1, path+"R"));
            paths.addAll(fun(m, n, i+1, j, path+"D"));
        }
        return paths;
    }
}
