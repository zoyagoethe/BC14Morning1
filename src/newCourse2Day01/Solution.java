package newCourseDay12;

public class Solution {
    public static void main(String[] args) {
        split();
        System.out.println(stringReverse("hello"));
        System.out.println(stringReverse("Dummkopf"));
        split();
        System.out.println(squareRecursive(5));
        System.out.println(squareRecursive(3498));
        split ();

    }

    private static void split() {
        System.out.println("**********");
    }

    private static int squareRecursive(int n) {
        if (n == 1) {
            return 1;
        } else {
            return squareRecursive(n-1)+n + n - 1;
        }
    }

    private static String stringReverse(String str) {
        String output = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            output += str.charAt(i);
        }
        return output;
    }
}


