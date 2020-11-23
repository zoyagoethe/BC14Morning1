package newCourseDay12;

public class Solution {
    public static void main(String[] args) {
        System.out.println(stringReverse("hello"));
        System.out.println(stringReverse("Dummkopf"));
        //System.out.println(squareRecursive(5));

    }

    /*private static int squareRecursive(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return ???;
        }
    }*/

    private static String stringReverse(String str) {
        String output = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            output = output + str.charAt(i);
        }
        return output;
    }
}


