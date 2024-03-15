package DataStructures.HashTable;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<Integer, String> productMap = new HashMap<>();
        productMap.put(1, "Keys");
        productMap.put(2, "Books");
        productMap.put(3, "Systems");
        productMap.put(4, "Mobile");

        for(Map.Entry<Integer, String> entry: productMap.entrySet()){
            System.out.println("Key: " + entry.getKey() + " -> Value: " + entry.getValue());
        }

        productMap.keySet(); //all the keys
        productMap.values(); //all the values
        System.out.println(productMap.containsKey(4));
        System.out.println(productMap.get(null));
        System.out.println(productMap.containsValue("Books"));
        productMap.put(7, "Samsung");
        productMap.put(7, "Samsung");
        productMap.put(null, "Apple");
        productMap.put(null, "AppleMac");
        System.out.println(productMap);
    }
}
