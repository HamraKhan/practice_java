public class NestedIfStatement {
    public static void NestedIfExample() {
        int age = 25;
        if (age > 0) {
            if (age > 16) {
                System.out.println("Thank you");
            } else {
                System.out.println("Too young");
            }
        } else {
                System.out.println("Error");
        }
    }
}
