package tests.paytm.round1;

/**
 * Equilibrium/Pivot index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
 * For example, in an array A:
 * <p>
 * Example :
 * Input: A[] = {-7, 1, 5, 2, -4, 3, 0}
 * Output: 3
 * 3 is an equilibrium index, because:
 * A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
 * <p>
 * Input: A[] = {1, 2, 3}
 * Output: -1
 */
public class FindPivotElement {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        System.out.println("Pivot = " + findPivot(arr));

    }

    public static int findPivot(int[] arr) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum = totalSum + arr[i];
        }
        System.out.println("totalSum = " + totalSum);

        int leftSum = 0;
        for (int i = 0; i + 1 < arr.length - 1; i++) {
            leftSum = leftSum + arr[i];
            if (leftSum * 2 + arr[i + 1] == totalSum) {
                return i + 1;
            }
        }
        return -1;
    }
}

