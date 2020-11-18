package newCourseDay11;

import java.time.LocalDate;

public class CinemaApp {
    public static void main(String[] args) {
        Address address1 = new Address("Lenin street", 13);
        Address address2 = new Address("Karl Marx street", 12);
        Address address3 = new Address("Friedrich Engels street", 11);
        Address address4 = new Address("Trotskij street", 10);
        Address address5 = new Address("Stalin street", 9);
        Cinema cosmos = new Cinema("Cosmos", address1);
        Cinema space = new Cinema("Space", address2);
        Cinema star = new Cinema("Towards Stars", address3);
        Cinema voyager = new Cinema("Voyager", address4);
        Cinema alien = new Cinema("Alien", address5);

        Movie movie1 = new Movie("Space", LocalDate.of(2019, 7, 3), Genre.FANTASY, cosmos);
        Movie movie2 = new Movie("FullMoon", LocalDate.of(2018, 6, 2), Genre.CRIME, space);
        Movie movie3 = new Movie("Mignon", LocalDate.of(2020, 8, 31), Genre.CARTOONS, star);
        Movie movie4 = new Movie("Dragon", LocalDate.of(2019, 10, 22), Genre.ADVENTURE, voyager);
        Movie movie5 = new Movie("TrueLove", LocalDate.of(2018, 11, 23), Genre.ROMANTIC, alien);
        Movie movie6 = new Movie("TrueLoveTwo", LocalDate.of(2019, 3, 13), Genre.ROMANTIC, alien);
        Movie movie7 = new Movie("TrueLoveThree", LocalDate.of(2019, 5, 24), Genre.ROMANTIC, alien);
        Movie movie8 = new Movie("TrueLoveThree", LocalDate.of(2019, 5, 24), Genre.ROMANTIC, star);
        Schedule plan = new Schedule(128);
        plan.addFilm(movie1);
        plan.addFilm(movie2);
        plan.addFilm(movie3);
        plan.addFilm(movie4);
        plan.addFilm(movie5);
        plan.addFilm(movie6);
        plan.addFilm(movie7);
        plan.addFilm(movie8);
        //System.out.println(plan);
        //plan.deleteFilm(movie3);
        //plan.displayFilms();
        //plan.displayFilmsByGenre(Genre.ROMANTIC);
        plan.displayFilmsByCinema(star);

        //System.out.println(movie1);
    }
}
