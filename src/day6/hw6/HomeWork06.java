package day6.hw6;

public class HomeWork06 {
    public static void main(String[] args) {
        System.out.println(lastChars("last", "chars"));
        System.out.println(lastChars("yo", "java"));
        split();
        System.out.println(makeAbba("Hi", "Bye"));
        System.out.println(makeAbba("Yo", "Alice"));
        System.out.println(makeAbba("What", "Up"));
    }

    private static String makeAbba(String s1, String s2) {
        String output = s1 + s2 + s2 + s1;
        return output;
    }

    public static void split() {
        System.out.println("_________");
    }

    private static String lastChars(String s1, String s2) {
        String result = s1.substring(0, 1) + s2.substring(s2.length() - 1);
        return result;
    }
}
