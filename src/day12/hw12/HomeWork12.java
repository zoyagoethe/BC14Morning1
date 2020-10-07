/* 1. Всю неделю в Европе держится одна погода, увеличиваясь всего на один градус ежедневно.
  Нам известно, что в Берлине в понедельник было 20 градусов тепла,
  в Лондоне 17 градустов тепла,
  в Лиссабоне 25 градусов тепла,
  в Париже 23 градуса тепла,
  в Москве 19 градусов тепла,
  в Минске 18 градусов тепла,
  в Саратове 15 градусов тепла.

Напишите программу, которая принимает название города и возвращает температуру в воскресение.
Пример: citiWeather("Минск") -> 24.

2. Задача на звёздочку. Напишите программу, которая принимает название города и день недели
и возвращает температуру.
Пример: citiWeather("Минск", "Пятница") -> 22.

3.  Разобраться с методами String:
  contains(CharSequence s)
  endsWith(String suffix)
  equals(Object anObject)
  startsWith(String prefix)
  substring(int beginIndex)
  toLowerCase()
  toUpperCase()
  trim()
Это значит показать пример работы метода и короткое пояснение, что метод делает на самом деле. */

package day12.hw12;

public class HomeWork12 {
    public static void main(String[] args) {
        split();
        System.out.println(cityWeather("Минск", 18)); //18 -> 24
        System.out.println(cityWeather("Берлин", 20)); //20 -> 26
        System.out.println(cityWeather("Лондон", 17)); //17 -> 23
        System.out.println(cityWeather("Лиссабон", 25)); //25 -> 31
        System.out.println(cityWeather("Париж", 23)); //23 -> 29
        System.out.println(cityWeather("Москва", 19)); //19 -> 25
        System.out.println(cityWeather("Саратов", 15)); //15 -> 21
        split();
        System.out.println(cityWeatherWeekDay("Minsk", "Friday", 18));// 22
        System.out.println(cityWeatherWeekDay("Moscow", "Tuesday", 19)); // 20
        System.out.println(cityWeatherWeekDay("Paris", "Sunday", 23)); // 29
        System.out.println(cityWeatherWeekDay("Saratov", "Wednesday", 15)); // 17
        System.out.println(cityWeatherWeekDay("Lisbon", "Thursday", 25)); // 28
        System.out.println(cityWeatherWeekDay("Berlin", "Saturday", 20)); // 25
        System.out.println(cityWeatherWeekDay("Berlin", "Tomorrow", 20)); // input invalid
        split();


    }

    private static String cityWeatherWeekDay(String city, String weekday, int tMo) {
        int output = 0;
        switch (weekday) {
            case "Tuesday":
                output = tMo + 1;
                break;
            case "Wednesday":
                output = tMo + 2;
                break;
            case "Thursday":
                output = tMo + 3;
                break;
            case "Friday":
                output = tMo + 4;
                break;
            case "Saturday":
                output = tMo + 5;
                break;
            case "Sunday":
                output = tMo + 6;
                break;
            default:
                System.out.println("input invalid");
                break;
        }
        return city + " - " + output + " on " + weekday + ".";
    }

    private static void split() {
        System.out.println("*_*_*_*_*_*");
    }

    private static String cityWeather(String city, int tMo) {
        int tSo = tMo + 6;
        return city + " - в воскресенье ожидается +" + tSo + ".";
    }
}
