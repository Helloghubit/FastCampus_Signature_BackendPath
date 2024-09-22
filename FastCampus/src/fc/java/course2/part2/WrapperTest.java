package fc.java.course2.part2;

public class WrapperTest {
    public static void main(String[] args) {
        int a = 10;
        Integer aa = new Integer(10);
        Integer aaa = 10; //auto - boxing
        System.out.println(aaa.intValue()); // unboxing
        a = aaa; //auto - unboxing
    }
}
