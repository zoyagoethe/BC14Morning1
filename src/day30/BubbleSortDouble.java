package day30;


import java.util.Arrays;

public class BubbleSortDouble {
    public static void main(String[] args) {
        double[] myLovelyDoubleArray = new double[]{3.14, 6.18, 18.0, 1.0, 0.5, 100.0};
        System.out.println(Arrays.toString(myLovelyDoubleArray));
        double[] newArray = copyArray(myLovelyDoubleArray);
        bubbleSortDouble(newArray);
        System.out.println(Arrays.toString(newArray));
    }

    private static void bubbleSortDouble(double[] inputArrUnsort) {
        int count = 0;
        for (int i = 0; i < inputArrUnsort.length - 1; i++) {
            if (inputArrUnsort[i] <= inputArrUnsort[i + 1]) {
                continue;
            }
            double temp = inputArrUnsort[i];
            inputArrUnsort[i] = inputArrUnsort[i + 1];
            inputArrUnsort[i + 1] = temp;
            count++;
        }
        if (count > 0) {
            bubbleSortDouble(inputArrUnsort);
        }
    }

    private static double[] copyArray(double[] input) {
        double[] output = new double[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = input[i];
        }
        return output;
    }
}
