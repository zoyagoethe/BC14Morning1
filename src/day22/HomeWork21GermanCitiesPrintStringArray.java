package day22;

import java.util.Arrays;

public class HomeWork21GermanCitiesPrintStringArray {
    public static void main(String[] args) {
        String[] myCities = new String[]{"Berlin", "München", "Dresden", "Hamburg", "Potsdam"};
        //myStringPrintArrays(myCities);
        //System.out.println(Arrays.toString(myCities));
        //myPrintForI(myCities);
        myColourPrintStringArray(myCities);
    }

    public static void myColourPrintStringArray(String[] arr) {

    }

    private static void myPrintForI(String[] myCities) {
        System.out.print("[");
        for (int i = 0; i < myCities.length - 1; i++) {
            System.out.print(myCities[i] + ", ");
        }
        System.out.print(myCities[myCities.length - 1]);
        System.out.println("]");
    }

    private static void myStringPrintArrays(String[] input) {
        System.out.print("[");
        for (String element : input) {
            System.out.print(element + " ");
        }
        System.out.println("]");
    }
}
