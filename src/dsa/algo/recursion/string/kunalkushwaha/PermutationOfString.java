package dsa.algo.recursion.string.kunalkushwaha;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfString {
    public static void main(String[] args) {
        String input = "abcd";
        fun(input, input.length(), "");
        System.out.println();
        System.out.println(funList(input, input.length(), ""));
        System.out.println();
        System.out.println("count of permutations = " + funCount(input, input.length(), ""));
    }

    /*
    print the permutations
     */
    private static void fun(String input, int n, String output) {
        if(n == 0) {
            System.out.print(output + " ");
        } else {
            for(int i = 0; i <= output.length(); i++) {
                fun(input, n-1, new StringBuilder(output).insert(i, input.charAt(n-1)).toString());
            }
        }
    }

    /*
    return the permutations as a list
     */
    private static List<String> funList(String input, int n, String output) {
        List<String> permutations = new ArrayList<>();
        if(n == 0) {
            permutations.add(output);
        } else {
            for(int i = 0; i <= output.length(); i++) {
                permutations.addAll(funList(input, n-1, new StringBuilder(output).insert(i, input.charAt(n-1)).toString()));
            }
        }
        return permutations;
    }

    /*
    return the number of permutations
    total possible permutations will be n!
     */
    private static int funCount(String input, int n, String output) {
        int count = 0;
        if(n == 0) {
            return 1;
        }
        for(int i = 0; i <= output.length(); i++) {
            count = count + funCount(input, n-1, new StringBuilder(output).insert(i, input.charAt(n-1)).toString());
        }
        return count;

    }


}
