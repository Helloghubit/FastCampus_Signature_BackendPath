package fc.java.course2.part2;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "Hello, World";
        char[] arr = str.toCharArray();
        Map<Character,Integer> count = new HashMap<>();
        for(char c : arr){
            if(!count.containsKey(c)){
                count.put(c, 1);
            }
            else
                count.put(c, count.get(c)+1);
        }
        for (Map.Entry<Character,Integer> m : count.entrySet()){
            System.out.println("글자 : " + m.getKey() + " / 횟수 : " + m.getValue());
        }
    }
}
