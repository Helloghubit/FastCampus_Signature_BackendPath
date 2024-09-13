package fc.java.course2.part1;
import java.util.Random;

public class RandomAPI {
    public static void main(String[] args) {
        int[] arr = new int[6];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = isDuplicate(arr);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }

    public static int isDuplicate(int[] arr){
        Random r = new Random();
        int n = r.nextInt(45);

        for (int i = 0; i < arr.length; i++) {
            if(n == arr[i]){
                n = isDuplicate(arr);
                break;
            }
        }

        return n;
    }
}
