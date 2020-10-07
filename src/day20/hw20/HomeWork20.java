package day20.hw20;

/*Дан массив:
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Найти минимальное, среднее, максимальное значения и сумму элементов массива.
        int max;
        int min;
        int middle;
        int sum;*/

public class HomeWork20 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Сумма элементов массива arr: " + getSum(arr));// -> 55
        System.out.println("Максимальный элемент в массиве arr: " + getMax(arr));
        //System.out.println("Минимальный элемент в массиве arr: " + getMin(arr));
        System.out.println("Среднее значение элементов мвссива arr: " + getMiddle(arr));

    }

    private static double getMiddle(int[] input) {
        double middle = 0;
        return middle = (double) getSum(input) / input.length;
    }

    /*private static int getMin(int[] input) {
        int min = Integer.MIN_VALUE;
        int i;
        for (i = 0; i < input.length; i++) {
        }
        return Math.min(min, input[i]);
    }*/

    private static int getMax(int[] input) {
        int max = 0;
        for (int i = 0; i < input.length; i++) {
            max = Math.max(max, input[i]);
        }
        return max;
    }

    public static int getSum(int[] input) {
        int totalSum = 0;
        for (int i = 0; i < input.length; i++) {
            totalSum += input[i];
        }
        return totalSum;
    }
}
