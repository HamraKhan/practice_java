import java.util.Random;

public class Dream {
    public String suggestion () {
        String[] dreamList = {"Fly across the mountains",
                "Face your fears",
                "Eat dream food",
                "Change the weather",
                "Explore the ocean and Breathe underwater"};
        Random rand = new Random();

        // Obtain a number between [0 - 4].
        int randomIndex= rand.nextInt(5);

        return dreamList[randomIndex];
    }
}
