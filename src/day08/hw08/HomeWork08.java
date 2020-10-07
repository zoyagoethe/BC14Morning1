package day08.hw08;

import static day06.ClassWork2.split;

public class HomeWork08 {
    public static void main(String[] args) {
        int customerAge = 30;
        System.out.println("input: " + customerAge + "\n output: " + alcoholSale(customerAge));
        split();

        int month = 13;
        System.out.println(giveMeSeason(month));
    }

    private static String giveMeSeason(int a) {
        String result;
        switch (a) {
            case 1:
            case 2:
            case 12:
                result = "winter";
                break;
            case 3:
            case 4:
            case 5:
                result = "spring";
                break;
            case 6:
            case 7:
            case 8:
                result = "summer";
                break;
            case 9:
            case 10:
            case 11:
                result = "autumn";
                break;
            default:
                result = "hello my extraterrestrial friend";
                break;

        }
return result;
    }

    private static String alcoholSale(int age) {
        String result;
        switch (age) {
            case 10:
                result = "here is your lemonade";
                break;
            case 17:
                result = "here is your bier";
                break;
            case 18:
            case 20:
            case 30:
                result = "here is whatever you want";
                break;
            default:
                result = "invalid number - try again";
                break;
        }
        return result;
    }
}
