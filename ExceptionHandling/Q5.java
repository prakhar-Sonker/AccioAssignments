public class Q5 {
    public static void main(String[] args) {
        System.out.println(test());
    }

    public static int test() {
        try {
            return 1;
        }
        finally {
            return 2;
        }
    }
}
