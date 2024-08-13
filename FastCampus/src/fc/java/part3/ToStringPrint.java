package fc.java.part3;

import fc.java.model.PersonVO;

public class ToStringPrint {
    public static void main(String[] args) {
        PersonVO person = new PersonVO();
        System.out.println(person.toString());
        System.out.println(person);
    }
}
