package fc.java.model;

public class Allstatic {
    public static int hap(int a, int b){
        int v = a + b;
        return v;
    }

    public static int max(int a, int b){
        return (a > b) ? a : b;
    }
    public static int min(int a, int b){
        return (a < b) ? a : b;
    }
    private Allstatic(){};
}
