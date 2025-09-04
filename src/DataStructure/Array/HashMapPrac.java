package DataStructure.Array;

import java.util.HashMap;
import java.util.Map;

public class HashMapPrac {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apoorv Raj", 90);
        map.put("Poojisha Lakshya", 89);
        map.put("Anubhav Kumar", 95);

        for(Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + " -> " +entry.getValue());
        }
    }
}
