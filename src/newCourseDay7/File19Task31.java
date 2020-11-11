package newCourseDay7;
/*Given start and end numbers,
return a new array containing the sequence of integers from start up to but not including end,
so start=5 and end=10 yields {5, 6, 7, 8, 9}.
The end number will be greater or equal to the start number.
Note that a length-0 array is valid. (See also: FizzBuzz Code)
        fizzArray3(5, 10) → [5, 6, 7, 8, 9]
        fizzArray3(11, 18) → [11, 12, 13, 14, 15, 16, 17]
        fizzArray3(1, 3) → [1, 2]*/

public class File19Task31 {
    public static void main(String[] args) {
        print(fizzArray3(5, 10)); //→ [5, 6, 7, 8, 9]
        print(fizzArray3(11, 18)); //→ [11, 12, 13, 14, 15, 16, 17]
        print(fizzArray3(1, 3)); //→ [1, 2]
        print(fizzArray3(1, 1)); //→ []
        print(fizzArray3(1, 2)); //→ [1]
    }

    private static int[] fizzArray3(int a, int b) {
        int[] output = new int[b - a];
        for (int i = 0; i < output.length; i++) {
            output[i] = a + i;
        }
        return output;
    }

    public static void print(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
