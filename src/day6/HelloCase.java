package day6;

public class HelloCase {
    public static void main(String[] args) {
        String source = "london is the capital of great britain";
        System.out.println(source);
        String phrase2 = source.toUpperCase();
        System.out.println(phrase2);
        String phrase3 = source.substring(0, 1).toUpperCase()
                + source.substring(1).toLowerCase();
        System.out.println(phrase3);


    }
}
