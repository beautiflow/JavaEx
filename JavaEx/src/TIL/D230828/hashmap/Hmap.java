package TIL.D230828.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Hmap {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(10000000, "one");
        hashMap.put(20000000, "two");
        hashMap.put(30000000, "three");
        hashMap.put(40000000, "four");
        hashMap.put(50000000, "five");

        for(Integer key : hashMap.keySet()){
            System.out.println(key + " => " + hashMap.get(key));  // 정렬 안됨
        }

        System.out.println();
        // --------------------------------------------

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(10000000, "one");
        linkedHashMap.put(20000000, "two");
        linkedHashMap.put(30000000, "three");
        linkedHashMap.put(40000000, "four");
        linkedHashMap.put(50000000, "five");

        for(Integer key : linkedHashMap.keySet()){
            System.out.println(key + " => " + linkedHashMap.get(key));  // 정렬됨
        }
    }
}
