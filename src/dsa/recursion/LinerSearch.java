package dsa.recursion;

public class LinerSearch {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 1, 3, 5, 31, 3, 7};
        int target = 3;
        System.out.println("Is " + target + " present = " + fun(arr, arr.length, target));
        System.out.println("Index = " + funIndex(arr, arr.length, target));
    }

    /*
    returns true if present, false if not
     */
    static boolean fun(int[] arr, int n, int t) {
        if(n == 0) {
            return false;
        }
        return arr[n-1] == t || fun(arr, n-1, t);

    }

    /*
    returns index if present, -1 if not
     */
    static int funIndex(int[] arr, int n, int t) {
        if(n == 0) {
            return -1;
        }
        if(arr[n-1] == t) {
            return n-1;
        }
        return funIndex(arr, n-1, t);
    }
}
