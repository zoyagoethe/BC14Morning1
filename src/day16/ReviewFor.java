package day16;

public class ReviewFor {
    public static void main(String[] args) {
        // великая буква "я"
        // посчитайте количество великих букв в слове
        String word1 = "Я люблю Ярославль!";
        String word2 = "Я люблю Берлин!";
        String word3 = "Никто не любит тебю!";
        String all = word1 + word2 + word3;
        System.out.println(countYa(word1)); //2
        System.out.println(countYa(word2)); //1
        System.out.println(countYa(word3)); //0
        System.out.println(countYa(all));
    }

    private static int countYa(String original) {
        String input = original.toLowerCase();
        char ya = 'я';
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ya) {
                count++;
            }
        }
        return count;
    }
}
