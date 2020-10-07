package day22;

/*
Дано положительное целочисленное N. Верните количество семёрок в числе. 717 - вернёт 2. 
Обратите внимание, что модуло 10 даёт вам правую цифру(126 % 10 равно 6), 
а деление на 10 удалит правую цифру(126 / 10 равно 12). 
Авторы задачи были к нам слишком добры и практически решили её прямов условии
*/
public class File16Task3 {
    public static void main(String[] args) {
        System.out.println(count7(717));// → 2
        System.out.println(count7(7));// → 1
        System.out.println(count7(123));// → 0
        System.out.println(count7(1727377));// → 4
        System.out.println(count7(0));// → 0
    }

    private static int count7(int number) {
        if (number == 0) {
            return 0;
        } else if (number % 10 == 7) {
            return 1 + count7(number / 10);
        } else {
            return count7(number / 10);
        }
    }
}
