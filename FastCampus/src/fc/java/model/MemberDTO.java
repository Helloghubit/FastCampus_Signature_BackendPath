package fc.java.model;

import java.util.Scanner;

public class MemberDTO {
    Scanner sc = new Scanner(System.in);
    public String name;
    private int age;
    public String phone;
    public void ageGet(){
        age = sc.nextInt();
        if(!(0<age&&age<100)){
            System.out.println("다시 입력하세요");
            ageGet();
        }
        else{
            this.age = age;
        }
    }
    public void memberInfo(){
        System.out.println(name+"\t"+age+"\t"+phone);
    }
}
