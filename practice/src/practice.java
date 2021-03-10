
class practice {
    public static void main(String args[]){
        System.out.println("Hello World I am the greatest v26.");
        System.out.println(2+2+6);

//      generate and display a dream suggestion
        Dream dream = new Dream();
        System.out.println(dream.suggestion());

        Fruit apple = new Fruit();
        apple.name = "apple";

        Fruit fruitA = new Fruit();
        fruitA.name = "banana";

        Apple appleA = new Apple();
        Fruit appleB = new Apple();
        Orange orangeA = new Orange();

        Object a = new String();

        TypeCasting typeCasting = new TypeCasting();
//        typeCasting.calculate();

        double result = typeCasting.calculate2(1);

        Dog maltese = new Dog();
        maltese.breed="Maltese";
        maltese.size="Small";
        maltese.age=2;
        maltese.color="white";
        System.out.println(maltese.getInfo());

    }
}