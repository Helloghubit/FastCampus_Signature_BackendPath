package fc.java.course2.part1;

import fc.java.model2.IntArray;

public class MyIntArrayTest {
    public static void main(String[] args) {
        IntArray i = new IntArray();
        i.add(1);
        i.add(2);
        i.add(3);
        i.add(4);
        i.add(5);
        i.add(6);
        System.out.println(i.get(0));
        System.out.println(i.get(1));
        System.out.println(i.get(2));
        System.out.println(i.size());
    }
}
