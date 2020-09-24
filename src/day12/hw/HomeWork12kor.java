package day12.hw;

public class HomeWork12kor {
    public static void main(String[] args) {
        split();
        System.out.println(cityWeather("Minsk"));// ->24
        System.out.println(cityWeather("Lisbon"));// ->31
        System.out.println(cityWeather("Dresden"));// -> input invalid
        split();
        //System.out.println(cityWeather("Minsk", "Friday"));// -> 22
    }

    /*private static int cityWeather(String city, String weekday) {

}*/

    private static void split() {
        System.out.println("++++++++++");
    }

    private static int cityWeather(String city) {
        int t1 = 20;
        int t2 = 17;
        int t3 = 25;
        int t4 = 23;
        int t5 = 19;
        int t6 = 18;
        int t7 = 15;
        int output = 0;
        switch (city) {
            case "Berlin":
                output = t1 + 6;
                break;
            case "London":
                output = t2 + 6;
                break;
            case "Lisbon":
                output = t3 + 6;
                break;
            case "Paris":
                output = t4 + 6;
                break;
            case "Moscow":
                output = t5 + 6;
                break;
            case "Minsk":
                output = t6 + 6;
                break;
            case "Saratov":
                output = t7 + 6;
                break;
            default:
                System.out.println("input invalid");
                break;

        }
        return output;

    }

}
