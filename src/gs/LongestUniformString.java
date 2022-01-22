package gs;

public class LongestUniformString {
    public static void main(String[] args) {
        LongestUniformString ob = new LongestUniformString();
        String input = "aabbbbbCdAA";
        int[] result = ob.longestUniformSubstring(input);
        System.out.println(result[0] + " " + result[1]);
    }

    int[] longestUniformSubstring(String input) {
        int longestStart = 0;
        int longestLength = 1;
        int tempStart = 0;
        int tempLength = 0;
        for(int temp = longestStart+1; temp < input.length(); ) {
            if(input.charAt(tempStart) == input.charAt(temp)) {
                tempLength++;
                temp++;
            } else {
                if(tempLength > longestLength) {
                    longestLength = tempLength;
                    longestStart = tempStart;
                }
                tempStart = temp;
                temp++;
                tempLength = 1;
            }
        }
        return new int[]{longestStart, longestLength};
    }

}
