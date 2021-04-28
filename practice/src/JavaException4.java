public class JavaException4 {
    public static void FinallyExample(){
        try{
            int d = 1;
            int n =20;
            int fraction = n/d;
        }
        catch(ArithmeticException e){
            System.out.println("In the catch block due to Exception = "+e);
        }
        finally{
            System.out.println("Inside the finally block");
        }
    }
}

