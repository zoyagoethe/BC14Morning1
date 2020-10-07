package day20;

public class MyLovelyDouble {
    public static void main(String[] args) {
        double min = 0.1;
        double max = 0.9;
        //double[] myDoubleArr = createDoubleArray(min, max);
        //myPrintDoubleArray(myDoubleArr);

        // create array double
        // *** print array double
    }

    public static void myPrintDoubleArray(double[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.printf("%.4s", input[i]);
            System.out.printf("%2.3f", input[i]);
            System.out.println();
        }
    }

    private static double[] createDoubleArray(double min, double max) {
        int size = (int) (Math.random() * 5);
        double[] output = new double[size];
        for (int i = 0; i < size; i++) {// mozhno vmesto size output.length
            double myRandomTemp = Math.random() * 1000;
            int temp = (int) myRandomTemp;
            double end = temp;
            end = end/100;
            output[i] = myRandomTemp;
        }
        return output;
    }


}

