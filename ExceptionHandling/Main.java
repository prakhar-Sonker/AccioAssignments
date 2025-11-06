// Main Program
public class Main {
    public static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid age for voting");
        }
    }

    public static void main(String[] args) {
        int age = 16;
        try {
            validate(age);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
