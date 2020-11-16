package newCourseDay8.myDateNotComplete;

import java.util.Calendar;
import java.util.Date;

public class HelloMyDate {
    public static void main(String[] args) {
        split();
        Date today = new Date();
        System.out.println(today);
        split();
        Date dateStart = new Date(0);
        System.out.println(dateStart);
        split();
        Date anotherDate = new Date(1_451_665_447_567L);
        System.out.println(anotherDate);
        split();
        Date theEnd = new Date(Long.MAX_VALUE);
        System.out.println(theEnd);
        System.out.println();
        split();

        Calendar calendar = Calendar.getInstance();// мы инстанциировались
        calendar.setTime(anotherDate);
        System.out.println(calendar);
        split();

        System.out.println("calendar.getTime()" + calendar.getTime());
    }

    private static void split() {
        System.out.println("************");
    }
}

   /* public static Calendar getInstance()
    {
        Locale aLocale = Locale.getDefault(Locale.Category.FORMAT);
        return createCalendar(defaultTimeZone(aLocale), aLocale);


        gfhjg - äduard

    }*/
