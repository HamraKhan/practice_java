import java.util.Random;

public class RandomNumbers {
    public static void RandomNumberExample(){
        Random objGenerator = new Random();
        for (int iCount = 0; iCount< 10; iCount++){
            int randomNumber = objGenerator.nextInt(100);
            System.out.println("Random No :" + randomNumber);
        }
    }
}
