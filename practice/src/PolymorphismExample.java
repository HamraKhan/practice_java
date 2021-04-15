public class PolymorphismExample {
    public static void PolymorphismExample(){
        Animal myAnimal = new Animal(); //create animal object
        Animal myPig = new Pig(); //create a Pig object
        Animal mySheep = new Sheep(); //create a Sheep object
        myAnimal.animalSound();
        myPig.animalSound();
        mySheep.animalSound();
    }
}

