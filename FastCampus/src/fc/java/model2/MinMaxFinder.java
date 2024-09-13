package fc.java.model2;

public class MinMaxFinder {
    public static int minFinder(int[] a){
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            min = (min > a[i]) ? a[i] : min;
        }
        return min;
    }

    public static int maxFinder(int[] a){
        int min =a[0];
        for (int i = 1; i < a.length; i++) {
            min = (min > a[i]) ? min : a[i];
        }
        return min;
    }
}
