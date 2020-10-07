package day16.hw16;

        /*Исходный алфавит: А Б В Г Д Е Ё Ж З И Й К Л М Н О П Р С Т У Ф Х Ц Ч Ш Щ Ъ Ы Ь Э Ю Я
        Шифрованный:      Г Д Е Ё Ж З И Й К Л М Н О П Р С Т У Ф Х Ц Ч Ш Щ Ъ Ы Ь Э Ю Я А Б В*/

public class HomeWork16Switch {
    public static void main(String[] args) {
        System.out.println(enigmaCaesar("Съешь же ещё этих мягких французских булок, да выпей чаю.")); //
        // -> "Фэзыя йз зьи ахлш пвёнлш чугрщцкфнлш дцосн, жг еютзм ъгб."
    }

    private static String enigmaCaesar(String input) {
        input = input.toLowerCase();
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            output = output + shiftedLetter(input.charAt(i));
        }
        return output;

    }

    private static String shiftedLetter(char inputChar) {
        String codedLetter = "";
        switch (inputChar) {
            case 'а':
                codedLetter = "г";
                break;
            case 'б':
                codedLetter = "д";
                break;
            case 'в':
                codedLetter = "е";
                break;
            case 'г':
                codedLetter = "ё";
                break;
            case 'д':
                codedLetter = "ж";
                break;
            case 'е':
                codedLetter = "з";
                break;
            case 'ё':
                codedLetter = "и";
                break;
            case 'ж':
                codedLetter = "й";
                break;
            case 'з':
                codedLetter = "к";
                break;
            case 'и':
                codedLetter = "л";
                break;
            case 'й':
                codedLetter = "м";
                break;
            case 'к':
                codedLetter = "н";
                break;
            case 'л':
                codedLetter = "о";
                break;
            case 'м':
                codedLetter = "п";
                break;
            case 'н':
                codedLetter = "р";
                break;
            case 'о':
                codedLetter = "с";
                break;
            case 'п':
                codedLetter = "т";
                break;
            case 'р':
                codedLetter = "у";
                break;
            case 'с':
                codedLetter = "ф";
                break;
            case 'т':
                codedLetter = "х";
                break;
            case 'у':
                codedLetter = "ц";
                break;
            case 'ф':
                codedLetter = "ч";
                break;
            case 'х':
                codedLetter = "ш";
                break;
            case 'ц':
                codedLetter = "щ";
                break;
            case 'ч':
                codedLetter = "ъ";
                break;
            case 'ш':
                codedLetter = "ы";
                break;
            case 'щ':
                codedLetter = "ь";
                break;
            case 'ъ':
                codedLetter = "э";
                break;
            case 'ы':
                codedLetter = "ю";
                break;
            case 'ь':
                codedLetter = "я";
                break;
            case 'э':
                codedLetter = "а";
                break;
            case 'ю':
                codedLetter = "б";
                break;
            case 'я':
                codedLetter = "в";
                break;

            default:
                codedLetter = String.valueOf(inputChar);
                break;
        }

        return codedLetter;
    }

}
