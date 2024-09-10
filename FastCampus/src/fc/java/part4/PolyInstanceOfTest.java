package fc.java.part4;

import fc.java.model.*;

public class PolyInstanceOfTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        display(d);
        Cat c = new Cat();
        display(c);
    }
    public static void display(Animal ani){
        ani.eat();
        if(ani instanceof Cat){
            ((Cat)ani).night();
        }
    }
}
