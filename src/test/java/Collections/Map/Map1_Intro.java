package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class Map1_Intro {

    // Does this clas `Computer` extend to any other class in java?
    // Yes, it does. Every class in Java directly or indirectly extends object class.
    // if it is not written explicitly it automatically extends the object class.
    // So this computer class is extending object class.
    // Can I say computer object is also an object?


    public static void main(String[] args) {

//       computer =  {
//           "color": "Blue",
//          "processor": "Apple Silicon",
//          "cpuNumber": 16,
//          "screenSize": 16
//                }
//
        Map<String,Object> computer = new HashMap<>();
        // Adding elements to the computer map
        computer.put("color","Blue");
        computer.put("processor","Apple Silicon");
        computer.put("cpuNumber",16);
        computer.put("screenSize", 16);

        System.out.println(computer);

        // Map usually used to store KEY-VALUE pairs. Keys MUST be unique, values could be duplicated.

        // Map object is also not using index numbers. However in map there is a way to acess individual values.
        // Let's say we are wondering processor of the computer.
        System.out.println(computer.get("processor"));

        // Let's say you want to learn number of cpus
        System.out.println(computer.get("cpuNumber"));

        // get method takes the `key` as a parameter and returns the value for the given key.

        // Let's say the key that you try to access is not in the map
        System.out.println(computer.get("operating system"));
        // When we try to get value for the key that doesn't exist in the map, we get a null value.

        // To remove a key pair set from the map we use a remove method and provide the key so that
        // key and the value for that key could be removed.

        computer.remove("color");

        System.out.println(computer);

        // To learn the number of key-value pairs in the map

        System.out.println(computer.size()); // 3

        // Let's loop through the map
        // entrySet() method it will return set of Entry objects.
        // it will return set of key-value pairs.
        // In java a single key-value pair in a map could be represented by a Entry object.

//        Set<Map.Entry<String,Object>> keyValuePairs = computer.entrySet();
        for(Map.Entry<String,Object> keyValuePair: computer.entrySet() ){
            System.out.println(keyValuePair);
            System.out.println("Key: " + keyValuePair.getKey());
            System.out.println("Value: " + keyValuePair.getValue());

        }










}}
