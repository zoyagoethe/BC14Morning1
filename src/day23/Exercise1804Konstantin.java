package day23;

import static day06.hw6.HomeWork06.split;

public class Exercise1804Konstantin {
    public static void main(String[] args) {
/*        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{2, 5};
        middleWay(arr1, arr2); //→ [2, 5]
        myPrintIntArray(middleWay(arr1, arr2));
        int[] arr3 = new int[]{7, 7, 7};
        int[] arr4 = new int[]{3, 8, 0};
        middleWay(arr3, arr4); //→ [7, 8]
        myPrintIntArray(middleWay(arr3, arr4));
        int[] arr5 = new int[]{5, 2, 9};
        int[] arr6 = new int[]{1, 4, 5};
        middleWay(arr5, arr6); //→ [2, 4]
        myPrintIntArray(middleWay(arr5, arr6));*/
        split();
        int[] arr7 = new int[]{4, 5};
        System.out.println(no23(arr7)); //true
        int[] arr8 = new int[]{4, 2};
        System.out.println(no23(arr8)); //false
        int[] arr9 = new int[]{3, 5};
        System.out.println(no23(arr9)); //false
        split();
        int[] fix1 = new int[]{1, 2, 3};
        int[] fix2 = new int[]{2, 3, 5};
        int[] fix3 = new int[]{1, 2, 1};
        int[] fix4 = new int[]{3, 2, 1};
        myPrintIntArray(fix23(fix1)); //→ [1, 2, 0]
        myPrintIntArray(fix23(fix2)); //→ [2, 0, 5]
        myPrintIntArray(fix23(fix3)); //→ [1, 2, 1]
        myPrintIntArray(fix23(fix4)); //→ [3, 2, 1]
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
        if (input[0] == 2 || input[1] == 3 || input[0] == 3 || input[1] == 2) {
            return false;
        }
        return true;
        // return input[0] != 2 && input[1] != 3 && input[0] != 3 && input[1] != 2;
    }

    private static void myPrintIntArray(int[] input) {
        for (int element : input) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static int[] middleWay(int[] arr1, int[] arr2) {
        int[] output = new int[2];
        output[0] = arr1[1];
        output[1] = arr2[1];
        return output;
    }
}
