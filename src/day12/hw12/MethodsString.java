package day12.hw12;

public class MethodsString {
    public static void main(String[] args) {
        split();
        System.out.println(methodsStringOne("Lisbon")); // true
        System.out.println(methodsStringOne("Minsk")); // false
        split();
        System.out.println(methodsStringTwo("Moscow")); // true
        System.out.println(methodsStringTwo("Minsk")); //false
        split();
        System.out.println(methodsStringThree("Berlin"));
        System.out.println(methodsStringThree("Minsk"));
        split();
        System.out.println(methodsStringFour("Saratov")); // true
        System.out.println(methodsStringFour("Minsk")); // false
        split();
        //methodsStringFive();
    }

    /*private static void methodsStringFive(String str) {
        str
    }*/

    private static boolean methodsStringFour(String str) {
        return (str.substring(2, 4).equals("ra"));
    }

    private static boolean methodsStringThree(String str) {
        return str.endsWith("n");
    }

    private static boolean methodsStringTwo(String str) {
        return str.startsWith("Mo");
    }

    private static boolean methodsStringOne(String str) {
        return str.contains("sb");
    }

    private static void split() {
        System.out.println("+-+-+-+-+-+-+");
    }
}
