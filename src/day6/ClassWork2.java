package day6;

public class ClassWork2 {
    public static void main(String[] args) {
        makeOutWord("<<>>", "Yay");
        makeOutWord("<<>>", "WooHoo"); // "<<WooHoo>>"
        makeOutWord("[[]]", "word"); // "[[word]]"
        split();
        System.out.println(firstHalf("WooHoo"));
        System.out.println(firstHalf("HelloThere"));
        System.out.println(firstHalf("abcdef"));
        System.out.println(firstHalf("abcde"));
        split();
        nonStart("Hello", "There"); // "ellohere"
        nonStart("java", "code"); // "avaode"
        nonStart("shotl", "java"); // "hotlava"
        split();
        System.out.println(middleThree("Candy"));
        System.out.println(middleThree("and"));
        System.out.println(middleThree("solving"));
        split();
    }

    private static String middleThree(String str) {
        String result = str.substring(str.length() / 2 - 1,
                str.length() / 2 + 2);
        return result;
    }

    public static void split() {
        System.out.println("_________");
    }

    private static void nonStart(String s1, String s2) {
        String result = s1.substring(1) + s2.substring(1);
        System.out.println(result);

    }

    private static String firstHalf(String input) {
        return input.substring(0, input.length() / 2);

    }

    private static void makeOutWord(String s1, String s2) {
        String result = s1.substring(0, 2) + s2 + s1.substring(2);
        System.out.println(result);
    }
}
