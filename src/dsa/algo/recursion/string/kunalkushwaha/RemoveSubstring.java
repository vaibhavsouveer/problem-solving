package dsa.algo.recursion.string.kunalkushwaha;

/*
Remove all occurrences of a given substring from a given string

&& !input.startsWith("jedimedi", i) is added for when we don't want to delete the substring if is part of another string
that we want to keep
 */
public class RemoveSubstring {
    public static void main(String[] args) {
        String input = "vaibhavjedisouveerfediwithjedimedijedi";
        String remove = "jedi";
        System.out.println("After removal = " + fun(input, 0, remove));
    }

    private static String fun(String input, int i, String t) {
        if(t.length() > input.length()) {
            return "Not valid - substring is longer than actual string";
        }
        if(i > input.length() - t.length()) {
            return input.substring(input.length() - t.length() + 1);
        }
        if(input.startsWith(t,  i) && !input.startsWith("jedimedi", i)) {
            i = i + t.length(); // skip the substring
            return fun(input, i, t);
        } else {
            return input.charAt(i) + fun(input, i + 1, t);
        }
    }
}
