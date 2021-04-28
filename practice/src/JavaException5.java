public class JavaException5 {
    public static void ThrowKeyword(){
        try{
            throw new MyException(2);
            //throw is used to create a new exception and throw it to the catch block.
        }
        catch(MyException e){
            System.out.println(e);
        }
    }
}

