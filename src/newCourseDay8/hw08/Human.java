package newCourseDay8.hw08;

// Создайте класс Human и гетер, который даёт точный возраст человека(в годах), если нам известна дата его рождения.

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Human {
    String name;
    String birthday;

    public Human(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public int getAgeInYears() {
        LocalDate today = LocalDate.now();
        LocalDate birthdate = LocalDate.parse(birthday,
                DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        Period age = Period.between(birthdate, today);
        return age.getYears();
    }
}

class TestHuman {
    public static void main(String[] args) {
        Human pen = new Human("Pen", "10.10.1910");
        Human guin = new Human("Guin", "02.02.2002");
        System.out.println(pen.name + " is " + pen.getAgeInYears() + " years old.");
        System.out.println(guin.name + " is " + guin.getAgeInYears() + " years old.");
    }

}
