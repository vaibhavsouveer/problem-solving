package core.exception;

public class CustomExceptionPlayground {
    public static void main(String[] args) {
        try {
            throw new NameShouldContainOnlyStringsException("name is invalid");
        } catch (NameShouldContainOnlyStringsException e) {
            e.printStackTrace();
        }
    }
}

class NameShouldContainOnlyStringsException extends Exception {

    public NameShouldContainOnlyStringsException(String message) {
        super(message);
    }
}


