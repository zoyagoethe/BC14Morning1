package day03.hw3;

/*
2. Найти длину окружности.
3. Написать формулу вычисления стоимости Евро, если курс Евро к Доллару 1,1.
4. Найти соотношение площади Беларуси к площади Украины.
5. Найти, во сколько раз площадь Москвы больше площади Берлина.
 */
public class HomeWork3 {
    public static void main(String[] args) {
        findCircumference(3.14, 17.5);
        findValueEuro(1.1, 1.0);
        findRatio(207_595, 603_628);
        findRatio2(2_561.5, 891.68);


    }

    private static void findRatio2(double areaMoscow, double areaBerlin) {
        double ratio2 = areaMoscow / areaBerlin;
        System.out.print("Площадь Москвы больше площади Берлина в " + ratio2);
        System.out.println(" раз");


    }

    private static void findRatio(double areaBelarus, double areaUkraine) {
        double ratio = areaBelarus / areaUkraine;
        System.out.println("Соотношение площади Беларуси к площади Украины: " + ratio);

    }

    private static void findValueEuro(double a, double dollar) {
        double euro = dollar * a;
        System.out.print("Стоимость 1 евро: " + euro);
        System.out.println(" доллар");
    }

    private static void findCircumference(final double pi, double radius) {
        double result = 2 * pi * radius;
        System.out.println("Длина окружности радиусом 17.5: " + result);
    }
}
