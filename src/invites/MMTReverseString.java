package invites;

/*
https://leetcode.com/problems/reverse-words-in-a-string/
 */
public class MMTReverseString {
    public static void main(String[] args) {
        String input = " abc ";
        System.out.println(fun(input, input.length(), 0, "", "").trim());
    }

    private static String fun(String input, int n, int i, String temp, String output) {
        if(i == n) {
            if (!temp.isEmpty()) {
                output = temp + " " + output;
            }
            return output;
        }
        char ch = input.charAt(i);
        if(ch == ' ') {
            return fun(input, n, i+1, "", temp.isEmpty() ? output : temp + " " + output);
        }
        return fun(input, n, i+1, temp+ch, output);
    }
}
