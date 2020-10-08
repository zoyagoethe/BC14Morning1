package day23;

public class Converter {
    public static int convertBinaryToDecimal(String binaryNumber) {
        // %10
        // Math.pow() 2
        // /10
        // while
        int decimalResult = 0;
        int power = 0;
        int binary = Integer.parseInt(binaryNumber); //10010001
        while (binary > 0) {
            int remainder = binary % 10;
            decimalResult = (int) (decimalResult + remainder * Math.pow(2, power));
            binary = binary / 10;
            power++;
        }
        return decimalResult;
    }

    public static String convertDecimalToBinary(int numberDecimal) {
        String resultBinary = "";
        int systemKooficient = 2;
        while (numberDecimal > 0) {
            int remainder;
            remainder = numberDecimal % systemKooficient;
            resultBinary = remainder + resultBinary;
            numberDecimal = numberDecimal / systemKooficient;
            // numberDecimal /= 2;
        }
        return resultBinary;
    }
}
