package dsa.ds.matrix;

import commons.util.array.ArrayUtil;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortMatrixDiagonally {

    public static void main(String[] args) {
        int[][] mat = {
                {3,3,1,1},
                {2,2,1,2},
                {1,1,1,2}
        };
        ArrayUtil.printArray(diagonalSort(mat), mat.length, mat[0].length);
    }

    public static int[][] diagonalSort(int[][] mat) {
        int row = mat.length;
        int column = mat[0].length;
        List<List> sortedMat = new ArrayList<>();
        for(int r = row-1; r >= 0; r--) {
            List<Integer> diagonal = new ArrayList<>();
            for(int i = r, j = 0; i < row && j < column; i++, j++) {
                diagonal.add(mat[i][j]);
            }
            diagonal.sort(Comparator.comparingInt(num -> num));
            sortedMat.add(diagonal);
        }

        for(int c = 1; c < column; c++) {
            List<Integer> diagonal = new ArrayList<>();
            for(int i = 0, j = c; i < row && j < column; i++, j++) {
                diagonal.add(mat[i][j]);
            }
            diagonal.sort(Comparator.comparingInt(num -> num));
            sortedMat.add(diagonal);
        }
        System.out.println(sortedMat);

        // put sorted value in matrix
        int numD = 0;
        for(int r = row-1; r >= 0; r--, numD++) {
            List<Integer> sortedDiagonal = sortedMat.get(numD);
            int k = 0;
            for(int i = r, j = 0; i < row && j < column; i++, j++, k++) {   // k < sortedDiagonal.size()
                mat[i][j] = sortedDiagonal.get(k);
            }
        }

        for(int c = 1; c < column; c++, numD++) {
            List<Integer> sortedDiagonal = sortedMat.get(numD);
            int k = 0;
            for(int i = 0, j = c; i < row && j < column; i++, j++, k++) {
                mat[i][j] = sortedDiagonal.get(k);
            }
        }
        return mat;
    }
}
