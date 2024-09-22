package fc.java.course2.part1;

public class HelloWorldString {
    public static void main(String[] args) {
        String str1 = new String("Hello World");
        String str2 = new String("Hello World");
        System.out.println(str1.equals(str2));
        System.out.println(str1==str2);
        str1 = "Hello World";
        str2 = "Hello World";
        System.out.println(str1.equals(str2));
        System.out.println(str1==str2);
    }
}
