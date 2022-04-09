package dsa.recursion;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 1, 3, 5, 31};
        System.out.println("Is arr sorted = " + fun(arr, arr.length));
    }

    static boolean fun(int[] arr, int n) {
        if(n == 1) {
            return true;
        }
        return arr[n-1] > arr[n-2] && fun(arr, n-1);

    }
}
