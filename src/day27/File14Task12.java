package day27;
/*
Given a string, does "xyz" appear in the middle of the string? To define middle,
we'll say that the number of chars to the left and right of the "xyz" must differ by at most one.
This problem is harder than it looks like.
        xyzMiddle("AAxyzBB") → true
        xyzMiddle("AxyzBB") → true
        xyzMiddle("AxyzBBB") → false
*/

public class File14Task12 {
    public static void main(String[] args) {
        //1. find out the location of 'xyz'
        //2. amount of chars bevor 'xyz'
        //3. amount of chars after 'xyz'
        System.out.println(xyzMiddle("AAxyzBB"));// → true
        System.out.println(xyzMiddle("AxyzBB"));// → true
        System.out.println(xyzMiddle("AxyzBBB"));// → false
    }

    private static boolean xyzMiddle(String input) {
        String xyz = "xyz";
        int xyzStart = input.indexOf(xyz);
        int xyzEnd = xyzStart + 2;
        int countSymbolsStart = xyzStart;
        int countSymbolsEnd = input.length() - xyzEnd - 1;
        int difference = Math.abs(countSymbolsStart - countSymbolsEnd);
        if (difference <= 1) {
            return true;
        }
        return false;
    }
}
