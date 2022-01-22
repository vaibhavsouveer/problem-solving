package test;

public class Test {
    public static void main(String[] args) {
        String input = "aabbcc";
        char c = 'a';
        int start = 0;
        int end = input.length()-1;
        System.out.println("position = " + findLetter(input, c, start, end));


    }

    static int findLetter(String input, char c, int start, int end) {
        if(input.length() == 0) return -1;
        int mid = (start+end)/2;

        char midChar = input.charAt(mid);

        if(midChar == c) {
            //aaaaab
            while(mid > 0 && midChar == input.charAt(mid - 1)) {
                if(mid == 0) return mid;
                mid = mid - 1;
            }
            return mid;
        } else {
            if(midChar > c) {
                end = mid;
                return findLetter(input, c, start, end );
            } else {
                start = mid + 1;
                return findLetter(input, c, start, end );
            }
        }

    }

    static int findLetterBin(String input, char c, int start, int end) {
        if(input.length() == 0) return -1;
        int mid = (start+end)/2;

        char midChar = input.charAt(mid);

        if(midChar == c) {
            if(midChar == input.charAt(mid - 1) && mid > 0) {
                return findLetterBin(input, c, start, mid -1);
            } else return mid;
        } else {
            if(midChar > c) {
                end = mid;
                return findLetterBin(input, c, start, end );
            } else {
                start = mid + 1;
                return findLetterBin(input, c, start, end );
            }
        }

    }
}
