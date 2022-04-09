package dsa.recursion.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr =  new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 91;
        System.out.println("Index = " + fun(arr, 0, arr.length-1, target));

    }

    private static int fun(int[] arr, int s, int e, int t) {
        if(s > e) {
            return -1;
        }
        int mid = s + (e-s)/2;
        if(t == arr[mid]) {
            return mid;
        }
        if(t > arr[mid]) {
            s = mid+1;
        } else {
            e = mid -1;
        }
        return fun(arr, s, e, t);
    }
}
