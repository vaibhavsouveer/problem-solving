package dsa.algo.binarysearch.kunalkushwaha;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 10, 10, 22, 22, 22, 22, 43, 43, 43};
        int target = 22;
        System.out.println("ceiling = " + funIndex(arr, 0, arr.length-1, target));
    }

    /*
    If number itself is present return the next number
     */
    private static int funIndex(int[] arr, int s, int e, int t) {
        // if number is greater than largest number in array
        if(t >= arr[arr.length-1]) {
            return -1;
        }
        if(s > e) {
            return s;
        }
        int mid = s + (e-s)/2;
        if(t >= arr[mid]) {
            s = mid+1;
        } else {
            e = mid-1;
        }
        return funIndex(arr, s, e, t);
    }

    public static int fun(int[] arr, int s, int e, int t) {
        if(s > e) {
            if(s == arr.length) {
                // means target is greater that max number in array
                return -1;
            }
            return arr[s];
        }
        int mid = s + (e-s)/2;
        if(t == arr[mid]) {
            return arr[mid];
        }
        if(t > arr[mid]) {
            s = mid+1;
        } else {
            e = mid-1;
        }
        return fun(arr, s, e, t);
    }
}
