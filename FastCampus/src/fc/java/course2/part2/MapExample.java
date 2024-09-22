package fc.java.course2.part2;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Kim",95);
        map.put("Park",35);
        map.put("Choi",67);
        map.put("Lee",75);

        for (Map.Entry<String, Integer> a : map.entrySet()){
            System.out.println(a.getKey()+"'s score = "+a.getValue());
        }
    }
}
