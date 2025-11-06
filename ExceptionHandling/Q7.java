public class Q7 {

    public static void main(String[] args) {

        try{
            String name = null;
            System.out.println(name.length());
        }
        catch (NullPointerException e){
            System.out.println("Null value encountered");
        }
//        finally {
//            System.out.println("Execution completed");
//        }
    }
}
