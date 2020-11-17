package newCourseDay9.Arrays;

/*We'll say that a "mirror" section in an array is a group of contiguous elements
such that somewhere in the array, the same group appears in reverse order.
For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part).
Return the size of the largest mirror section found in the given array.
        maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
        maxMirror([1, 2, 1, 4]) → 3
        maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2
Äduard: Мы скажем, что «зеркальная» секция в массиве - это группа смежных элементов,
так что где-то в массиве одинаковые
группа отображается в обратном порядке.
Например, наибольшая часть зеркала в {1, 2, 3, 8, 9, 3, 2, 1} имеет длину 3 (часть {1, 2, 3}).
Возвращает размер самой большой зеркальной секции, найденной в данном массиве.

Äduard:
// System.out.print("i = " + i  + ", arr[j] = " + arr[j] + ", shiftIndex = " + shiftIndex + ", arr[i + shiftIndex] = " + arr[i + shiftIndex]);

*/

public class File20Task6 {
    public static void main(String[] args) {
        System.out.println(maxMirror(1, 2, 3, 8, 9, 3, 2, 1));// → 3
        System.out.println(maxMirror(1, 2, 1, 4));// → 3
        System.out.println(maxMirror(7, 1, 2, 9, 7, 2, 1));// → 2
    }

    private static int maxMirror(int... args) {
        int[] reverse = makeArrayReverse(args);
        int maxSpan = 0;
        int span;
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < reverse.length; j++) {
                span = 0;
                if (args[i] == reverse[j]) {
                    int kSize = Math.min(args.length - i, reverse.length - j);
                    for (int k = 0; k < kSize; k++) {
                        if (args[i + k] == reverse[j + k]) {
                            span++;
                        } else break;
                    }
                }
                maxSpan = Math.max(span, maxSpan);
            }

        }
        return maxSpan;
    }

    private static int[] makeArrayReverse(int[] args) {
        int size = args.length;
        int[] output = new int[size];
        for (int i = 0; i < size; i++) {
            output[i] = args[size - i - 1];
        }
        return output;
    }
}
