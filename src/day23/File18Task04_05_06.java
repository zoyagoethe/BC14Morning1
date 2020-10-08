package day23;

import day20.FillAndPrintInArray;

/*4. Даны 2 массива int, a и b, каждый длиной 3, верните новый массив с длиной 2, содержащего среднее
        арифметическое элементов первоначальных массивов.
        5. Given an int array length 2, return true if it does not contain a 2 or 3.
        6. Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the
changed array.*/

public class File18Task04_05_06 {
    public static void main(String[] args) {
        /*int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{4, 5, 6};
        int[] arr3 = new int[]{7, 7, 7};
        int[] arr4 = new int[]{3, 8, 0};
        int[] arr5 = new int[]{5, 2, 9};
        int[] arr6 = new int[]{1, 4, 5};
        middleWay(arr1, arr2); //→ [2, 5]
        middleWay(arr3, arr4); //→ [7, 8]
        middleWay(arr5, arr6); //→ [2, 4]
        FillAndPrintInArray.myPrintIntArray(middleWay(arr1, arr2));
        FillAndPrintInArray.myPrintIntArray(middleWay(arr3, arr4));
        FillAndPrintInArray.myPrintIntArray(middleWay(arr5, arr6));*/
        /*int[] a1 = new int[]{4, 5};
        int[] a2 = new int[]{4, 2};
        int[] a3 = new int[]{3, 5};
        System.out.println(no23(a1));//true
        System.out.println(no23(a2));//false
        System.out.println(no23(a3));//false*/

        int[] fix1 = new int[]{1, 2, 3};
        int[] fix2 = new int[]{2, 3, 5};
        int[] fix3 = new int[]{1, 2, 1};
        int[] fix4 = new int[]{3, 2, 1};
        FillAndPrintInArray.myPrintIntArray(fix23(fix1)); //→ [1, 2, 0]
        FillAndPrintInArray.myPrintIntArray(fix23(fix2)); //→ [2, 0, 5]
        FillAndPrintInArray.myPrintIntArray(fix23(fix3)); //→ [1, 2, 1]
        FillAndPrintInArray.myPrintIntArray(fix23(fix4)); //→ [3, 2, 1]
    }

    private static int[] fix23(int[] input) {
        for (int i = 1; i < input.length; i++) {
            if (input[i] == 3 && input[i - 1] == 2) {
                input[i] = 0;
            }
        }
        return input;
    }

    private static boolean no23(int[] input) {
        return input[0] != 2 && input[0] != 3 && input[1] != 2 && input[1] != 3;
    }

    private static int[] middleWay(int[] arr1, int[] arr2) {
        int[] output = new int[2];
        output[0] = arr1[1];
        output[1] = arr2[1];
        return output;
    }
}
