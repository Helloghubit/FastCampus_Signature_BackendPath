package fc.java.part2;

public class APIOverloading {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int max = maxValue(a,b);
        int min = minValue(a,b);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }

    public static int maxValue(int a, int b){
        return (a>b) ? a : b;
    }

    public static int minValue(int a, int b){
        return (a<b) ? a : b;
    }
}