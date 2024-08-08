package fc.java.part2;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        float[] f = {10.5f,15.5f,50.5f,70.5f,88.5f};
        int[] a = {10,20,30,40,50};
        int sum = a[0] + a[3];
        System.out.println("sum = " + sum);
        System.out.println(a.length);
        int[] b = new int[3];
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
