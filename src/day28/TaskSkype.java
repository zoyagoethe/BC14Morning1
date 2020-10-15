package day28;

/*Данны два массива. Сложите их.
        a)  sumOne([1,2,3],[4,5,6])  -> [1,2,3,4,5,6]
        a)  sumOne([1,2,3,4],[5,6]) ->[1,2,3,4,5,6]
        Данны два массива. Сложите их.
b)  sumTwo([1,2,3],[4,5,6])  -> [5,7,9]
b)  sumTwo([1,2,3,4],[5,6])  -> [6,8,3,4]*/

import day20.FillAndPrintInArray;

public class TaskSkype {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{4, 5, 6};
        int[] arr3 = new int[]{1, 2, 3, 4};
        int[] arr4 = new int[]{5, 6};
        int[] arr5 = new int[]{8, 9, 0, 5, 6};
        //FillAndPrintInArray.myPrintIntArray(sumOne(arr1, arr2));//  -> [1,2,3,4,5,6]
        //FillAndPrintInArray.myPrintIntArray(sumOne(arr3, arr4));// ->[1,2,3,4,5,6]
        //FillAndPrintInArray.myPrintIntArray(sumOne(arr3, arr5));// ->[]
        FillAndPrintInArray.myPrintIntArray(sumTwo(arr1, arr2));//  -> [5, 7, 9]
        FillAndPrintInArray.myPrintIntArray(sumTwo(arr3, arr4)); // -> [6, 8, 3, 4]
    }

    private static int[] sumTwo(int[] ar1, int[] ar2) {
        int[] output = new int[ar1.length];
        if (ar1.length >= ar2.length) {
            for (int i = 0; i < ar2.length; i++) {
                output[i] = ar1[i] + ar2[i];
            }
            for (int i = ar2.length; i < ar1.length; i++) {
                output[i] = ar1[i];
            }
        }
        return output;
    }

    private static int[] sumOne(int[] ar1, int[] ar2) {
        int[] output = new int[ar1.length + ar2.length];
        for (int i = 0; i < ar1.length; i++) {
            output[i] = ar1[i];
        }
        for (int i = 0; i < ar2.length; i++) {
            output[ar1.length + i] = ar2[i];
        }
        return output;
    }
}
