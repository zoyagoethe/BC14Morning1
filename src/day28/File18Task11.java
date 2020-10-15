package day28;

      /*  18.11. Given an array of ints length 3, return the sum of all the elements.
        sum3([1, 2, 3]) → 6
        sum3([5, 11, 2]) → 18
        sum3([7, 0, 0]) → 7*/

public class File18Task11 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{5, 11, 2};
        int[] arr3 = new int[]{7, 0, 0};
        System.out.println(sum3(arr1));// → 6
        System.out.println(sum3(arr2));// → 18
        System.out.println(sum3(arr3));// → 7
    }

    private static int sum3(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        return sum;
    }
}
