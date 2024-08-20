package fc.java.part3;

import fc.java.model.Student;

public class StudentArrayTest {
    public static void main(String[] args) {
        Student[] s = new Student[4];
        s[0] = new Student("홍길동","컴공",24,"asd@naver.com",3,"010-1234-1234");
        s[1] = new Student("김길동","경영",26,"abc@naver.com",2,"010-1234-1234");
        s[2] = new Student("상길동","경제",21,"qwe@naver.com",1,"010-1234-1234");
        s[3] = new Student("정길동","수학",25,"trd@naver.com",4,"010-1234-1234");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        System.out.println();
        for(Student st : s){
            System.out.println(st);
        }
    }
}
