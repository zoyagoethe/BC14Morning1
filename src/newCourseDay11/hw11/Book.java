package newCourseDay11.hw11;

public class Book {
    private String title;
    private String author;
    private String language;
    private Genre genre;
    private int year;
    private Cover cover;

    public Book() {
    }

    public Book(String title, String author, String language, Genre genre, int year, Cover cover) {
        this.title = title;
        this.author = author;
        this.language = language;
        this.genre = genre;
        this.year = year;
        this.cover = cover;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getLanguage() {
        return language;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public Cover getCover() {
        return cover;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", language='" + language + '\'' +
                ", genre=" + genre +
                ", year=" + year +
                ", cover=" + cover +
                '}';
    }
}
