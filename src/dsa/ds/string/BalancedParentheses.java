package dsa.ds.string;

public class BalancedParentheses {
    public static void main(String[] args) {
        String input = "{}()[]";
        System.out.println("isBalanced = " + isBalanced(input, 0, input.length() - 1));

    }

    // using Stack, works for all
    static boolean checkBalanced(String input) {
        // open brackets push in stack
        // close brackets pop and check if matching
        return true;
    }

    // will work for "{[()]} type but not {}()[]
    static boolean isBalanced(String input, int start, int end) {
        if(input.length() == 0 || input.length() == 1) {
            return false;
        }
        if(start > end) {
            return true;
        }
        char parentheses = input.charAt(start);
        switch (parentheses) {
            case '{': {
                if (input.charAt(end) != '}') return false;
                else isBalanced(input, start + 1, end - 1);
            }
            case '[': {
                if (input.charAt(end) != ']') return false;
                else isBalanced(input, start + 1, end - 1);
            }
            case '(': {
                if (input.charAt(end) != ')') return false;
                else isBalanced(input, start + 1, end - 1);
            }
            default:return false;
        }
    }
}
