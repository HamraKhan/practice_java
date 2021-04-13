public class StaticVariableExample {

    //Declaring static variable
    static int a;
    static int b = 1;
    static String s;
    static String s1 = "Hi";

    public static void accessStaticVariable() {

        //Access of static variable by class name
        System.out.println("Value of a : " + StaticVariableExample.a);
        System.out.println("Value of b : " + StaticVariableExample.b);
        System.out.println("Value of s : " + StaticVariableExample.s);
        System.out.println("Value of s1 : " + StaticVariableExample.s1);

        Student s1 = new Student();
        s1.showData();

        Student s2 = new Student();
        s2.showData();

        Student.b++;
        s1.showData();


        AccessStaticBlock.staticBlock();
    }

}
