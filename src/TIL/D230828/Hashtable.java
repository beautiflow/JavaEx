package TIL.D230828;

import java.util.HashMap;
import java.util.Map;

public class Hashtable {
    public static void main(String[] args) {

        Map<String, String> hashMap = new HashMap<>();

        hashMap.put("love", "사랑");
        hashMap.put("apple", "사과");
        hashMap.put("baby", "아기");

        hashMap.get("apple"); // "사과"

        // hashmap 의 key 값들을 set 집합으로 반환하고 순회
        for(String key : hashMap.keySet()){
            System.out.println(key + "=>" + hashMap.get(key));
        }
    }
}
