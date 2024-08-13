package fc.java.part3;

import fc.java.model.PersonVO;

public class ConstructorOverloading {
    public static void main(String[] args) {
        PersonVO p = new PersonVO();
        PersonVO p1 = new PersonVO("김길동",15,"010-1234-1234");
        PersonVO p2 = new PersonVO("나길동",17,"010-1234-1234");
        System.out.println(p.getName()+" "+p.getAge()+" "+p.getPhone());
        System.out.println(p1.getName()+" "+p1.getAge()+" "+p1.getPhone());
        System.out.println(p2.getName()+" "+p2.getAge()+" "+p2.getPhone());
    }
}
