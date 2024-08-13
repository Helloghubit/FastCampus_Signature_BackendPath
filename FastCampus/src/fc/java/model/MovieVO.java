package fc.java.model;

public class MovieVO {
    private String title;
    private String year;
    private String mainCharacter;
    private String genre;
    private float runningTime;
    private int age;
    public MovieVO(String title, String year, String mainCharacter, String genre, float runningTime, int age) {
        this.title = title;
        this.year = year;
        this.mainCharacter = mainCharacter;
        this.genre = genre;
        this.runningTime = runningTime;
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMainCharacter() {
        return mainCharacter;
    }

    public void setMainCharacter(String mainCharacter) {
        this.mainCharacter = mainCharacter;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public float getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(float runningTime) {
        this.runningTime = runningTime;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "MovieVO{" +
                "title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", mainCharacter='" + mainCharacter + '\'' +
                ", genre='" + genre + '\'' +
                ", runningTime=" + runningTime +
                ", age=" + age +
                '}';
    }
}
