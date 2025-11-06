public class Q2 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[7] = 10 / 2;
            System.out.println("X");
        }
        catch (ArithmeticException e) {
            System.out.println("Y");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Z");
        }
        finally {
            System.out.println("W");
        }
    }
}
