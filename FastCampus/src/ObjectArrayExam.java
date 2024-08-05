public class ObjectArrayExam {
    public static void main(String[] args) {
        Movie[] m = new Movie[3];
        m[0] = new Movie();
        m[0].title= "a 영화";
        m[0].mmajor= "김김김";
        m[0].mtime = 160;
        m[0].mday = "2023-01-15";

        m[1] = new Movie();
        m[1].title= "b 영화";
        m[1].mmajor= "박박박";
        m[1].mtime = 130;
        m[1].mday = "2024-02-13";

        m[2] = new Movie();
        m[2].title= "c 영화";
        m[2].mmajor= "이이이";
        m[2].mtime = 130;
        m[2].mday = "2026-06-15";

        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i].title + "\t" + m[i].mmajor + "\t" + m[i].mtime + "\t" + m[i].mday);
        }
    }
}
