package fc.java.part4;
import fc.java.poly.*;
public class IsNotOverride {
    public static void main(String[] args) {
        Animal ani = new Dog();
        ani.eat();

        ani = new Cat();
        ani.eat();
    }
}
