package dsa.algo.recursion.bactracking.kunalkushwaha;

import commons.util.array.ArrayUtil;

public class NQueenProblem {
    public static void main(String[] args) {
        boolean[][] arr = new boolean[4][4];
        fun(arr, 0, 0);
    }

    private static void fun(boolean[][] arr, int i, int j) {
        if (arr[i][j]) {
            return;
        }
        // check all directions
        if (checkLeft(arr, i, j) || checkUp(arr, i, j) || checkLeftUpDiagonal(arr, i, j) || checkRightUpDiagonal(arr, i, j)) {
            if(j == arr[0].length-1) {
                return;
            } else {
                fun(arr, i, j+1);
            }
        } else {
            arr[i][j] = true;
            if(i == arr.length-1) {
                ArrayUtil.printArray(arr, arr.length, arr[0].length);
                System.out.println();
                arr[i][j] = false;
                return;
            }
            fun(arr, i+1, 0);
            arr[i][j] = false;
            if(j == arr[0].length-1) {
                return;
            } else {
                fun(arr, i, j+1);
            }

        }

    }

    private static boolean checkLeft(boolean[][] arr, int i, int j) {
        while (j >= 0) {
            if (arr[i][j]) {
                return true;
            }
            j--;
        }
        return false;
    }

    private static boolean checkUp(boolean[][] arr, int i, int j) {
        while (i >= 0) {
            if (arr[i][j]) {
                return true;
            }
            i--;
        }
        return false;
    }

    private static boolean checkLeftUpDiagonal(boolean[][] arr, int i, int j) {
        while (i >= 0 && j >= 0) {
            if (arr[i][j]) {
                return true;
            }
            i--;
            j--;
        }
        return false;
    }

    private static boolean checkRightUpDiagonal(boolean[][] arr, int i, int j) {
        while (i >= 0 && j < arr[0].length) {
            if (arr[i][j]) {
                return true;
            }
            i--;
            j++;
        }
        return false;
    }
}
