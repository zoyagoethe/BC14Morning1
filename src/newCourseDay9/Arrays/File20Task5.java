package newCourseDay9.Arrays;

/*Given two arrays of ints sorted in increasing order,
outer and inner, return true if all of the numbers in inner appear in outer.
The best solution makes only a single "linear" pass of both arrays,
taking advantage of the fact that both arrays are already in sorted order.
        linearIn([1, 2, 4, 6], [2, 4]) → true
        linearIn([1, 2, 4, 6], [2, 3, 4]) → false
        linearIn([1, 2, 4, 4, 6], [2, 4]) → true*/

public class File20Task5 {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 4, 6};
        int[] a2 = {2, 4};
        int[] b1 = {1, 2, 4, 6};
        int[] b2 = {2, 3, 4};
        int[] c1 = {1, 2, 4, 4, 6};
        int[] c2 = {2, 4};
        int[] d1 = {1, 3, 5, 7, 9, 11};
        int[] d2 = {5, 7, 8, 11};
        System.out.println(linearIn(a1, a2));// → true
        System.out.println(linearIn(b1, b2));// → false
        System.out.println(linearIn(c1, c2));// → true
        System.out.println(linearIn(d1, d2));// → false
    }

    private static boolean linearIn(int[] a, int[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (count == b.length) {
                break;
            }
            if (a[i] == b[0]) {
                count = 1;
                for (int j = 1; j < b.length; j++) {
                    if (b[j] == a[i + j]) {
                        count++;
                    }
                }
            }
        }
        return count == b.length;
    }
}
