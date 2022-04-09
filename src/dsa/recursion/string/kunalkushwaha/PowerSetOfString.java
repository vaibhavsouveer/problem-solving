package dsa.recursion.string.kunalkushwaha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Get all possible subsets of a given string
 */
public class PowerSetOfString {
    public static void main(String[] args) {
        String input = "abc";
        fun(input, input.length(), "");
        System.out.println();
        System.out.println("Power set = " + funList(input, input.length(), "", new ArrayList<>()));
    }

    /*
    Print the power set
     */
    private static void fun(String input, int n, String output) {
        if(n == 0) {
            System.out.print(output + " ");
            return;
        }
        fun(input, n-1, input.charAt(n-1) + output);
        fun(input, n-1, "" + output);
    }

    /*
    Return the power set as a list
     */
    private static ArrayList<String> funList(String input, int n, String output, ArrayList<String> list) {
        if(n == 0) {
            list.add(output);
            return list;
        }
        funList(input, n-1, input.charAt(n-1) + output, list);
        funList(input, n-1, "" + output, list);
        return list;
    }

    /*
    Without using extra parameter
     */
    private static List<String> funListPower(String x, int i, String output) {
        if(i == x.length()) {
            return new ArrayList<>(Arrays.asList(output));
        }
        List<String> left = funListPower(x, i+1, output + x.charAt(i));
        List<String> right = funListPower(x, i+1, output);

        List<String> ans = new ArrayList<>();
        if(!left.isEmpty()) {
            ans.addAll(left);
        }
        if(!right.isEmpty()) {
            ans.addAll(right);
        }
        return ans;

    }
}
