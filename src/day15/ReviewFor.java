package day15;

public class ReviewFor {
    public static void main(String[] args) {
        // ,буква я - определить содержание буквы в слове

        System.out.println(checkCyrillicLetterInWord("Василий"));
        System.out.println(checkCyrillicLetterInWord("Семён"));
        System.out.println(checkCyrillicLetterInWord("Яна"));
        System.out.println(checkCyrillicLetterInWord("яблоко"));
    }

    private static boolean checkCyrillicLetterInWord(String word) {
       /* if (word.toLowerCase().contains("я")) {
            return true;*/
        String input = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            if (input.charAt(i) == 'я') {
                return true;

            }
        }
        return false;
    }
}
