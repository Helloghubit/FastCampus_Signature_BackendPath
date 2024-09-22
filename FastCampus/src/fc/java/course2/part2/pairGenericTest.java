package fc.java.course2.part2;

import fc.java.model2.Pair;

public class pairGenericTest {
    public static void main(String[] args) {
        Pair<String, Integer> p = new Pair<>("hello", 1);
        System.out.println(p.getKey());
        System.out.println(p.getValue());
    }
}
