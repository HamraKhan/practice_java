import java.util.HashMap;
import java.util.Map;

//Sample implementation of Java Hash Map
public class HashMaps {
    public static void hashMapPractice() {
        Map<String, String> objMap = new HashMap<String, String>();
        objMap.put("Name", "Suzuki");
        objMap.put("Power", "220");
        objMap.put("Type", "2-Wheeler");
        objMap.put("Price", "85000");
        System.out.println("Elements of the Map");
        System.out.println(objMap.get("Name"));
    }

    //Remove a value from HashMap based on key
    public static void hashMapPracticeV2() {
        // creating hash map
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        //populating the hashmap object
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "PHP");
        map.put(4, "SQL");
        map.put(5, "C++");
        System.out.println("elements of the hashmap: " + map);
        // Remove value of key 5
        map.remove(5);
        System.out.println("elements of the hashmap after removing key 5: " + map);
        //check if the hashmap contains key 3 and print out the result
        System.out.println("contains key 3: " + map.containsKey(3));
        //display all keys present in hashmap
        System.out.println("present keys in hashmap: " + map.keySet());
        //display all values present in hashmap
        System.out.println("present values in hashmap: " + map.values());
        //check if hashmap is empty or not
        System.out.println("is hashmap empty? " + map.isEmpty());
    }
}
