public class JavaException6 {
    static void checkAge (int age) throws ArithmeticException{
        if (age < 18){
          //  throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void ThrowsKeyword(){
        //checkAge(15); //Set age to 15 (below 18...)
    }
}

