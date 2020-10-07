package day10;

public class HomeWork09InClass {
    public static void main(String[] args) {
        /*        System.out.println(moreOrLess(5, 6));// ожидаю -> 6
        System.out.println(moreOrLess(5, 5));//ожидаю -> 0
        System.out.println(moreOrLess(0, 100));// ожидаю -> 100
        split();
        System.out.println("задание номер  два " + mySum(5, 6, 5)); // -> 6
        System.out.println(mySum(5, 6, 7)); //-> 18
        System.out.println(mySum(0, 0, 0)); //-> 0
        System.out.println(mySum(0, -5, 5)); // -> -1
        split();*/
/*        forTimesAlphabetOne();
        forTimesAlphabetTwo();
        System.out.println(forTimesAlphabetThree());*/
        //fibonacci();
        System.out.println(sleepIn(false, false));// → true
        System.out.println(sleepIn(true, false)); //→ false
        System.out.println(sleepIn(false, true));// → true
    }

    private static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
        //return !weekday || vacation;
/*        if (!weekday || vacation) return true;
        else return false;*/
    }

    private static void fibonacci() {
        int n1 = 1;
        int n2 = 1;
        System.out.print(n1 + " ");
        System.out.print(n2 + " ");

        int temp = 0;

        for (int i = 0; i < 9; i++) {
            temp = n1 + n2;
            System.out.print(temp + " ");
            // меняем
            n1 = n2;
            n2 = temp;
        }
    }


    private static String forTimesAlphabetThree() {
        String result = "";
        for (char c = 'A'; c <= 'Z'; c++) {
            result = result + "\n" + c + c + c + c;
        }
        return result;
    }

    private static void forTimesAlphabetTwo() {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println(" " + c + c + c + c);
            // пустые кавычки помогают сложение изменить на конкатенацию
        }
    }

    public static void forTimesAlphabetOne() {
        for (int i = 65; i <= 90; i++) {
            char temp = (char) i;
            System.out.println("" + temp + temp + temp + temp);
        }
    }

    private static int mySum(int a, int b, int c) {
        if (a == c) return b;
        else if (a + b + c == 0) return -1;
        else return a + b + c;
    }

    private static void split() {
        System.out.println("-------------");
    }

    private static int moreOrLess(int a, int b) {
        //return Math.max(a, b);
        if (a == b) {
            return 0;
        } else if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
