package dsa.recursion.binarysearch.kunalkushwaha;

/*
Search for an element in sorted rotated array and return its index
We will use Binary Search since array is sorted
 */
public class SearchingInRotatedArray {
    public static void main(String[] args) {
        //int[] arr = new int[]{ 9, 22, 31, 35, 3, 5, 6};
        int[] arr = new int[]{ 22, 31, 0, 3, 5, 6, 8, 10, 12};
        int target = 311;
        System.out.println("Index = " + fun(arr, 0, arr.length - 1, target));
    }

    private static int fun(int[] arr, int s, int e, int t) {
        if(s > e) {
            return -1;
        }
        int mid = (s + e)/2;
        if(arr[mid] == t) {
            return mid;
        }
        if(arr[s] <= arr[mid]) {
            if(t >= arr[s] && t <= arr[mid]) {
                return fun(arr, s, mid-1, t);
            } else {
                return fun(arr, mid+1, e, t);
            }
        } else {
            if(t >= arr[mid] && t <= arr[e]) {
                return fun(arr, mid+1, e, t);
            } else {
                return fun(arr, s, mid-1, t);
            }
        }
    }
}
