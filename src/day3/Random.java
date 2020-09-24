package day3;

public class Random {
    public static void main(String[] args) {
        // генерирует числа между 0 и 1
        double myRandom = Math.random();
        System.out.println(myRandom);

        double newResult = myRandom * 100;
        System.out.println(newResult);

        int result = (int) newResult; // отсечь дробную часть
        System.out.println(result);

        int min = 30;
        int max = 100;
        int myDigit = (int) (Math.random() * (max - min) + 1) + min; // генерирует случайнйе числа от 30 до 100
        System.out.println(myDigit);

    }
}
