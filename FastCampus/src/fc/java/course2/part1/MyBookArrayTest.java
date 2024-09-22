package fc.java.course2.part1;

import fc.java.model2.BookArray;
import fc.java.model2.Book;
public class MyBookArrayTest {
    public static void main(String[] args) {
        BookArray b = new BookArray();
        b.add(new Book("자바",15000,"한빛","홍길동"));
        b.add(new Book("C",12000,"금빛","김길동"));
        b.add(new Book("자바",15000,"한빛","홍길동"));

        for (int i = 0; i < b.size(); i++) {
            System.out.println(b.get(i));
        }
    }
}
