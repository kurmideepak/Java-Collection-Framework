package CollectionFramework;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new TreeMap<>();
        // In TreeMap(), key will be sorted

        numbers.put("One",1);
        numbers.put("Two",2);
        numbers.put("Three",3);
        numbers.put("Four",4);
        numbers.put("Five",5);
        numbers.put("Six",6);
        System.out.println(numbers);

        // To remove
        numbers.remove("Six");
        numbers.put("Two", 22); //It will override
        System.out.println(numbers);

        //To check if key is not present then put the given
        if (!numbers.containsKey("Three")){
            numbers.put("Three", 33);
        }

        //To check either the value is present or not
        System.out.println(numbers.containsValue(5));

        //To check either the keu is present or not
        System.out.println(numbers.containsKey("Six"));

        // To check the map is empty or not
        System.out.println(numbers.isEmpty());

        //To iterate the map
        for (Map.Entry<String, Integer> e: numbers.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey()); // Iterate the key
            System.out.println(e.getValue()); // Iterate the value
        }

        // To Iterate key Only
        for (String key: numbers.keySet()){
            System.out.println(key);
        }

        //To Iterate Value only
        for (Integer value: numbers.values()){
            System.out.println(value);
        }
    }
}
