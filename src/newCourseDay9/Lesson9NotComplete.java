package newCourseDay9;

import java.time.LocalDateTime;

public class Lesson9NotComplete {
    public static void main(String[] args) {
        split();
        /*int[] arr = new int[5];
        int element = arr[5];
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
        at newCourseDay9.Lesson9.main(Lesson9.java:6)

        Process finished with exit code 1*/
        testArr();
        split();
        //int a = 5 / 0;
        //ArithmeticException
        tryArithmetic();
        split();
        tryParse();
        split();
    }

    private static void split() {
        System.out.println("**********");
    }

    private static void tryParse() {
        try {
            String s1 = "2020";
            String s2 = "2020год";
            int output1 = Integer.parseInt(s1);
            int output2 = Integer.parseInt(s2);
            System.out.println("trying");

        } catch (NumberFormatException numberFormatException) {
            System.out.println("catching " + numberFormatException.toString());

        } finally {
            System.out.println("still working");
        }
        System.out.println(LocalDateTime.now());
    }

    private static void tryArithmetic() {
        try {
            int a = 5 / 0;
            System.out.println("part of method false");
            String s = "34";
        } catch (ArithmeticException ex) {
            System.out.println(" false 0 division " + ex.toString());
        } finally {
            System.out.println("everything lost");
        }
        System.out.println("last line done?");
    }

    private static void testArr() {
        int[] arr = new int[5];
        try {
            int element = arr[5];
            System.out.println("smth");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("cought " + exception.toString());
            ;
        }
        System.out.println("end");
    }
}
