package dsa.ds.string;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatedCharacterInAString {
    public static void main(String[] args) {
        String input = "Vaibhav Souveer";
        System.out.println("firstRepeatedCharacter = " + firstRepeatedCharacter(input));
    }

    private static char firstRepeatedCharacter(String input) {
        char[] charArray = input.toCharArray();
        Map<Character, Integer> countMap = new HashMap<>();
        for(int i = 0; i < charArray.length; i++) {
            if(countMap.get(charArray[i]) == null) {
                countMap.put(charArray[i], 1);
            } else {
                return charArray[i];
            }
        }
        return '-'; // return - if none of the characters are repeated
    }
}
