package dsa.array.majorityelement;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
Given an array, find its majority element.
Majority element is one which occurs more than n/2 times (equal to will not be majority element)
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = new int[]{ 2, 1, 0, 1, 8, 1};
        System.out.println("length of array = " + arr.length);
        System.out.println("Majority element is = " + majorityElement(arr));
        System.out.println("Majority element using Moore's Algorithm is = " + mooresAlgorithm(arr));
    }

    /*
    Solution using hashmap - takes O(n) time and space complexity
     */
    private static String majorityElement(int[] arr) {
        String majorityE =  "No majority element in array";
        if(arr.length < 2) {
            return "No majority element in array";
        }
        Map<Integer, Integer> occurrenceMap = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            Integer val = occurrenceMap.get(arr[i]);
            if(val == null) {
                occurrenceMap.put(arr[i], 1);
            } else {
                occurrenceMap.put(arr[i], val + 1);
            }
        }
        Set<Integer> keys = occurrenceMap.keySet();
        for(int i : keys) {
            if(occurrenceMap.get(i) > arr.length/2) {
                majorityE = String.valueOf(i);
                break;
            }
        }
        return majorityE;
    }


    /*
    Moore's voting algorithm to find majority of a sequence of elements in O(n) time and O(1) space complexity
     */
    private static int mooresAlgorithm(int[] arr) {
        int element = arr[0];
        int count = 1;

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == element) {
                count++;
            } else {
                if(count == 0) {
                    element = arr[i];
                    count++;
                }
                count--;
            }
        }
        if(count < 1) {
            return -1; // no majority element
        }
        count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == element) {
                count++;
            }
        }
        if(count > arr.length/2) {
            return element;
        }
        return -1;

    }
}
