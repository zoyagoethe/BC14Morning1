package day07_1;

public class Logic01Two {
    public static void main(String[] args) {
        System.out.println(doorbell(true, true)); // false
        System.out.println(doorbell(false, false)); // false
        System.out.println(doorbell(true, false)); // true
        split();
        boolean electro = true;
        boolean internet = true;
        System.out.println(smartDoorCheckKey(true, true)); // false
        System.out.println(smartDoorCheckKey(true, false)); // false
        System.out.println(smartDoorCheckKey(false, true)); // false
        System.out.println(smartDoorCheckKey(false, false)); // true

    }

    private static boolean smartDoorCheckKey(boolean electro, boolean internet) {
        return !(electro || internet);
    }

    private static void split() {
        System.out.println("***_________***");
    }

    private static boolean doorbell(boolean bellOne, boolean bellTwo) {
        return bellOne ^ bellTwo;

    }
}
