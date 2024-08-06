public class CallByReferenceExam {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        System.out.println(arraySum(a));
    }

    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("sum = " + sum);
        return sum;
    }
}
