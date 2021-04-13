public class AccessStaticBlock {
    static int a;
    static int b;


    static {
        a=10;
        b=20;
    }


    public static void staticBlock(){
        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b);
    }
}

