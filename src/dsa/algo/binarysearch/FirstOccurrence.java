package dsa.algo.binarysearch;

/*
Find the first and last occurrence of an element in a sorted array
 */
public class FirstOccurrence {
    public static void main(String[] args) {
        int[] arr = new int[] {3, 4, 4, 5, 5, 5, 7, 7, 7, 7, 8, 11, 11, 22, 32};
        int target = 5;
        System.out.println("First index = " + fun(arr, 0, arr.length-1, target));
    }

    private static int fun(int[] arr, int s, int e, int t) {
        if(arr.length == 0) {
            return -1;
        }
        if(s > e) {
            if(e == -1) { // edge case for target smaller that smallest number in array
                return -1;
            }
            if(s == arr.length) { // edge case for target greater than max element in array, can combine with above
                return -1;
            }
            return s;
        }
        int mid = s + (e - s) / 2;
        if(arr[mid] == t) {
            e = mid - 1;
        } else if(t > arr[mid]) {
            s = mid+1;
        } else {
            e = mid-1;
        }
        return fun(arr, s, e, t);
    }
}
