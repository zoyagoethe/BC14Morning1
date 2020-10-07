package day13;

public class HomeWork12InClass {
    public static void main(String[] args) {
        System.out.println(cityWeather("Minsk")); //24
        System.out.println(cityWeather("Berlin")); //26
    }
    private static int cityWeather(String cityName) {
        int temperatureCityOnMonday = getTempMonday(cityName);
        return 6 + temperatureCityOnMonday;
    }

    private static int getTempMonday(String cityName) {
        int output = 0;
        switch (cityName) {
            case "Berlin":
                output = 20;
                break;
            case "London":
                output = 17;
                break;
            case "Lisbon":
                output = 25;
                break;
            case "Paris":
                output = 23;
                break;
            case "Moscow":
                output = 19;
                break;
            case "Minsk":
                output = 18;
                break;
            case "Saratov":
                output = 15;
                break;
            default:
                output = -273;
                break;
        }
        return output;
    }
}
