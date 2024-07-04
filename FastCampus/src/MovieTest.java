public class MovieTest {
    public static void main(String[] args) {
        Movie mv = new Movie();
        mv.title = "아바타";
        mv.mday = "2012-12-12";
        mv.mmajor = "제이크 설리";
        mv.mpart = "액션";
        mv.mtime = 192;
        mv.mlevel = 12;
        System.out.println(mv.title+"\t"+mv.mday+"\t"+mv.mmajor+"\t"+mv.mpart+mv.mtime+mv.mlevel);
    }
}
