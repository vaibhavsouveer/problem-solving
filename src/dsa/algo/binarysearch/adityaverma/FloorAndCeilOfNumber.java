package dsa.algo.binarysearch.adityaverma;

/*
Find floor and ceil of a given number in a sorted array
 */
public class FloorAndCeilOfNumber {
    public static void main(String[] args) {
        // int[] arr = new int[]{21, 21, 22, 22, 26, 26, 28, 28};
        // int[] arr = new int[]{21, 22, 23, 24, 26, 28, 29};
        int[] arr = new int[]{21, 21, 21,  22, 22, 22, 22, 23, 23, 23, 23, 24, 24, 24, 26, 26, 26, 28, 28, 28, 29, 29, 29, 29};
        int target = 25 ;
        int[] res = fun(arr, 0, arr.length - 1, target);
        System.out.println("floor = " + res[0] + ", ceil = " + res[1]);

    }

    public static int[] fun(int[] arr, int s, int e, int t) {
        if(s > e) {
            System.out.println("s = " + s);
            System.out.println("e = " + e);
            if(s >= arr.length) {
                return new int[]{arr[e], -1};
            }
            if(e < 0) {
                return new int[]{-1, arr[s]};
            }
            return new int[]{arr[e], arr[s]};
        }
        int mid = s + (e-s)/2;
        if(arr[mid] == t) {
            System.out.println("mid = " + mid);
            return new int[]{arr[mid], arr[mid]};
        }
        if(t > arr[mid]) {
            s = s+1;
        } else {
            e =  mid - 1;
        }
        return fun(arr, s, e, t);
    }
}
