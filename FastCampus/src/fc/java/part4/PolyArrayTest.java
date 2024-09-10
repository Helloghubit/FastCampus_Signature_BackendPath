package fc.java.part4;

import fc.java.model.*;

public class PolyArrayTest {
    public static void main(String[] args) {
        Animal[] ani = new Animal[2]; //다형성배열
        ani[0] = new Dog();
        ani[1] = new Cat();
        display(ani);
    }

    public static void display(Animal ani[]){
        for (int i = 0; i < ani.length; i++) {
            ani[i].eat();
            if(ani[i] instanceof Cat){
                ((Cat) ani[i]).night();
            }
        }
    }
}
