package fc.java.course2.part1;

import java.util.ArrayList;
import fc.java.model2.Book;
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add(new Book("고구려",18000,"한빛","광개토"));
        l.add(new Book("신라",18000,"한빛","진흥"));
        l.add(new Book("백제",18000,"한빛","근초고"));
        
    }
}
