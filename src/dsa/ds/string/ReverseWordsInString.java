package dsa.ds.string;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String input = "a good   example";
        String[] s = input.trim().split(" ");
        StringBuilder result = new StringBuilder();
        for(String str : s) {
            if(!str.isBlank()) {
                result = new StringBuilder(str).append("_").append(result);
            }
        }
        System.out.println(result.deleteCharAt(result.length()-1));
    }
}
