package newCourseDay11;

// add film, delete film, display films, display films by cinema, display films by genres

import java.util.Arrays;

public class Schedule {
    private Movie[] movies;
    int size;

    public Schedule(int capacity) {
        this.movies = new Movie[capacity];
        this.size = 0;
    }

    public void displayFilms() {
        for (int i = 0; i < size; i++) {
            System.out.println(movies[i]);
        }
    }

    public void displayFilmsByGenre(Genre genre) {
        for (int i = 0; i < size; i++) {
            Genre temp = movies[i].getGenre();
            if (temp.equals(genre)) {
                System.out.println("Search results -> here are films of desired genre: " + temp + movies[i]);
                System.out.println("**********");
            }
        }
    }

    public void displayFilmsByCinema(Cinema cinema) {
        for (int i = 0; i < size; i++) {
            Cinema[] temp = movies[i].getCinemas();
            for (int j = 0; j < temp.length; j++) {
                if (temp[j].equals(cinema)) {
                    System.out.println("Search results -> following films are shown in desired cinema: " + movies[i]);
                    System.out.println("**********");
                }
            }
        }
    }

    public boolean deleteFilm(Movie movie) {
        for (int i = 0; i < size; i++) {
            if (movies[i].equals(movie)) {
                movies[i] = movies[size - 1];
                movies[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    public boolean addFilm(Movie movie) {
        if (size < movies.length) {
            movies[size] = movie;
            size++;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "movies=" + Arrays.toString(movies) +
                '}';
    }
}
