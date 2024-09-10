package fc.java.part4;
import fc.java.model.*;

public class PolyTest {
    public static void main(String[] args) {
        Animal ani = new Dog();
        //Upcasting으로 객체를 생성
        // 상속관계, 재정의, 동적바인딩
        ani.eat(); //실행시점에서 사용될 메서드가 결정되는 바인딩

        ani = new Cat();
        ani.eat();

        ((Cat)ani).night();
    }
}
