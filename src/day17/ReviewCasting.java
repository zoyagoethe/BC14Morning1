package day17;

public class ReviewCasting {
    public static void main(String[] args) {
        //intToChar();
        //charToInt();
        stringToChar();
    }

    private static void stringToChar() {

    }

    private static void charToInt() {
        char c1 = 'ж';
        char c2 = '\u039A';
        char c3 = 100;
        int x = c1;
        short s = (short) c1;
        byte b = (byte) c3;
        double d = c1;
        System.out.println(x);
        System.out.println(s);

    }

    private static void intToChar() {
        int x = 90;
        byte b = 100;
        char xyz = (char) b;
        char c = (char) x;
        System.out.println(c);// ->Z
    }
}
