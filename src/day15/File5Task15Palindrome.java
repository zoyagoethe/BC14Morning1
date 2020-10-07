package day15;

/*Написать свой метод проверки строки на палиндром. Учесть, что палиндром может быть предложением с пробелами.
  При решении задачи используйте цикл. Нельзя использовать методы replace(), reverse() и конструкции,
  которые вы не учили.
        checkPalindrom( "А роза упала на лапу Азора") -> true
        checkPalindrom( "поп") -> true
        checkPalindrom( "школа") -> false*/

public class File5Task15Palindrome {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("А роза упала на лапу Азора"));
        System.out.println(checkPalindrome("поп"));
        System.out.println(checkPalindrome("школа"));
    }

    private static boolean checkPalindrome(String str) {
        String input = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                input += str.charAt(i);
            }
        }
        input = input.toLowerCase();
        String strReverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            strReverse += input.charAt(i);
        }
        for (int i = 0; i < input.length(); i++) {
            if (strReverse.charAt(i) != input.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
