package gs;

import java.util.stream.Stream;

public class Pangram {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        Pangram pd = new Pangram();
        boolean success = true;

        success = success && "".equals(pd.findMissingLetters("The quick brown fox jumps over the lazy dog"));
        success = success && "abcdefghijklmnopqrstuvwxyz".equals(pd.findMissingLetters(""));

        if (success) {
            System.out.println("Pass ");
        } else {
            System.out.println("Failed");
        }
    }

    public String findMissingLetters(String sentence) {
        sentence = sentence.toUpperCase();
        Stream.of(sentence)
                .forEach(ch -> System.out.println("ch = " + ch));

        return "";
    }
}
