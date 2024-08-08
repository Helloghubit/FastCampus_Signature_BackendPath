package fc.java.part2;

public class MemberTest {
    public static void main(String[] args) {
        Member m = new Member();
        m.name = "홍길동";
        m.age = 45;
        m.number = "010-1231-1231";
        m.email = "fc@fc.com";
        m.addr="서울";
        m.weight = 57.6f;
        System.out.println(m.name+"\t"+m.age+"\t"+m.number+"\t"+m.email+"\t"+m.addr+"\t"+m.weight);
    }
}
