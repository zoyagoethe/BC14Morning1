package day28;

        /*18.12. Given an array of ints length 3, figure out which is larger,
        the first or last element in the array, and set all the other elements
        to be that value. Return the changed array.
        maxEnd3([1, 2, 3]) → [3, 3, 3]
        maxEnd3([11, 5, 9]) → [11, 11, 11]
        maxEnd3([2, 11, 3]) → [3, 3, 3]*/

import day20.FillAndPrintInArray;

public class File18Task12Arr {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{11, 5, 9};
        int[] arr3 = new int[]{2, 11, 3};
        FillAndPrintInArray.myPrintIntArray(maxEnd3(arr1)); // → [3, 3, 3]
        FillAndPrintInArray.myPrintIntArray(maxEnd3(arr2)); // → [11, 11, 11]
        FillAndPrintInArray.myPrintIntArray(maxEnd3(arr3)); // → [3, 3, 3]
        //PrintArray();
    }

    private static int[] maxEnd3(int[] arr) {
        int max = Math.max(arr[0], arr[2]);
        int[] output = new int[]{max, max, max};
        return output;
    }

    private static void PrintArray(int[] input) {
        for (int element : input) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static int[] maxEnd3Second(int[] arr) {
        int[] result = new int[arr.length];
        int max = 0;
        if (arr[0] > arr[arr.length - 1]) {
            max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                result[i] = max;
            }
        } else if (arr[0] < arr[arr.length - 1]) {
            max = arr[arr.length - 1];
            for (int i = 0; i < arr.length; i++) {
                result[i] = max;
            }
        }
        return result;
    }
}
