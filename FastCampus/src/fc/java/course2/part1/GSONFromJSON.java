package fc.java.course2.part1;

import com.google.gson.Gson;
import fc.java.model2.Person;

import java.util.Random;

public class GSONFromJSON {
    public static void main(String[] args) {
        String json = "{\"name\" : \"홍길동\", \"age\" : \"30\"}";
        Gson gson = new Gson();
        Person p = gson.fromJson(json,Person.class);
        System.out.println(p);
        Random r = new Random();

    }
}
