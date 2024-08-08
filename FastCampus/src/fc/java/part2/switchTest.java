package fc.java.part2;

import java.util.Scanner;

public class switchTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
        switch (b){
            case "Sunday":
                System.out.println("야구하기");
                break;
            case "Monday":
                System.out.println("농구하기");
                break;
            case "Tuesday":
                System.out.println("휴식");
                break;
            case "Wednesday":
                System.out.println("수영하기");
                break;
            case "Thursday":
                System.out.println("축구하기");
                break;
            case "Friday":
                System.out.println("아무거나");
                break;
            case "Saturday":
                System.out.println("아무");
                break;
        }
    }
}
