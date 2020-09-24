package day2;

public class Calculator {
    public static void main(String[] args) {
        int a = 5;
        int b = 11;
        intIntroduction();
        //multiplication(int a, int b);

    }

    public static void intIntroduction() {
        System.out.println(5 + 3);
        System.out.println(2 * 5);
        int a = 5;
        int b = 6;
        int c = a + b;
        System.out.println("распечатать значение c - " + c);
        int money = 900;
        int iphoneCost = 1000;
        System.out.println("количество айфонов, которые я могу купить " + money / iphoneCost);
    }

    public static void multiplication(int a, int b) {
        System.out.println("произведение " + a * b);
    }
}
