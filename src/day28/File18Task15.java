package day28;

/*
Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
        start1([1, 2, 3], [1, 3]) → 2
        start1([7, 2, 3], [1]) → 1
        start1([1, 2], []) → 1
*/

public class File18Task15 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{1, 3};
        int[] arr3 = new int[]{7, 2, 3};
        int[] arr4 = new int[]{1};
        int[] arr5 = new int[]{1, 2};
        int[] arr6 = new int[0];
        System.out.println(start1(arr1, arr2));// → 2
        System.out.println(start1(arr3, arr4));// → 1
        System.out.println(start1(arr5, arr6));// → 1
    }

    private static int start1(int[] ar1, int[] ar2) {
        int num = 0;
        if (ar1[0] == 1) {
            num = 1;
        }
        if (ar2.length >= 1) {
            if (ar2[0] == 1) {
                num++;
            }
        }
        return num;
    }
}
