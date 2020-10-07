package day20;

// hw17 task13 - сначала с иф решили, потом с тернарным оператором

public class ReviewTernary {
    public static void main(String[] args) {
        System.out.println(myFirstCompareTo("Berlin", "Moscow"));// → "Berlin"
        System.out.println(myFirstCompareTo("Minsk", "Moscow"));// → "Minsk"
        System.out.println(myFirstCompareTo("Kyiv", "Paris"));// → "Kyiv"
        System.out.println(myFirstCompareTo("Могилёв", "Потсдам"));// → "Могилёв"
    }

    private static String myFirstCompareTo(String firstWord, String secondWord) {
        return (firstWord.compareTo(secondWord) < 0) ? firstWord : secondWord;
    }

    private static String myFirstCompareToSecond(String firstWord, String secondWord) {
        if (firstWord.compareTo(secondWord) < 0) {
            return firstWord;
        } else {
            return secondWord;
        }
    }
}
