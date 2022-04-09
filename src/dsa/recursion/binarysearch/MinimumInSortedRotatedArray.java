package dsa.recursion.binarysearch;

public class MinimumInSortedRotatedArray {
    public static void main(String[] args) {
        int[] arr = new int[]{11, 22, 32, 45, 3, 4, 5, 7};
        System.out.println("index of minimum element is = " + fun(arr, 0, arr.length-1));
    }

    private static int fun(int[] arr, int s, int e) {
        if(s > e) {
            return -1;
        }
        int mid = s + (e - s)/2;
        int prev = (mid + arr.length-1) % arr.length;
        int next = (mid+1) % arr.length;
        if(arr[mid] < arr[prev] && arr[mid] < arr[next]) {
            return mid;
        }
        // search in unsorted part
        if(arr[s] < arr[mid]) {
            s = mid+1;
        } else {
            e = mid-1;
        }
        return fun(arr, s, e);
    }
}
