package day12;
// logik uno, task15 - 17; string 13, task 5, 6, 8, 9, 10, 11, 13, 14, 15; file 10 task 2, 3

public class ClassWork12 {
    public static void main(String[] args) {
        split();
        System.out.println(teenSum(3, 4));
        System.out.println(teenSum(10, 13));
        System.out.println(teenSum(13, 2));
        split();
        System.out.println(fizzString("fig")); //Fizz
        System.out.println(fizzString("dib")); //Buzz
        System.out.println(fizzString("fib")); //FizzBuzz
        split();
        System.out.println(inOrder(1, 2, 4, false)); // true
        System.out.println(inOrder(1, 2, 1, false)); // false
        System.out.println(inOrder(1, 1, 2, true)); // true
        split();
        System.out.println(theEnd("Hello", true)); //→ "H"
        System.out.println(theEnd("Hello", false)); //→ "o"
        System.out.println(theEnd("oh", true)); //→ "o"
        split();
        System.out.println(endsLy("oddly")); //→ true
        System.out.println(endsLy("y")); //→ false
        System.out.println(endsLy("oddy")); //→ false
        split();
        System.out.println(lastChars("last", "chars")); //→ "ls"
        System.out.println(lastChars("yo", "java")); //→ "ya"
        System.out.println(lastChars("hi", "")); //→ "h@"
        split();
        System.out.println(seeColor("redxx")); //→ "red"
        System.out.println(seeColor("xxred")); //→ ""
        System.out.println(seeColor("blueTimes"));// → "blue"
        split();
        System.out.println(extraFront("Hello")); //→ "HeHeHe"
        System.out.println(extraFront("ab")); //→ "ababab"
        System.out.println(extraFront("H")); //→ "HHH"
        split();
        System.out.println(startWord("hippo", "hi")); //→ "hi"
        System.out.println(startWord("hippo", "xip")); //→ "hip"
        System.out.println(startWord("hippo", "i")); //→ "h"
        System.out.println(startWord("dippo", "hipp")); //→ "dipp"
        split();
        System.out.println(extraEnd("Hello"));// → "lololo"
        System.out.println(extraEnd("ab"));// → "ababab"
        System.out.println(extraEnd("Hi"));// → "HiHiHi"
        split();
        System.out.println(withoutEnd("Hello"));// → "ell"
        System.out.println(withoutEnd("java"));// → "av"
        System.out.println(withoutEnd("coding"));// → "odin"
        split();
        System.out.println(left2("Hello"));// → "lloHe"
        System.out.println(left2("java"));// → "vaja"
        System.out.println(left2("Hi"));// → "Hi"
        split();
        System.out.println(diff21(19));// → 2
        System.out.println(diff21(10));// → 11
        System.out.println(diff21(21));// → 0
        System.out.println(diff21(25));// → 8
        split();
        System.out.println(nearHundred(93));// → true
        System.out.println(nearHundred(90));// → true
        System.out.println(nearHundred(89));// → false
        split();
    }

    private static boolean nearHundred(int n) {
        return (Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10);
    }

    private static int diff21(int n) {
        if (n > 21) {
            return 2 * (n - 21);
        } else {
            return 21 - n;
        }
    }

    private static String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }

    private static String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);

    }

    private static String extraEnd(String str) {
        //return str.substring(str.length() - 2) + str.substring(str.length() - 2) + str.substring(str.length() - 2);
        String temp = str.substring(str.length() - 2);
        return temp + temp + temp;
    }

    private static String startWord(String str, String word) {
        /*if (str.startsWith(word)) {
            return word;*/
        if (str.substring(1).startsWith(word.substring(1))) {
            return str.substring(0, 1) + word.substring(1);
        } else {
            return str.substring(0, 1);
        }
    }

    private static String extraFront(String str) {
        if (str.length() < 2) {
            return str + str + str;
        } else {
            return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
        }
    }

    private static String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        } else if (str.substring(0, 4).equals("blue")) {
            return "blue";
        } else {
            return "";
        }
    }

    private static String lastChars(String a, String b) {
        if (a.length() == 0) {
            a = "@";
        }
        if (b.length() == 0) {
            b = "@";
        }
        return a.substring(0, 1) + b.substring(b.length() - 1);
    }

    private static boolean endsLy(String str) {
        return str.endsWith("ly");
    }

    private static String theEnd(String str, boolean b) {
        if (b) {
            return str.substring(0, 1);
        } else {
            return str.substring(str.length() - 1);
        }

    }

    private static boolean inOrder(int a, int b, int c, boolean bOk) {
        // task 17
        //return bOk && c > b || b > a && c > b;
        if (b > a && c > b) {
            return true;
        } else if (bOk && c > b) {
            return true;
        }
        return false;
    }

    private static String fizzString(String str) {
        if (str.startsWith("f") && str.endsWith("b")) {
            return "FizzBuzz";
        } else if (str.startsWith("f")) {
            return "Fizz";
        } else if (str.endsWith("b")) {
            return "Buzz";
        } else {
            return str;
        }
    }

    private static void split() {
        System.out.println("**********");
    }

    private static int teenSum(int a, int b) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            return 19;
        } else {
            return a + b;
        }
    }
}
