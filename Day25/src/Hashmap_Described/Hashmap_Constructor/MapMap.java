package Hashmap_Described.Hashmap_Constructor;

import java.util.HashMap;
import java.util.Map;

public class MapMap {
    public static void main(String args[])
    {
        // No need to mention the
        // Generic type twice
        Map<Integer, String> hm1 = new HashMap<>();

        // Add Elements in hm1
        hm1.put(1, "one");
        hm1.put(2, "two");
        hm1.put(3, "three");

        // Initialization of a HashMap
        // using Generics
        HashMap<Integer, String> hm2
                = new HashMap<Integer, String>(hm1);

        // Add Elements in hm2
        hm2.put(4,"Four");
        hm2.put(5,"Five");

        System.out.println("Mappings of HashMap hm1 are : "
                + hm1);

        System.out.println("Mapping of HashMap hm2 are : "
                + hm2);
    }
}
