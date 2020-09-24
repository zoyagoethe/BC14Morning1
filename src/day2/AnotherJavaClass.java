package day2;

public class AnotherJavaClass {
    public static void main(String[] args) {
        getMeCoffee();
    }

    public static void getMeCoffee() {
        System.out.println("Рецепт кофе:");
        getWatterToCoffee();
        getMeCoffeeToCoffee();

    }

    public static void getWatterToCoffee() {
        System.out.println("наливаем воду в пластиковый стакан");
    }

    public static void getMeCoffeeToCoffee() {
        System.out.println("насыпаем 5 грамм кофе в стакан");
    }

}