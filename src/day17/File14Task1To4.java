package day17;

/*Given a string, return a string where for every char in the original, there are two chars.
        doubleChar("The") → "TThhee"
        doubleChar("AAbb") → "AAAAbbbb"
        doubleChar("Hi-There") → "HHii--TThheerree"

        Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for
the 'd', so "cope" and "cooe" count.
countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2

3. Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
bobThere("abcbob") → true
bobThere("b9b") → true
bobThere("bac") → false

4. Given a string and an int n, return a string made of n repetitions of the last n characters of the string. You may assume that
n is between 0 and the length of the string, inclusive.
repeatEnd("Hello", 3) → "llollollo"
repeatEnd("Hello", 2) → "lolo"
repeatEnd("Hello", 1) → "o"
*/

public class File14Task1To4 {
    public static void main(String[] args) {
        //System.out.println(doubleChar("The"));// → "TThhee"
        //System.out.println(doubleChar("AAbb"));// → "AAAAbbbb"
        //System.out.println(doubleChar("Hi-There"));// → "HHii--TThheerree"
        //System.out.println(countCode("aaacodebbb")); //→1
        //System.out.println(countCode("codexxcode"));// →2
        //System.out.println(countCode("cozexxcope")); //→2
        //System.out.println(bobThere("abcbob")); //→ true
        //System.out.println(bobThere("b9b"));// → true
        //System.out.println(bobThere("bac"));// → false
        System.out.println(repeatEnd("Hello", 3));// → "llollollo"
        System.out.println(repeatEnd("Hello", 2));// → "lolo"
        System.out.println(repeatEnd("Hello", 1));// → "o"
    }

    private static String repeatEnd(String input, int n) {
        String output = "";
        for (int i = 0; i < n; i++) {
            output += input.substring(input.length() - n);

        }
        return output;

    }

    private static boolean bobThere(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'b' && input.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }

    private static int countCode(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'c' && input.charAt(i + 1) == 'o' && input.charAt(i + 3) == 'e') {
                count++;
            }

        }
        return count;
    }

    private static String doubleChar(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            output = output + input.charAt(i) + input.charAt(i);
        }
        return output;
    }

}
