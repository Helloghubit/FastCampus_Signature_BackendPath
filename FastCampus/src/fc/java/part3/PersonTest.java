package fc.java.part3;

public class PersonTest {
    public static void main(String[] args) {
        Person p; //객체 선언
        new Person(); //객체 생성 Person() -> 생성자 메서드 메모리에 하나의 바구니를 생성
        p = new Person(); // 변수 할당 번지 수를 p에 저장
        // 인스턴스를 만드는 과정
        p.name = "John Doe";
        p.age = 22;
        p.phone = "123-456-789";
        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.phone);
        p.play();
        p.eat();
        p.walk();
    }
}
