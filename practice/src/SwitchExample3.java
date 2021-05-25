public class SwitchExample3 {
    public static void DefaultStatement(){
        int day = 3;
        switch(day){
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Weekday");
        }
    }
}
