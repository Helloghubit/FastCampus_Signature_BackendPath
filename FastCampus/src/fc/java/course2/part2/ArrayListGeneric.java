package fc.java.course2.part2;

import fc.java.model2.Movie;

import java.util.ArrayList;

public class ArrayListGeneric {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Movie("괴물","봉준호","2006","한국"));
        list.add("하이");
        list.add('a');
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getClass().getName());
        }

    }
}
