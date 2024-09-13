package fc.java.course2.part1;

import com.google.gson.Gson;
import fc.java.model2.Person;

public class GSONToAPI {
    public static void main(String[] args) {
        Person p = new Person("홍길동",30);
        Gson g = new Gson();
        String json = g.toJson(p);
        System.out.println(json);
    }
}
