public class ThrowConcept {

    public static void main(String[] args) {

//        int age = 17;
//        if(age < 18){
////            exception
//            throw new UnderAgeException("You are under age");
//        }
//        System.out.println("You can vote!!!");


        int age=20;
        try{
            checkAge(age);
        }
        catch (UnderAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean checkAge(int age){
        if(age<18){
            throw new UnderAgeException("You are underage");
        }
        return true;
    }
}
