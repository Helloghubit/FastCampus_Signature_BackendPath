package fc.java.part3;

import fc.java.model.Student;

public class StudentTest {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 60;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        Student s = new Student("홍길동","컴공",37,"asd@gmail",2,"010-1234-1234");
        System.out.println(s);
    }
}
