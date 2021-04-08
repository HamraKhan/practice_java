import java.sql.SQLOutput;
import java.util.Locale;

public class SampleString {
    public static void concatenation() {
//String Concatenation
        String str1 = "Rock";
        String str2 = "Star";
//Approach 1 : Using concat
        String str3 = str1.concat(str2);
        System.out.println(str3);
//Approach 2 : Using "+" operator
        String str4 = str1 + str2;
        System.out.println(str4);
    }

    //String "Length" Method
    //Determining length of given string
    public static void stringLength() {
        //Sample string for this tutorial
        String str_Sample = "RockStar";
        //Length of a String
        System.out.println("Length of String: " + str_Sample.length());
    }

    //String "indexOf" Method
    //Finding the index of a specified character using "indexOf" method
    public static void determineLocation() {
        //Character at position
        String str_Sample = "RockStar";
        System.out.println("Character at position 5: " + str_Sample.charAt(5));
        //Index of a given character
        System.out.println("Index of character 'S': " + str_Sample.indexOf('S'));
    }

    //String "charAt" Method
    //Using the “charAt” method to provide the index of the character that needs to be found
    public static void characterLocation() {
        //Character at position
        String str_Sample = "RockStar";
        System.out.println("Character at position 5: " + str_Sample.charAt(5));
    }

    //String "CompareTo" Method
    //Checking if the String that was generated by some method, is equal to something that I want to verify it with
    public static void compareStrings() {
        //Compare to a String
        String str_Sample = "RockStar";
        System.out.println("Compare To 'ROCKSTAR': " + str_Sample.compareTo("rockstar"));
        //Compare to - Ignore case
        System.out.println("Compare To 'ROCKSTAR' - Case Ignored: " + str_Sample.compareToIgnoreCase("ROCKSTAR"));
    }


    //String "Contain" Method
    //Its partially known what the string should have contained...
    //...confirming if the String contains a sequence of characters specified using method "contains" and
    // specifying the characters that need to be checked
    //Returns true if and only if this string contains the specified sequence of char values.
    public static void containsSequence() {
        //Check if String contains a sequence
        String str_Sample = "RockStar";
        System.out.println("Contains sequence 'tar': " + str_Sample.contains("tar"));
    }


    //String "endsWith" Method
    //How to confirm if a String ends with a particular suffix
    //Returns true if the character sequence represented by the argument is a suffix of the character sequence represented by this object
    public static void endsWithSuffix() {
        //Check if ends with a particular sequence
        String str_Sample = "RockStar";
        System.out.println("EndsWith character 'r': " + str_Sample.endsWith("r"));
    }


    //String "replaceAll" & "replaceFirst" Method
    //Modifying String at several places and replacing several parts of the String
    //Java String Replace, replaceAll and replaceFirst methods.
    public static void modifyStrings() {
        //Replace Rock with the word Duke
        String str_Sample = "RockStar";
        System.out.println("Replace 'Rock' with 'Duke': " + str_Sample.replace("Rock", "Duke"));
    }


    //String Java "tolowercase" & Java "touppercase" Method
    //Strings shown in lower case or Uppercase
    //“toLowercase()” or “ToUpperCase()” methods against the Strings that need to be converted
    public static void convertStringToUpperLowerCases() {
        //Convert to LowerCase
        String str_Sample = "RockStar";
        System.out.println("Convert to LowerCase: " + str_Sample.toLowerCase());
        //Convert to UpperCase
        System.out.println("Convert to UpperCase: " + str_Sample.toUpperCase());
    }

    public static void indexOfStringOverloads() {
        String str_Sample = "This is Index of Example";
        //Character at position
        System.out.println("Index of character 'x':" + str_Sample.indexOf('x'));
        //Character at position after given index value
        System.out.println("Index of character 's' after 3 index:" + str_Sample.indexOf('s', 3));
        //Give index position for the given substring
        System.out.println("Index of substring 'is': " + str_Sample.indexOf("is"));
        //Give index position for the given substring and start index
        System.out.println("Index of substring 'is' form index:" + str_Sample.indexOf("is", 5));
    }

    public static void charAtMethod() {
      String s1 = "This is String CharAt Method";
      //returns the char value at the 0 index
        System.out.println("Character at 0 position is: " + s1.charAt(0));
        //returns char value at 5th index
        System.out.println("Character at 5th position is:" + s1.charAt(5));
        //returns char value at at 22nd index
        System.out.println("Character at 22nd position is: " + s1.charAt(22));

        char firstNameInitial = s1.charAt(1);
        char lastNameInitial = s1.charAt(22);

        System.out.println("my initial is: " + s1.charAt(1) + s1.charAt(22));

        System.out.println("my initial is: " + firstNameInitial + lastNameInitial);

        System.out.println("the first letter of my firstname is: " + firstNameInitial);
        System.out.println("the first letter of my lastname is: " + lastNameInitial);
    }

