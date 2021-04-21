public class DemoChild extends ConstructorChainingDemo{
    int value3;
    int value4;

    DemoChild(){
        //super(5);
        value3 = 3;
        value4 = 4;
        System.out.println("Inside the constructor of child");
    }

    public void display(){
        System.out.println("Value1 ===" +value1);
        System.out.println("Value2 ===" +value2);
        System.out.println("Value3 ===" +value3);
        System.out.println("Value4 ===" +value4);
    }
}
