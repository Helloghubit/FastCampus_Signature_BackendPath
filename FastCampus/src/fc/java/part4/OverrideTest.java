package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;

public class OverrideTest {
    public static void main(String[] args) {
        Animal ani = new Cat();
        ani.eat();
    }
}
