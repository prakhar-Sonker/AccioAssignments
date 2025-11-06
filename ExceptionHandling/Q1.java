public class Q1 {
        public static void main(String[] args) {
            System.out.println("A");
            try {
                int x = 10 / 0;
                System.out.println("B");
            }
            catch (ArithmeticException e) {
                System.out.println("C");
            }
            finally {
                System.out.println("D");
            }
            System.out.println("E");
        }
    }

