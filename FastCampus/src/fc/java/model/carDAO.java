package fc.java.model;
public class carDAO {
    //crud
    // create = insert
    public void carInsert(carDTO car){
        System.out.println("car 정보가 DB에 저장되었습니다.");
    }
    public void carSelect(carDTO car){
        System.out.println("car 정보가 출력되었습니다.");
    }
    public void carUpdate(carDTO car){
        System.out.println("car 정보가 수정되었습니다.");
    }
    public void carDelete(carDTO car){
        System.out.println("car 정보가 삭제되었습니다.");
    }
}
