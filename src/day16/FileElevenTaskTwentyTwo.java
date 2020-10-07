package day16;

/*Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation,
return a string of the form "7:00" indicating when the alarm clock should ring. Weekdays,
the alarm should be "7:00" and on the weekend it should be "10:00". Unless we are on vacation
-- then on weekdays it should be "10:00" and weekends it should be "off".*/

public class FileElevenTaskTwentyTwo {
    public static void main(String[] args) {
        System.out.println(alarmClock(1, false));// → "7:00"
        System.out.println(alarmClock(5, false));// → "7:00"
        System.out.println(alarmClock(0, false));// → "10:00"
    }

    private static String alarmClock(int day, boolean vacation) {
        String alarm = "";
        if (vacation && day <= 6 && day >= 6) {
            alarm = "off";
        } else if (day < 6 && day > 0 || vacation) {
            alarm = "10:00";
        } else {
            alarm = "7:00";
        }
        return alarm;
    }
}
