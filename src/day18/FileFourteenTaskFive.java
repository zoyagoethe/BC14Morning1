package day18;
        /*Given a string,consider the prefix string made of the first N chars of the string.
        Does that prefix string appear somewhere else in the string?
                Assume that the string is not empty and that N is in the range 1..str.length().*/

public class FileFourteenTaskFive {
    public static void main(String[] args) {
        System.out.println(prefixAgain("abXYabc", 1));// →true
        System.out.println(prefixAgain("abXYabc", 2));// →true
        System.out.println(prefixAgain("abXYabc", 3));// →false
    }

    private static boolean prefixAgain(String str, int n) {
        int length = str.length();
        String prefix = str.substring(0, n);
        for (int i = n; i < length; i++) {
            if (n + i <= length) {
                if (prefix.equals(str.substring(i, n + i))) {
                    return true;
                }
            }
        }
        return false;
    }
}
