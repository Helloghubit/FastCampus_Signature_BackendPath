package fc.java.part3;

import fc.java.model.PersonVO;

public class SetterGetterTest {
    public static void main(String[] args) {
        PersonVO p = new PersonVO();
        p.setName("홍길동");
        p.setAge(22);
        p.setPhone("010-1234-1234");
        String name = p.getName();
        int age = p.getAge();
        String phone = p.getPhone();
        System.out.println(name+" "+age+" "+phone);
    }
}
