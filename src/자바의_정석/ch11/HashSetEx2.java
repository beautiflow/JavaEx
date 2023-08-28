package 자바의_정석.ch11;

import java.util.*;

public class HashSetEx2 {
    public static void main(String[] args) {
        Set set = new HashSet();

        for(int i = 0; set.size() < 6; i++){
            int num = (int)(Math.random()*45)+1;
            set.add(num);
        }
        List list = new LinkedList(set);
        Collections.sort(list);
        System.out.println(list);
    }
}
