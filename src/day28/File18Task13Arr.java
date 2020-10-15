package day28;

       /* 18.13. Given an array of ints, return a new array length 2 containing the first and last elements from the original array. The original
        array will be length 1 or more.
        makeEnds([1, 2, 3]) → [1, 3]
        makeEnds([1, 2, 3, 4]) → [1, 4]
        makeEnds([7, 4, 6, 2]) → [7, 2]*/

import day20.FillAndPrintInArray;

public class File18Task13Arr {
    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 2, 3};
        int[] arr2 = new int[] {1, 2, 3, 4};
        int[] arr3 = new int[] {7, 4, 6, 2};
        FillAndPrintInArray.myPrintIntArray(makeEnds(arr1)); //→ [1, 3]
        FillAndPrintInArray.myPrintIntArray(makeEnds(arr2)); //→ [1, 4]
        FillAndPrintInArray.myPrintIntArray(makeEnds(arr3)); //→ [7, 2]
    }

    private static int[] makeEnds(int[] arr) {
        int[] output = new int[] {arr[0], arr[arr.length - 1]};
        return output;
    }
}
