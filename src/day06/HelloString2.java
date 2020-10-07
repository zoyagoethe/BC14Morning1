package day06;

public class HelloString2 {
    public static void main(String[] args) {
        String poem = "Я памятник воздвиг себе нерукотворный";
        int length = poem.length();
        System.out.println(length);
        String preview = poem.substring(0, 10);
        System.out.println(preview);
        String end = poem.substring(length - 10);
        System.out.println(end);
        char test = poem.charAt(0);
        System.out.println(test);
        char test2 = poem.charAt(length - 1);
        System.out.println(test2);
    }
}
