package 자바의_정석.ch11;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {
    public static void main(String[] args) {
        Object[] objArr = {"1", 1, "2", "2", "3", "3", "4", "4", "4"};
        Set set = new HashSet();

        for(int i = 0; i < objArr.length; i++){
            set.add(objArr[i]);   // HashSet 에 objArr 의 요소들을 저장한다.
        }
        // HashSet 에 저장된 요소들을 출력한다.
        System.out.println(set);
    }
}
