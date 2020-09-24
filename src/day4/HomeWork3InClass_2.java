package day4;

public class HomeWork3InClass_2 {
    public static void main(String[] args) {
        double belarus = 207_595;
        double ukraine = 603_628;
        findRate(belarus, ukraine);
        double moscow = 2511;
        double berlin = 891;
        findRate(moscow, berlin);


    }

    private static void findRate(double s1, double s2) {
        System.out.println("Соотношение площадей : " + s1 / s2);
    }
}
