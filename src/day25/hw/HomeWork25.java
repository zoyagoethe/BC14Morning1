package day25.hw;
        /*charAt(int index)
        codePointAt(int index)
        codePointBefore(int index)
        codePointCount(int beginIndex, int endIndex)
        compareToIgnoreCase(String str)
        concat(String str)
        contains(CharSequence s)
        endsWith(String suffix)
        equals(Object anObject)
        equalsIgnoreCase(String anotherString)
        indexOf(int ch)
        isEmpty()
        length()
        replace(char oldChar, char newChar)
        startsWith(String prefix)
        substring(int beginIndex)
        toCharArray()
        toLowerCase()
        toUpperCase()
        trim()*/

import static day06.hw6.HomeWork06.split;

public class HomeWork25 {
    public static void main(String[] args) {
        split();
        String str1 = "Es kann vorkommen, dass die Nachkommen mit ihrem Einkommen nicht auskommen und dann vollkommen verkommen umkommen.";
        System.out.println("метод charAt - строка, начиная с 50-ого символа: " + str1.charAt(50));
        //вывод исходной строки, начиная с заданного символа
        split();
        System.out.println("codePointAt от 50-ти / Unicode 50-го символа, то есть 'E' = " + str1.codePointAt(50));
        //codePointAt даёт Unicode символа под заданным порядковым номером в исходной строке.
        split();
        System.out.println("codePointBefore от 50-ти / Unicode предыдущего символа ' '= " + str1.codePointBefore(50));
        //codePointBefore это как codePointAt, только i-1. В данном случае - это пробел - 1086.
        split();
        System.out.println("Количество символов от 12-ого до 50-ого: " + str1.codePointCount(12, 50));
        //codePointCount(int start, int end) - считает количество символов в заданной строке от int start до int end (не включая)
        split();
        String str2 = "Test test test test";
        String str3 = "Test Test Test Test ";
        String str25 = "Test Test Test Test";
        System.out.println(str2.compareToIgnoreCase(str3));
        System.out.println(str2.compareToIgnoreCase(str25));
        //compareToIgnoreCase сравнивает лексикогравически две строки (Unicode), игнорируя регистр.
        //При полном совпадении выдает 0, при несовпадении - -1.
        split();
        String str35 = "Das macht mir nichts aus.";
        System.out.println(str1.concat(str35));
        //concat - это конкатинация двух строк = str1 + str2.
        split();
        System.out.println(str1.contains("Nachkommen"));// -> true
        System.out.println(str1.contains("Feiertag"));// -> false
        //contains ищет строку с строке и выдает true или false.
        split();
        System.out.println(str1.endsWith("umkommen."));//-> true
        System.out.println(str1.endsWith("vorkommen"));//->false
        //endsWith - проверяет окончание строки на заданное строковое значение. Если совпадает, выдает true, если нет - false.
        split();
        String str45 = "Test Test Test Test";
        System.out.println(str1.equals(str2));//->false
        System.out.println(str3.equals(str25));//->false
        System.out.println(str25.equals(str45));//->true
        //equals - сравнивает строки и выдает false или true
        split();
        String str11 = "SeIfEnBlAsE";
        String str12 = "Seifenblase";
        System.out.println(str11.equalsIgnoreCase(str12));//-> true
        //equalsIgnoreCase() - сравнивает строки игнорируя регистр; выдает false, true
        split();
        System.out.println(str1.indexOf('v'));//-> 8
        System.out.println(str2.indexOf('v'));//-> -1
        //Выдает порядковый номер символа (charAt наоборот) - ТОЛЬКО ПЕРВОЕ ВХОЖДЕНИЕ! Если символа нет, выдаёт -1.
        split();
        String str15 = "";
        String str16 = " ";
        System.out.println(str1.isEmpty());//-> false
        System.out.println(str15.isEmpty());//-> true
        System.out.println(str16.isEmpty());//-> false
        //isEmpty() проверяет, пустая ли строка; выдает true или false.
        split();
        System.out.println(str1.length());
        //length() выдает количество символов в строке
        split();
        String str46 = str1.replace('o', 'A');
        System.out.println(str46);
        //replace() - замена символов на другие символы (заменяет все символы).
        split();
        System.out.println(str1.startsWith("Es"));//-> true
        System.out.println(str1.startsWith("Das"));//-> false
        System.out.println(str1.startsWith("Das", 4));//-> false
        System.out.println(str1.startsWith("kann", 3));//-> true
        //startsWith() - начинается ли строка (если без i1, то проверит с начала)
        //startsWith(String prefix, int toffset) - tests if the substring of this string beginning at the specified index starts with the specified prefix.
       /* public boolean startsWith(String prefix,
        int toffset)
        Tests if the substring of this string beginning at the specified index starts with the specified prefix.
                Parameters:
        prefix - the prefix.
                toffset - where to begin looking in this string.
                Returns:
        true if the character sequence represented by the argument is a prefix of the substring of this object starting at index toffset; false otherwise. The result is false if toffset is negative or greater than the length of this String object; otherwise the result is the same as the result of the expression
        this.substring(toffset).startsWith(prefix)*/
        split();
        System.out.println(str1.substring(0, 17));
        //substring(i1, i2) - выведет подстроку с i1 по i2, не включая i2
        split();
        char[] output = str1.toCharArray();
        for (int i = 0; i < output.length; i++)
            System.out.println("positionInArray [" + i + "]: " + output[i]);
        //toCharArray() - делает из строки массив чаров.
        split();
        System.out.println(str1.toLowerCase());
        //toLowerCase() - всю строку в строчные буквы
        split();
        System.out.println(str1.toUpperCase());
        //toUpperCase() - всю строку в заглавные буквы
        split();
        String str20 = " Das kann doch nicht so schlimm sein! ";
        String str21 = " Das kann doch nicht so schlimm sein! ";
        System.out.println(str20.trim());
        System.out.println(str21);
        //trim() - удаляет пробелы в начале и конце строки.
    }
}
