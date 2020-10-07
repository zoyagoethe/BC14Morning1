package day16;

//file 6, task 4

public class MultiplicationTable {
    public static void main(String[] args) {
        createMT(10);
    }

    private static void createMT(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                // System.out.print(myMTformat(i, j));
                //System.out.printf("%4d", i * j);
                String temp = i * j + "   ";
                System.out.print(temp.substring(0, 3));
            }
            System.out.println();
        }
    }

    private static String myMTformat(int i, int j) {
        int result = i * j;
        String output = "";
        if (result < 10) {
            output = "  " + result;
        } else if (result < 100) {
            output = " " + result;
        } else {
            output = String.valueOf(result);
        }
        return output;
    }

}


