package dsa.algo.recursion.string.kunalkushwaha;

/*
Remove all occurrences of a given character from a given String
 */
public class RemoveGivenCharacterFromString {
    public static void main(String[] args) {
        String str = "vaivvvvbhvvxxvav";
        char remove = 'v';
        System.out.println("After removal of '" + remove + "' = " + fun(str, str.length(), remove));
    }

    private static String fun(String str, int n, char t) {
        if(n == 0) {
            return "";
        }
        // because I am moving from right to left, so for the last element n-1 elements will already have been processed
        //so the recursive call is made before for the n-1 elements and then once we have the processed information for
        // n-1 part of the string we solve for nth element
        StringBuilder temp = new StringBuilder(fun(str, n - 1, t));
        if(str.charAt(n-1) != t) {
            temp.append(str.charAt(n-1));
        }
        return temp.toString();
    }
}
