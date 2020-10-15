package day28;

/*      Given a string and a non-empty word string,
        return a version of the original String where all chars have been replaced by pluses ("+"),
        except for appearances of the word string which are preserved unchanged.
        plusOut("12xy34", "xy") → "++xy++"
        plusOut("12xy34", "1") → "1+++++"
        plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy" */

public class HomeWork27InClass {
    public static void main(String[] args) {
        System.out.println(plusOut("12xy34", "xy")); //→ "++xy++"
        System.out.println(plusOut("12xy34", "1")); //→ "1+++++"
        System.out.println(plusOut("12xy34xyabcxy", "xy")); //→ "++xy++xy+++xy"
    }

    private static String plusOut(String inputString, String secondStr) {
        String plus = "+";
        String output = "";
       /* int size = secondStr.length();  // андрей не смог решить задачу
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == secondStr.charAt(0)) {
                //то тогда мы не меняем на плюсы,
                // пока длина сторого стринга не закончится
                for (int j = 0; j < size; j++) {
                    output = output + secondStr.charAt(j);
                    i = i + 1;
                }
            } else {
                output = output + plus;
            }

        }*/
        return output;
    }
}
