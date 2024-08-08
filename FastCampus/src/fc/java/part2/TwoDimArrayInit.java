package fc.java.part2;

public class TwoDimArrayInit  {
    public static void main(String[] args) {
        int[][] a= {
                {1,2,3,4},
                {5,6,7,8},
        };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j]+"\t");
            }
            System.out.println();
        }
        int[][] b = new int[5][];
        for (int i = 0; i < 5; i++) {
            b[i] = new int[i+1];
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j]= '*';
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print((char)b[i][j]);
            }
            System.out.println();
        }
    }
}
