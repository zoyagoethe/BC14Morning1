package day26;
        /*Given a string and a non-empty word string, return a string made of each char just before and just after every appearance
        of the word in the string. Ignore cases where there is no char before or after the word, and a char may be included twice if it
        is between two words.*/


public class File14Task21 {
    public static void main(String[] args) {
        System.out.println(wordEnds("abcXY123XYijk", "XY")); //→ "c13i"
        System.out.println(wordEnds("XY123XY", "XY")); //→ "13"
        System.out.println(wordEnds("XY1XY", "XY")); //→ "11"
        //System.out.println(wordEnds("XY1XY", "YX")); //→
        //wordStr - 2 symbols
        //1. Найти место (любое) в стр1, где встречается нащ паттерн.
        //2. Обращаемся к элементам до и элементам после
        //3. Конкатенируем нужные элементы
    }

    private static String wordEnds(String str1, String wordStr) {
        String output = "";
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == wordStr.charAt(0)
                    && str1.charAt(i + 1) == wordStr.charAt(1)) {
                if (i > 0) {
                    output = output + str1.charAt(i - 1);
                }
                if (i < str1.length() - 3) {
                    output = output + str1.charAt(i + 2);
                }
            }
        }
        return output;
    }
}
