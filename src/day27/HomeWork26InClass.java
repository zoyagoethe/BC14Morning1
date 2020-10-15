package day27;

public class HomeWork26InClass {
    public static void main(String[] args) {
        System.out.println(endOther("Hiabc", "abc"));// → true
        System.out.println(endOther("AbC", "HiaBc"));// → true
        System.out.println(endOther("abc", "abXabc"));// → true
        System.out.println(endOther("abc", "abXabz"));// → false
    }

    private static boolean endOther(String str1, String str2) {
        return str1.toLowerCase().endsWith(str2.toLowerCase())
                || str2.toLowerCase().endsWith(str1.toLowerCase());
    }
}
