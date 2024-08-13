package fc.java.part3;

import fc.java.model.PersonVO;

public class PersonInfoHide {
    public static void main(String[] args) {
        PersonVO p = new PersonVO();
        p.setName("홍길동");
        p.setAge(5000); // 정보은닉 되지 않음
        p.setPhone("010-1234-1234");
        System.out.println(p.getName() + "\t" + p.getAge() + "\t" + p.getPhone());
    }
}
