package core.exception;

public class CloneNotSupportedPlayground {
    public static void main(String[] args) {
        try {
            System.out.println("In try");
            throw new CloneNotSupportedException("Can't clone");
        } catch(CloneNotSupportedException ex) {
            System.out.println("In catch, ex is = " + ex.getMessage());
        } finally {
            System.out.println("In finally");
        }
    }
}
