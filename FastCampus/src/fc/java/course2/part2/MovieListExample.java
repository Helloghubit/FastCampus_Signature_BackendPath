package fc.java.course2.part2;

import fc.java.model2.Movie;

import java.util.ArrayList;

public class MovieListExample {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<>();
        list.add(new Movie("괴물","봉준호","2006","한국"));
        list.add(new Movie("기생충","봉준호","2019","한국"));
        list.add(new Movie("완벽한 타인","이재규","2018","한국"));

        System.out.println("+----------------+--------+----+------+");
        System.out.println("| 영화 제목        | 감독   |개봉년도|국가|");
        System.out.println("+----------------+--------+----+------+");
        for (Movie m : list) {
            moviePrint(m);
            System.out.println();
        }
        System.out.println("+----------------+--------+----+------+");
        System.out.println();

        String searchTitle = "기생충";
        for(Movie m : list){
            if(m.getTitle().equals(searchTitle)){
                moviePrint(m);
                break;
            }
        }
    }

    private static void moviePrint(Movie m){
        System.out.printf("|%-16s|%-8s|%-8s|%-8s|",m.getTitle(),m.getDirector(),m.getYear(),m.getCountry());
    }
}
