package fc.java.part2;

import java.util.Scanner;

public class ScannerExam {
    public static void main(String[] args) {
        Book b = new Book();
        Scanner sc = new Scanner(System.in);
        System.out.print("제목 : ");
        b.title = sc.next();
        System.out.println("b.title = " + b.title);
        sc.nextLine();
        System.out.print("가격 : ");
        b.price = sc.nextInt();
        sc.nextLine();
        System.out.println("b.price = " + b.price);
        System.out.print("출판사 : ");
        b.company = sc.nextLine();
        System.out.println("b.company = " + b.company);
        System.out.print("작가 : ");
        b.author = sc.nextLine();
        System.out.println("b.author = " + b.author);
        System.out.print("페이지 수 : ");
        b.page = sc.nextInt();
        sc.nextLine();
        System.out.println("b.page = " + b.page);
        System.out.print("ISBN : ");
        b.isbn = sc.nextLine();
        System.out.println("b.isbn = " + b.isbn);
    }
}
