package day23.hw;

/*  1. Given two strings, word and a separator sep, return a big string made of count occurrences of the word,
    separated by the separator string.

    2. A sandwich is two pieces of bread with something in between. Return the string that is between the first and last
    appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.

    3. Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
    Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".

    NoNumber. Given an array of ints, swap the first and last elements in the array. Return the modified array.
    The array length will be at least 1.

    4. Given an int array of any length, return a new array of its first 2 elements.
    If the array is smaller than length 2, use whatever elements are present.

    5. Given 2 int arrays, a and b, of any length, return a new array with the first element of each array.
    If either array is length 0, ignore that array.
*/

import day20.FillAndPrintInArray;

public class HomeWork23 {
    public static void main(String[] args) {
        split();
        System.out.println(repeatSeparator("Word", "X", 3)); // →"WordXWordXWord"
        System.out.println(repeatSeparator("This", "And", 2));// →"ThisAndThis"
        System.out.println(repeatSeparator("This", "And", 1));// →"This"
        split();
        /*System.out.println(getSandwich("breadjambread")); // → "jam"
        System.out.println(getSandwich("xxbreadjambreadyy")); // → "jam"
        System.out.println(getSandwich("xxbreadyy")); // → "It is not a real sandwich!"
        split();
        System.out.println(zipZap("zipXzap"));// → "zpXzp"
        System.out.println(zipZap("zopzop"));// → "zpzp"
        System.out.println(zipZap("zzzopzop"));// → "zzzpzp"
        split();*/
        int[] arr1 = new int[]{1, 2, 3, 4};
        int[] arr2 = new int[]{1, 2, 3};
        int[] arr3 = new int[]{8, 6, 7, 9, 5};
        FillAndPrintInArray.myPrintIntArray(swapEnds(arr1));// → [4, 2, 3, 1]
        FillAndPrintInArray.myPrintIntArray(swapEnds(arr2));// → [3, 2, 1]
        FillAndPrintInArray.myPrintIntArray(swapEnds(arr3));// → [5, 6, 7, 9, 8]
        split();
        int[] ar1 = new int[]{1, 2, 3};
        int[] ar2 = new int[]{1, 2};
        int[] ar3 = new int[]{1};
        FillAndPrintInArray.myPrintIntArray(frontPiece(ar1));// → [1, 2]
        FillAndPrintInArray.myPrintIntArray(frontPiece(ar2));// → [1, 2]
        FillAndPrintInArray.myPrintIntArray(frontPiece(ar3));// → [1]
        split();
        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{7, 9, 8};
        int[] a3 = new int[]{1};
        int[] a4 = new int[]{2};
        int[] a5 = new int[]{1, 7};
        int[] a6 = new int[]{};
        FillAndPrintInArray.myPrintIntArray(front11(a1, a2));// → [1, 7]
        FillAndPrintInArray.myPrintIntArray(front11(a3, a4));// → [1, 2]
        FillAndPrintInArray.myPrintIntArray(front11(a5, a6));// → [1]
        split();
    }

    private static int[] front11(int[] a, int[] b) {
        int[] output;
        if (a.length == 0) {
            output = new int[]{b[0]};
        } else if (b.length == 0) {
            output = new int[]{a[0]};
        } else output = new int[]{a[0], b[0]};
        return output;
    }

    private static int[] frontPiece(int[] input) {
        int[]output;
        if (input.length >= 2) {
            output = new int[]{input[0], input[1]};
            return output;
        } else return input;

    }

    private static int[] swapEnds(int[] input) {
        int temp = input[0];
        input[0] = input[input.length - 1];
        input[input.length - 1] = temp;

        return input;
    }

    private static String zipZap(String zzzopzop) {
        String output = "";


        return output;
    }

    private static String getSandwich(String input) {
        String searchedStr = "bread";
        String output = "";
        if (input.length() < 2 * searchedStr.length()) {
            return output;
        } else if (input.startsWith(searchedStr) && input.endsWith(searchedStr)) {
            return input.substring(searchedStr.length(), input.length() - searchedStr.length());
            /*} else if () {
             */
        } else {
            return output;
        }
    }

    private static void split() {
        System.out.println("*_*_*_*_*_*_*_*_*_*_*_*");
    }

    private static String repeatSeparator(String str1, String str2, int key) {
        String output = str1;
        for (int i = 0; i < key - 1; i++) {
            output += str2 + str1;
        }
        return output;
    }
}