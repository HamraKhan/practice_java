public class GarbageCollectorMechanism {
    int a;
    int b;

    public void setData(int c, int d){
        a=c;
        b=d;
    }
    public void showData(){
        System.out.println("Value of a = " +a);
        System.out.println("Value of b = " +b);
    }


    @Override
    protected void finalize() throws Throwable
    {
        System.out.println("Garbage collector in action! Deleted one object!");
    }
}
