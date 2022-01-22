package core.string;

public class StringPalindrome {
    public static void main(String[] args) {
        String input = "malayalam";
        // System.out.println("isPalindrome = " + isPalindrome(input));
        System.out.println("isPalindromeRec = " + isPalindromeRec(input, 0, input.length()-1));
    }

    // iterative approach
    static boolean isPalindrome(String input) {
        if(input.length() == 0 || input.length() == 1) {
            return true;
        }
        for(int i = 0, j = input.length() - 1; i < j; i++, j-- ) {
            if(input.charAt(i) != input.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    // recursive approach
    static boolean isPalindromeRec(String input, int start, int end) {
        if(input.length() == 0 || input.length() == 1 || start > end) {
            return true;
        }
        if(input.charAt(start) != input.charAt(end)) {
            return false;
        } else return isPalindromeRec(input, start + 1, end - 1);

    }
}
