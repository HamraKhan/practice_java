public class LoopControl {
    public static void BreakExample(){
        int x = 1;
        while (x >0){
            System.out.println(x);
            if (x==4) {
                break;
            }
            x++;
        }
    }
}
