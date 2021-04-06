
class Executor {
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

        ArrayVariables arrayVariables = new ArrayVariables();

        arrayVariables.list();

        //pass by reference practice
        final String[] toDoList = new String[4];
        toDoList[0] = "study";
        toDoList[1] = "finish studying";
        toDoList[2] = "lunch";
        toDoList[3] = "sleep";
        printWhatsInTheArray(toDoList);
        printAndChangeWhatsInTheArray(toDoList);


        String[] shoppingBasket = new String[2];
        shoppingBasket[0] = "apple";
        shoppingBasket[1] = "chicken";

        printWhatsInTheArray(shoppingBasket);

        //mutability and immutability
        String mutableText = "abcde";
        mutableText = "12345";
        System.out.println(mutableText);

        final String mutableText2 = "abcde";
//        mutableText2 = "12345";
        System.out.println(mutableText2);


        //Example: To create Array Of Objects
        Account[] accountList = new Account[2];
        accountList[0] = new Account();
        accountList[1] = new Account();
        //[
        // 1.  null,
        // 2.  null,
        // 3,  null
        //]


        //[
        // 1.  null,
        // 2.  null, ----> set to {1,2}
        // 3,  null
        //]


        //[
        // 1.  null,
        // 2.  null, ----> new Account() ----> set to {1,2}
        // 3,  null
        //]
        accountList[0].setData(1,2);
        accountList[1].setData(3,4);
        System.out.println("For Array Element 0");
        accountList[0].showData();
        System.out.println("For Array Element 1");
        accountList[1].showData();

        SampleString.concatenation();

        SampleString.stringLength();

        SampleString.determineLocation();

        SampleString.characterLocation();

        SampleString.compareStrings();

        SampleString.containsSequence();

        SampleString.endsWithSuffix();

        SampleString.modifyStrings();

        SampleString.convertStringToUpperLowerCases();

        SampleString.indexOfStringOverloads();

        SampleString.charAtMethod();

    }

    private static void printWhatsInTheArray(String[] strArray) {
        for(int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
    }

    private static void printAndChangeWhatsInTheArray(String[] strArrayV2) {
        strArrayV2[0] = "Watch TV Series";
        printWhatsInTheArray(strArrayV2);
    }

}