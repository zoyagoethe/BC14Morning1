package day17;

public class Caesar {
    public static void main(String[] args) {
        System.out.println(enigmaCaesar("Съешь же ещё этих мягких французских булок, да выпей чаю."));// ->
//-> "Фэзыя йз зьи ахлш пвёнлш чугрщцкфнлш дцосн, жг еютзм ъгб."

    }

    // perevodit string v string
    private static String enigmaCaesar(String input) {
        input = input.toLowerCase();
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            output += getMeLetter(input.charAt(i));
        }

        return output;
    }

    private static char getMeLetter(char inputChar) {
        char result = 0;
        String inputString = " .,абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        String outputString = " .,гдеёжзийклмнопрстуфхцчшщъыьэюяабв";
        int index = inputString.indexOf(inputChar);
        result = outputString.charAt(index);

        return result;
    }

    //menjaet bukvy
    private static char getMeLetterSimple(char inputChar) {
        char output = 0;
        switch (inputChar) {
            case 'а':
                output = 'г';
                break;
        }
        return output;
    }
}
