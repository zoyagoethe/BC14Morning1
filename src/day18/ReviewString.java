package day18;

public class ReviewString {
    public static void main(String[] args) {
        firstReview();
    }

    private static void firstReview() {
        String hm = "Vasilisa";
        System.out.println(hm.indexOf('a'));
        System.out.println(hm.codePointAt(6));
        System.out.println('a' + 0);
        System.out.println(hm.indexOf(97));
    }
}
