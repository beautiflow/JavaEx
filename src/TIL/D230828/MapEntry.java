package TIL.D230828;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEntry {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        // Map.Entry 인터페이스를 구현하고 있는 Key-value 쌍을 가지고 있는 HashMap 의 Node 객체들의 Set 집합을 반환
        Set<Map.Entry<String, Integer>> entry = map.entrySet();

        System.out.println(entry);

        // Set 을 순회하면서 Map.Entry 를 구현한 Node 객체에서 key 와 value 를 얻어 출력
        for(Map.Entry<String, Integer> e : entry){
            System.out.printf("{ %s : %d }\n", e.getKey(), e.getValue());
        }

    }
}
