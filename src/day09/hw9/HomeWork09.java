package day09.hw9;

public class HomeWork09 {
    public static void main(String[] args) {
        System.out.println(moreOrLess(5, 6));
        System.out.println(moreOrLess(5, 5));
        System.out.println(moreOrLess(0, 100));
    }

    private static int moreOrLess(int a1, int a2) {
        int result;
        if (a1 > a2) {
            return a1;
        }
        else if (a1 < a2) {
            return a2;
        } else {
            return 0;


        }


    }

}
