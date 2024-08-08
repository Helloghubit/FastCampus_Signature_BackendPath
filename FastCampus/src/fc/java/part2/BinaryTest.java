package fc.java.part2;

public class BinaryTest {
    public static void main(String[] args) {
        int i = 69;

        int binary = 0b1000101;
        int oct = 0105;
        int hex = 0x45;
        System.out.println(jinsu(69,2));
        System.out.println(jinsu(69,8));
        System.out.println(jinsu(69,16));
        System.out.println(binary);
        System.out.println(oct);
        System.out.println(hex);
    }

    private static int jinsu(int i, int j){
        StringBuilder sb = new StringBuilder();
        int a = 1;
        int count = 0;
        while(a*j<i) {
            a*=j;
        }
        while(a!=0){
            sb.append(Integer.toString(i/a));
            i= i - (i/a)*a;
            a/=j;
        }
        return Integer.parseInt(String.valueOf(sb));
    }
}
