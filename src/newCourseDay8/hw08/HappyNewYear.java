package newCourseDay8.hw08;

// Создайте программу, которая находит сколько дней осталось до Нового Года.

import java.time.LocalDate;
import java.time.Period;

public class HappyNewYear {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate newYear = LocalDate.of(2020, 12, 31);
        /*Period numberOfDaysLeft = Period.between(today, newYear);
        System.out.println("There are " + numberOfDaysLeft.getMonths()
                + " month(s) and " + numberOfDaysLeft.getDays() + " days left until the New Year!");*/
        int numberOfDaysLeft = newYear.getDayOfYear() - today.getDayOfYear();
        System.out.println(numberOfDaysLeft + " days left until the New Year");
    }
}