    public static void compareToMethod() {
        String str_Sample = "a";
        str_Sample.contains("asd");
        System.out.println("Compare To 'a' b is :" + str_Sample.compareTo("b"));
        str_Sample = "b";
        System.out.println("Compare To 'b' a is :" + str_Sample.compareTo("A"));
        str_Sample ="b";
        System.out.println("Compare To 'b' b is :" + str_Sample.compareTo("z"));
    }

    //compareToIgnoreCase method
    public static void compareToIgnoreMethod() {
        //compare to a string
        String str_Sample = "rockstar";
        System.out.println("Compare To 'ROCKSTAR': " + str_Sample.compareTo("rockStar"));
        //compare to -ignore case
        System.out.println("Compare To 'ROCKSTAR' - Case Ignored: " + str_Sample.compareToIgnoreCase("ROCKSTAR"));
    }

    public static void containsMethod() {
        String str_Sample = "This is a String contains Example";
        //check if String contains a sequence
        System.out.println("Contains sequence 'ing': " + str_Sample.contains("ing"));
        System.out.println("Contains sequence 'Example': " + str_Sample.contains("Example"));
        System.out.println("Contains sequence 'Example': " + str_Sample.contains("example"));
        System.out.println("Contains sequence 'is String': " +str_Sample.contains("is String"));
    }

    public static void endsWithMethod() {
        String str_Sample = "Java String endsWith example";
        //check if ends with a particular sequence
        System.out.println("EndsWith character 'e':" + str_Sample.endsWith("e"));
        System.out.println("EndsWith character 'ple': " + str_Sample.endsWith("ple"));
        System.out.println("EndsWith character Java' : " + str_Sample.endsWith("Java"));
    }

    public static void replaceMethod() {
        String S1 = new String("the quick fox jumped");
        System.out.println("Original String is ': " + S1);
        System.out.println("String after replacing 'fox' with 'dog': " + S1.replace("fox", "dog"));
        System.out.println("String after replacing all 't' with 'a': " + S1.replace('t', 'a'));
    }

    //remove white spaces
    public static void replaceAllMethod() {
        String str = "I like chocolate and coffee cake";
        //remove white spaces
        String str2 = str.replaceAll("\\s", "");
        System.out.println(str2);
    }

    //replace character
    public static void replaceAllMethod2() {
       String s1 = "Pomegranates are my favourite fruit";
       //replace all occurences of "a" to "e"
       String replaceString = s1.replaceAll("a", "e");
        System.out.println(replaceString);
    }

    //replace word
    public static void replaceAllMethod3() {
        String s1 = "My name is Khan. My name is Bob, My name is Wanda.";
        //replaces all occurrences of "is" to "was"
        String replaceString = s1.replaceAll("is", "was");
        System.out.println(replaceString);
    }

    public static void replaceFirstMethod() {
        String str = "This is a very interesting thing to do";
        //Only replaces first 's' with '9'
        String str1 = str.replaceFirst("s", "9");
        System.out.println(str1);
    }

    public static void toLowerCaseMethod() {
        String S1 = new String ("UPPERCASE CONVERTED TO LOWERCASE");
        //Convert to lowercase
        System.out.println(S1.toLowerCase());
    }

    public static void toUpperCaseMethod() {
        String S1 = new String ("lowercase converted to uppercase");
        //convert to uppercase
        System.out.println(S1.toUpperCase());
    }

    //CONVERT STRINGS TO INTEGER METHODS

    //using integer.parseInt()
    public static void integerParseIntMethod() {
        String strTest = "100";
        int iTest = Integer.parseInt(strTest);
        System.out.println("Actual String:" + strTest);
        System.out.println("Converted to Int:" + iTest);
        //This will now show arithmetic operation
        System.out.println("Arithmetic Operation on Int:" + (iTest/4));
    }

    //using integer.valueOf()
    public static void integerValueOfMethod() {
        String strTest = "100";
        int iTest = Integer.valueOf(strTest);
        System.out.println("Actual String:" + strTest);
        System.out.println("Converted to Int:" + iTest);
        //This will show some arithmetic operation
        System.out.println("Arithmetic Operation on Int:" + (iTest / 4));
    }
}
