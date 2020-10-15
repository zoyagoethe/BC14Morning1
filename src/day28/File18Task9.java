package day28;

        /*18.9. We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true if the given array contains an unlucky
        1 in the first 2 or last 2 positions in the array.
        unlucky1([1, 3, 4, 5]) → true
        unlucky1([2, 1, 3, 4, 5]) → true
        unlucky1([1, 1, 1]) → false*/

public class File18Task9 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 3, 4, 5};
        int[] arr2 = new int[]{2, 1, 3, 4, 5};
        int[] arr3 = new int[]{1, 1, 1};
        System.out.println(unlucky1(arr1));// → true
        System.out.println(unlucky1(arr2));// → true
        System.out.println(unlucky1(arr3));// → false
    }

    private static boolean unlucky1(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 1 && arr[i + 1] == 3) {
                return true;
            }
        }
        return false;
    }
}
