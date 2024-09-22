package fc.java.course2.part2;

public class IntegerStringTest {
    public static void main(String[] args) {
        String str1 = "123";
        String str2 = "123";
        System.out.println(str1+str2);
        int num = Integer.parseInt(str1)+Integer.parseInt(str2);
        System.out.println(num);

        int num1 = 123;
        int num2 = 123;
        String str3 = String.valueOf(num1);
        String str4 = String.valueOf(num2);
        System.out.println(str3 + str4);
    }
}
