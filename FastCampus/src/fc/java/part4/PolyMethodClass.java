package fc.java.part4;
import  fc.java.model.*;
public class PolyMethodClass {
    public static void main(String[] args) {
        Dog d = new Dog();
        display(d);
        Cat c = new Cat();
        display(c);
    }
    private static void display (Dog d){
        d.eat();
    }

    private static void display (Cat c){
        c.eat();
        c.night();
    }
}
