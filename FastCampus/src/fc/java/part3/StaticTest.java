package fc.java.part3;

public class StaticTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        StaticTest s = new StaticTest();
        System.out.println(s.sum(a,b));
        System.out.println(sum1(a,b));
    }
    public int sum (int a, int b){
        int c = a + b;
        return c;
    }

    public static int sum1(int a, int b){
        int c = a + b;
        return c;
    }
}
