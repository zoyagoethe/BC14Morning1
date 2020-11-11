package newCourseDay7;

/*This is slightly more difficult version of the famous FizzBuzz problem which is sometimes given as a first problem
for job interviews. (See also: FizzBuzz Code.) Consider the series of numbers beginning at start and running up
to but not including end, so for example start=1 and end=5 gives the series 1, 2, 3, 4.
Return a new String[] array containing the string form of these numbers,
except for multiples of 3, use "Fizz" instead of the number, for multiples of 5 use "Buzz", and for multiples of
both 3 and 5 use "FizzBuzz". In Java, String.valueOf(xxx) will make the String form of an int or other type.
This version is a little more complicated than the usual version since you have to allocate
and index into an array instead of just printing, and we vary the start/end instead of just always doing 1..100.
//02-12---Это немного более сложная версия известной проблемы FizzBuzz,
// которую иногда называют первой проблемой для собеседований. (См. Также: Код FizzBuzz.)
// Рассмотрим последовательность чисел, начинающуюся с начала и продолжающуюся до,
// но не включающую конец, поэтому, например, start = 1 и end = 5 дают серии 1, 2, 3, 4.
// Возвращаем новую строку [] массив, содержащий строковую форму этих чисел,
// за исключением кратных 3, используйте «Fizz» вместо числа, для кратных 5 используйте «Buzz»,
// а для кратных 3 и 5 используйте «FizzBuzz». В Java String.valueOf (xxx)
// сделает строковую форму типа int или другого типа. Эта версия немного сложнее, чем обычная версия,
// так как вам нужно выделять и индексировать массив,
// а не просто печатать, и мы меняем начало / конец вместо того, чтобы всегда делать 1..100.
        fizzBuzz(1, 6) → ["1", "2", "Fizz", "4", "Buzz"]
        fizzBuzz(1, 8) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
        fizzBuzz(1, 11) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]*/

public class File19Task12 {
    public static void main(String[] args) {
        print(fizzBuzz(1, 6)); // → ["1", "2", "Fizz", "4", "Buzz"]
        print(fizzBuzz(1, 8)); // → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
        print(fizzBuzz(1, 11)); // → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]
    }

    public static void print(String[] arr) {
        for (String element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static String[] fizzBuzz(int a, int b) {
        String[] output = new String[b - a];
        int[] arr = new int[b - a];
        for (int i = a; i < b; i++) {
            arr[i - a] = i;
        }
        for (int i = 0; i < output.length; i++) {
            if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                output[i] = "FizzBuzz";
            } else if (arr[i] % 3 == 0) {
                output[i] = "Fizz";
            } else if (arr[i] % 5 == 0) {
                output[i] = "Buzz";
            } else {
                output[i] = "" + arr[i];
            }

        }
        return output;
    }
}