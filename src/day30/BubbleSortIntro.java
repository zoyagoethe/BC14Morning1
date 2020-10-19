package day30;

import day20.FillAndPrintInArray;

public class BubbleSortIntro {
    public static void main(String[] args) {
        int[] array = new int[]{100, 45, 1, 38, 56, 75};
        //цикл:
        // 100, 45
        // 45, 100, 1, 38...
        // 45, 1, 100, 38...
        // 45, 1, 38, 100, 56...
        // 45, 1, 38, 56, 100, 75
        // 45, 1, 38, 56, 75, 100
        FillAndPrintInArray.myPrintIntArray(array);
        //bubbleSortRecursion(array);
        bubbleSort(array);
        FillAndPrintInArray.myPrintIntArray(array);

    }

    private static void bubbleSort(int[] array) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    unsorted = true;
                }

            }
        }
    }

    private static void bubbleSortRecursion(int[] arrUnsort) {
        int count = 0;
        //boolean swap = false;
        /*int[] output = new int[arrUnsort.length];
        for (int i = 0; i < arrUnsort.length; i++) {
            if (arrUnsort[i] > arrUnsort[i + 1]) {
                int temp = arrUnsort[i];
                arrUnsort[i] = arrUnsort[i + 1];
                arrUnsort[i + 1] = temp;
            }
        }
*/
        for (int i = 0; i < arrUnsort.length - 1; i++) {
            if (arrUnsort[i] > arrUnsort[i + 1]) {
                int temp = arrUnsort[i];
                arrUnsort[i] = arrUnsort[i + 1];
                arrUnsort[i + 1] = temp;
                count++;
                //swap = true;
            }
            /*if (count > 0) {
                bubbleSort(arrUnsort);*/
            //здесь проверка каждый раз???????
        }
        if (count > 0) {
            bubbleSortRecursion(arrUnsort);
            //здесь проверка один раз после прохода цикла
        }

    }
}
