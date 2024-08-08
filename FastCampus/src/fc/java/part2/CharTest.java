package fc.java.part2;

public class CharTest {
    public static void main(String[] args) {
        char a ='\uAC00';
        System.out.println(a);
        char b = 'A';
        System.out.println((char)(b+32));
        char c = '1';
        char d = '2';
        char e = '3';
        System.out.println((int)(c+d+e-'0'-'0'-'0'));
    }
}
