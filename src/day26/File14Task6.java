package day26;
/*Returns true if for every '*' (star) in the string,
        if there are chars both immediately before and after the star, they are the same.*/


public class File14Task6 {
    public static void main(String[] args) {
        System.out.println(sameStarChar("xy*yzz")); //→ true
        System.out.println(sameStarChar("xy*zzz"));// → false
        System.out.println(sameStarChar("*xa*az"));// → false
        System.out.println(sameStarChar("xa*az"));// → true
    }

    private static boolean sameStarChar(String str) {
        char star = '*';
        for (int i = 0; i < str.length(); i++) {
            if ((i == 0 || i == str.length() - 1) && str.charAt(i) == star) {
                return false;
            } else if (str.charAt(i) == star && str.charAt(i - 1) != str.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}