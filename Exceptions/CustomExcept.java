//whenever we extend exception class to any other class then that class will become an exception.
class InvalidAgeException extends Exception {
    public InvalidAgeException(String str) {
        super(str);
    }
}

public class CustomExcept {
    
    static void validate(int age) throws InvalidAgeException {
        if(age < 18) throw new InvalidAgeException("Age is not valid to vote");
        else System.out.println("Welcome to voting process");
    }
    
    public static void main(String[] args) {
        try {
            validate(16);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}