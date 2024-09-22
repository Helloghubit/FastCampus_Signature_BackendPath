package fc.java.course2.part1;

import java.util.StringTokenizer;

public class StringManipulation {
    public static void main(String[] args) {
        String str = new String("Hello World");
        char c = str.charAt(5);
        int l = str.length();
        String s = str.substring(5,8);
        System.out.println(str.replaceAll("l","x"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str);
        String str1 = "APPLE";
        String str2 = "appleasdasd";
        System.out.println(str1.compareTo(str2));
    }
}
