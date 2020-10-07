package day07.hw_from_day6;

public class HomeWork6 {
    public static void main(String[] args) {
        System.out.println(lastChars("last", "chars"));
        System.out.println(lastChars("yo", "java"));
        split();
        System.out.println(makeAbba("Hi", "Bye"));
        System.out.println(makeAbba("Yo", "Alice"));
        System.out.println(makeAbba("What", "Up"));
    }

    private static String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    private static void split() {
        System.out.println("_________");
    }

    private static String lastChars(String s1, String s2) {
        return s1.substring(0, 1) + s2.substring(s2.length() - 1);
    }

}
