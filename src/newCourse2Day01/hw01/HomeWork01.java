package newCourse2Day01.hw01;

public class HomeWork01 {


    public static int nod(int a, int b) {
        if (b == 0) {
            return a;
        }
        return nod(b, a % b);
    }

    public static int squareRecursive(int n) {
        if (n == 1) {
            return 1;
        } else {
            return squareRecursive(n - 1) + n + n - 1;
        }
    }

    public static String reverse(String str) {
        char[] output = new char[str.length()];
        for (int i = 0; i < output.length; i++) {
            output[i] = str.charAt(str.length() - 1 - i);
        }
        return new String(output);
    }

    static class HomeWork01Test {
        public static void main(String[] args) {
            System.out.println(nod(338, 4523));
            //System.out.println(squareRecursive(356));
            //System.out.println(reverse("KarabasBarabaS"));
        }
    }
}
