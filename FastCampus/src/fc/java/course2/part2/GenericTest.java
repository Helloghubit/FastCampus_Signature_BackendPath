package fc.java.course2.part2;

import fc.java.model2.Movie;
import fc.java.model2.ObjectArr;

public class GenericTest {
    public static void main(String[] args) {
        ObjectArr<String> array= new ObjectArr<>(5);
        array.set(0,"a");
        array.set(1,"b");
        array.set(2,"c");
        array.set(3,"d");
        ObjectArr<Movie> bookArray = new ObjectArr<>(4);
        bookArray.set(0, new Movie("괴물","봉준호","2006","한국"));
        bookArray.set(1, new Movie("김물","김준호","2006","한국"));
        bookArray.set(2, new Movie("강물","이준호","2006","한국"));
        bookArray.set(3, new Movie("당물","당준호","2006","한국"));
        for (int i = 0; i < bookArray.size(); i++) {
            System.out.println(bookArray.get(i));
        }
    }
}
