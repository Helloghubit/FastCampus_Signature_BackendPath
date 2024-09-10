package fc.java.poly;

public class Board {
    private String title;
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle()
    {
        return title;
    }

    public String toString(){
        System.out.println(super.toString()); // 상위 클래스의 메서드 호출
        return title;
    }
}
