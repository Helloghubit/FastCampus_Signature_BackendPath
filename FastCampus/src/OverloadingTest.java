public class OverloadingTest {
    public static void main(String[] args) {
        float v = hap(10.5f,20.5f);
        System.out.println("v = " + v);
        int t = hap(1,3);
        System.out.println("t = " + t);
    }

    public static int hap(int a, int b) {
        return a + b;
    }

    public static float hap(float a, float b) {
        return a + b;
    }
}
