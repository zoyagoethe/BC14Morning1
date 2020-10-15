package day28;

//40-aja minuta

public class SumSumSum {
    public static void main(String[] args) {
        System.out.println(sumSimple(3, 6));
        System.out.println(sumNotSimple(1, 2, 3));
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(sumArray(arr));
        // var args; var arg
        myNewSum();
    }

    private static void myNewSum() {
    }

    private static int sumArray(int[] arr) {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return sum;
    }

    private static int sumNotSimple(int a, int b, int c) {
        return a + b + c;
    }

    private static int sumSimple(int a, int b) {
        return a + b;
    }
}
