package dsa.ds.array.matrix;

/*
Given a matrix whose each row is sorted and each column is sorted, return the coordinates of given element.
 */
public class ElementInSortedMatrix {
    public static void main(String[] args) {
        int[][] arr =  new int[][] {
                new int[]{10, 20, 30, 40, 50},
                new int[]{15, 25, 35, 45, 55},
                new int[]{17, 26, 37, 46, 56},
                new int[]{27, 40, 58, 60, 71},
        };
        int target = 74;

        int[] position = findElement(arr, arr.length, arr[0].length, target);
        System.out.println("position = " + position[0] + ", " + position[1]);
    }

    private static int[] findElement(int[][] arr, int m, int n, int t) {
        int i = 0;
        int j = n-1;
        while (i < m && j >= 0) {
            if (arr[i][j] == t) {
                return new int[]{i, j};
            }
            if (t > arr[i][j - 1]) {
                i++;
            } else {
                j--;
            }

        }
        return new int[]{-1, -1};
    }
}
