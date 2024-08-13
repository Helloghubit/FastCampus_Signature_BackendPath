package fc.java.part3;

import fc.java.model.PersonVO;

public class ConstructorInit {
    public static void main(String[] args) {
        PersonVO p = new PersonVO("홍길동",15,"010-1234-1234");
        System.out.println(p.getName()+" "+p.getAge()+" "+p.getPhone());

        //초기화를 다르게 하고싶은 경우(오버로딩)
        PersonVO p1 = new PersonVO();
        p1.setName("김길동");
        p1.setAge(18);
        p1.setPhone("010-1234-1234");
        System.out.println(p1.getName()+" "+p1.getAge()+" "+p1.getPhone());
    }
}
