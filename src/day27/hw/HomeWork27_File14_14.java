package day27.hw;

/*      Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"),
        except for appearances of the word string which are preserved unchanged.
        plusOut("12xy34", "xy") → "++xy++"
        plusOut("12xy34", "1") → "1+++++"
        plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy" */

public class HomeWork27_File14_14 {
    public static void main(String[] args) {
        System.out.println(plusOut("12xy34", "xy")); //→ "++xy++"
        System.out.println(plusOut("12xy34", "1")); //→ "1+++++"
        System.out.println(plusOut("12xy34xyabcxy", "xy")); //→ "++xy++xy+++xy"
    }

    private static String plusOut(String str, String word) {
        String output = "";
        String plus = "+";
        for (int i = 0; i < str.length(); i++) {
            String remainder = str.substring(i);
            if (remainder.startsWith(word)) {
                output = output + word;
                i = i + word.length() - 1;
            } else {
                output = output + plus;
            }
        }
        return output;
    }
}
