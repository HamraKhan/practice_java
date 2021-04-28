public class JavaException3 {
    public static void TryCatch3() {
        try {
            int d = 0;
            int n = 20;
//            int fraction = n / d;
            int[] g = {
                    1
            };
            g[20] = 100;
        }
        catch (ArithmeticException ae) {
            System.out.println("In the catch block due to Exception = " + ae);
        }
        catch (ArrayIndexOutOfBoundsException aioe) {
            System.out.println("In the catch block due to Exception = " + aioe);
        }
        catch(Exception e){
            System.out.println("In the catch block due to Exception = "+e);
        }
        System.out.println("End Of Main");
    }
}
