package day16.hw16;

/*Разработайте шифровальную машину для нового клиента фирмы - Гая Юлия Цезаря.
Клиент придумал шифровальный алгоритм и хочет, что бы мы реализовали его в методе.
Пример выполнения метода:

enigmaCaesar("Съешь же ещё этих мягких французских булок, да выпей чаю.") ->
-> "Фэзыя йз зьи ахлш пвёнлш чугрщцкфнлш дцосн, жг еютзм ъгб."

    y = ( x + k )   mod   n
    x = ( y − k )   mod   n

где x — символ открытого текста, y — символ шифрованного текста, n — мощность алфавита, а k — ключ.

/*Исходный алфавит: А Б В Г Д Е Ё Ж З И Й К Л М Н О П Р С Т У Ф Х Ц Ч Ш Щ Ъ Ы Ь Э Ю Я
  Шифрованный:      Г Д Е Ё Ж З И Й К Л М Н О П Р С Т У Ф Х Ц Ч Ш Щ Ъ Ы Ь Э Ю Я А Б В*/

public class HomeWork16 {
    public static void main(String[] args) {
        System.out.println(enigmaCaesar("Съешь же ещё этих мягких французских булок, да выпей чаю.")); //
        // -> "Фэзыя йз зьи ахлш пвёнлш чугрщцкфнлш дцосн, жг еютзм ъгб."
    }
//собсно кодирование
    private static String enigmaCaesar(String str1) {
        //int result = str1.codePointAt(1);
        //System.out.println(result);
        String str2 = "";
        for (int i = 0; i < str1.length(); i++) {
            str2 = str2 + shiftedLetter(str1.charAt(i));
        }
        return str2;
    }
//сдвиг
    private static char shiftedLetter(char c) {
        char output = 0;
        int k = 3;
        output = (char) (c + 3);
        return output;
    }
//проверка символа на буквенность
    private static boolean checkLetter(char c) {
        return true;
    }

}
