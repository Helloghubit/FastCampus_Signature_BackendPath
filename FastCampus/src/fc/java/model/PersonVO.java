package fc.java.model;

import fc.java.part3.Person;

public class PersonVO {
    private String name;
    private int age;
    private String phone;
    public PersonVO(){
        this.name = "홍길동";
        this.age = 15;
        this.phone = "010-1234-1234";
    }
    public PersonVO(String name, int age, String phone){
        this.name = name;
        this.age= age;
        this.phone= phone;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public String getPhone() {
        return this.phone;
    }
    public String toString(){
        return this.name + "\t" + this.age + "\t" + this.phone;
    }
}