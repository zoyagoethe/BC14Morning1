package day28;

/*5. Given an array of ints, return true if it contains no 1's or it contains no 4's.
        no14([1, 2, 3]) → true
        no14([1, 2, 3, 4]) → false
        no14([2, 3, 4]) → true*/

public class File19Task5 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{1, 2, 3, 4};
        int[] arr3 = new int[]{2, 3, 4};
        System.out.println(no14(arr1));// → true
        System.out.println(no14(arr2));// → false
        System.out.println(no14(arr3));// → true
    }

    private static boolean no14(int[] arr) {
        int countOne = 0;
        int countFour = 0;
        //boolean isOne = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                countOne++;
            }
            if (arr[i] == 4) {
                countFour++;
            }
        }
        return (countOne == 0 || countFour == 0);
    }
}
