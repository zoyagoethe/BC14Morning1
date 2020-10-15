package day27;
/*
Given a string and an int n, return a string made of the first n characters of the string,
followed by the first n-1 characters of the string, and so on.
You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).
        repeatFront("Chocolate", 4) → "ChocChoChC"
        repeatFront("Chocolate", 3) → "ChoChC"
        repeatFront("Ice Cream", 2) → "IcI"
*/

public class File14Task11RepeatFront {
    public static void main(String[] args) {
        System.out.println(repeatFront("Chocolate", 4)); //→"ChocChoChC"
        System.out.println(repeatFront("Chocolate", 3)); //→"ChoChC"
        System.out.println(repeatFront("Ice Cream", 2)); //→"IcI"
    }

    private static String repeatFront(String input, int number) {
        String output = "";
        int count = number;
        for (int i = 0; i < number; i++) {
            output += input.substring(0, count--);
        }
        return output;
    }

    private static String repeatFrontThird(String input, int number) {
        String output = "";
        for (int i = 0; i < number; i++) {
            output += input.substring(0, number - i);
        }
        return output;
    }

    private static String repeatFrontSecond(String str, int number) {
        String output = "";
        for (int j = number; j > 0; j--) {
            output = output + str.substring(0, j);
        }
        return output;//более элегантный метод
    }
}
