package fc.java.part2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("num = " + num);
        float float1 = sc.nextFloat();
        System.out.println("float1 = " + float1);
        double double1 = sc.nextDouble();
        System.out.println("double1 = " + double1);
        String string1 = sc.next();
        System.out.println("string1 = " + string1);
        sc.nextLine();
        String string2 = sc.nextLine();
        System.out.println("string2 = " + string2);
    }
}
