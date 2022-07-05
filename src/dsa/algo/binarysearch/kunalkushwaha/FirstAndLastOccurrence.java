package dsa.algo.binarysearch.kunalkushwaha;

public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 10, 10, 22, 22, 22, 22, 43, 43, 43};
        int target = 22;
        System.out.println("first = " + findFirst(arr, 0, arr.length - 1, target) + ", last = " + findLast(arr, 0, arr.length - 1, target));
        // you can add checks for target greater than max or less than min
    }

    private static int findFirst(int[] arr, int s, int e, int t) {
        if(s > e) {
            return arr[s] == t ? s : -1;
        }
        int mid = s + (e-s)/2;

        if(t > arr[mid]) {
            s = mid + 1;
        } else {
            e = mid - 1;
        }
        return findFirst(arr, s, e, t);
    }

    private static int findLast(int[] arr, int s, int e, int t) {
        if(s > e) {
            return arr[e] == t ? e : -1;
        }
        int mid = s + (e-s)/2;
        if(t < arr[mid]) {
            e = mid - 1;
        } else {
            s = mid + 1;
        }
        return findLast(arr, s, e, t);
    }
}
