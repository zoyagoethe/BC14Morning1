package newCourseDay3;

public class Movie {
    private String title;
    private int year;
    private String genre;

    public Movie(String title, int year, String genre) {
        this.title = title;
        this.year = year;
        this.genre = genre;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String newTitle){
        this.title = newTitle;
    }

}
// паттерны проектирования singleton-одиночка
class TestMovie{
    public static void main(String[] args) {
        Movie bestFilm = new Movie("Kuku", 2020, "Fantasy");
        System.out.println(bestFilm.getTitle());

        bestFilm.setTitle("Kukareku");
        System.out.println(bestFilm.getTitle());
    }
}