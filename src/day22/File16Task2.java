package day22;

/*Task 2:
У нас есть очередь из кроликов и мы получаем количество стоящих в этой очереди кроликов.
У нечётных кроликов по два уха. А у чётных кроликов вроде как по три уха.
Это из-за того, что они все подняли ногу. Посчитайте количество видимых нами "ушей".
Не использовать циклы или умножение.
*/
public class File16Task2 {
    public static void main(String[] args) {
        System.out.println(bunnyEars2(0));// → 0
        System.out.println(bunnyEars2(1));// → 2
        System.out.println(bunnyEars2(2));// → 5
        System.out.println(bunnyEars2(10));// → 25
        System.out.println(bunnyEars2(11));// → 27
    }

    private static int bunnyEars2(int rabbit) {
        if (rabbit == 0) {
            return 0;
        } else if (rabbit == 1) {
            return 2;
        /*} else if (rabbit == 2) {
            return 5;*/
        } else {
            return 5 + bunnyEars2(rabbit - 2);
        }
    }
}
