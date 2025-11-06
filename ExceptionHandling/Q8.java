import java.io.FileReader;
import java.io.FileNotFoundException;

public class Q8 {
    public static void main(String[] args) {
        try {
            // Trying to read a file that does not exist
            FileReader file = new FileReader("nonexistent.txt");
            System.out.println("File opened successfully.");
        }
        catch (FileNotFoundException e) {
            // Handling the checked exception
            System.out.println("File not found! Please check the file path.");
        }
        finally {
            System.out.println("Program finished executing.");
        }
    }
}
