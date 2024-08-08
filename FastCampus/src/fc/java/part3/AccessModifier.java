package fc.java.part3;
import fc.java.model.MemberDTO;
public class AccessModifier {
    public static void main(String[] args) {
        MemberDTO m = new MemberDTO();
        m.name = "홍길동";
        //정보가 은닉되어 m.age은 실행이 안됨
        m.phone = "010-1234-1234";
        m.ageGet();
        m.memberInfo();
    }
}
