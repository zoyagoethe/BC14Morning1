package day13.HomeWork13PasswordGenerator;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(yearLeap(2020));
        System.out.println(yearLeap(2021));
        System.out.println(yearLeap(2000));
        System.out.println(yearLeap(1900));
        //triangle(6);
    }

    private static void triangle(int inputRazmer) {
        String rez = "";
        String str = "";
        int kolSymbol = 1;
        for (int i = 1; i <= inputRazmer; i++) {
            String inputStr = str.substring(str.length() - (inputRazmer - i));
            for (int j = 1; j <= kolSymbol; j++) {
                inputStr += i;
                //System.out.println("str "+inputStr);
                rez = inputStr;

            }
            kolSymbol += 2;
            System.out.println(rez);
        }
    }

    private static boolean yearLeap(int year) {
        if (year % 4 != 0 || year % 400 != 0 && year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }

    private static boolean yearLeap1(int year) {
        if (year % 4 == 0 || year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return false;
        }
    }
}
