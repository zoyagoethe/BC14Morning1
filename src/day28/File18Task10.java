package day28;
        /*18.10. Given an array of ints, return true if the array is length 1 or more,
        and the first element and the last element are equal.
        sameFirstLast([1, 2, 3]) → false
        sameFirstLast([1, 2, 3, 1]) → true
        sameFirstLast([1, 2, 1]) → true*/

public class File18Task10 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{1, 2, 3, 1};
        int[] arr3 = new int[]{1, 2, 1};
        System.out.println(sameFirstLast(arr1));// → false
        System.out.println(sameFirstLast(arr2));// → true
        System.out.println(sameFirstLast(arr3));// → true
    }

    private static boolean sameFirstLast(int[] arr) {
        return (arr[0] == arr[arr.length - 1] && arr.length >= 1);
    }
}
