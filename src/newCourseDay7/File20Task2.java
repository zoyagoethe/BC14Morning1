package newCourseDay7;
/*Given a non-empty array,
return true if there is a place to split the array so that the sum of the numbers on one side is equal
to the sum of the numbers on the other side.
        canBalance([1, 1, 1, 2, 1]) → true
        canBalance([2, 1, 1, 2, 1]) → false
        canBalance([10, 10]) → true*/

public class File20Task2 {
    public static void main(String[] args) {
        System.out.println(canBalance(1, 1, 1, 2, 1));// → true
        System.out.println(canBalance(2, 1, 1, 2, 1));// → false
        System.out.println(canBalance(10, 10));// → true
        System.out.println(canBalance(0, 0, 1));// → false
        System.out.println(canBalance(0, 0, 0));// → true
    }

    private static boolean canBalance(int... args) {
        int sum = 0;
        for (int element : args) {
            sum += element;
        }
        if (sum % 2 != 0) return false;
        int temp = 0;
        for (int i = 0; i < args.length; i++) {
            if (temp < sum / 2) {
                temp += args[i];
            } else {
                break;
            }
        }
        return temp == sum / 2;
    }
}
