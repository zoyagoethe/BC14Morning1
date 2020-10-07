package day08;

public class SwitchCoffee {
    public static void main(String[] args) {
        int button = 5; // key number vending machine
        vendingMachine(button);
    }

    public static void coffeeWithMilk (){
        System.out.println("Water boiling");
        System.out.println("Coffee preparing");
        System.out.println("Cream adding");
    }

    private static void vendingMachine(int customerChoice) {
        switch (customerChoice) {
            case 1:
                System.out.println("Americano");
                break;
            case 2:
                System.out.println("Cappuccino");
                break;
            case 3:
                System.out.println("Espresso");
                break;
            case 4:
                System.out.println("Cacao");
                break;
            case 5:
                coffeeWithMilk();
                break;
            default:
                System.out.println("Try again");
                break;

        }
        System.out.println("No mistakes");
    }
}
