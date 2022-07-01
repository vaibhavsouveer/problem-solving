package dsa.algo.recursion.string.kunalkushwaha;

public class ReverseString {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println("reversed string = " + fun(str, str.length()));
    }

    private static String fun(String str, int len) {
        if(len == 0) {
            return "";
        }
        return str.charAt(len - 1) + fun(str, len - 1);
    }
}
