package day16;

/*file 11, task 20: Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and
        23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)
        shareDigit(12, 23) → true
        shareDigit(12, 43) → false
        shareDigit(12, 44) → false*/

import javax.swing.*;

public class LogicUnoThree {
    public static void main(String[] args) {
        System.out.println(shareDigit(12, 23));// → true
        System.out.println(shareDigit(12, 43));// → false
        System.out.println(shareDigit(12, 44));// → false
    }

    private static boolean shareDigit(int one, int two) {
        int a1 = one/10;
        int a2 = one%10;
        int b1 = two/10;
        int b2 = two%10;
        if (a1==b1 ||a1 ==b2 || a2 == b1 || a2 ==b2){
    }return true;
}

    }
//}


