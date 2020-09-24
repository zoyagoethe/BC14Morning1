package day10;

public class HomeWorkInClass9 {
    public static void main(String[] args) {
        System.out.println(moreOrLess(5, 6));
        System.out.println(moreOrLess(5, 5));
        System.out.println(moreOrLess(0, 100));
        split ();
    }

    private static void split() {
        System.out.println("***__________***");
    }

    private static int moreOrLess(int a, int b) {
        if (a == b){
            return 0;
        } else {
            return Math.max(a, b);
        }
    }
}
