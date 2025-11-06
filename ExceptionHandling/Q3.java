public class Q3 {
    public static void main(String[] args) {
        try {
            try {
                int a = 5 / 0;
            }
            catch (NullPointerException e) {
                System.out.println("Inner");
            }
        }
        catch (ArithmeticException e) {
            System.out.println("Outer");
        }
    }
}
