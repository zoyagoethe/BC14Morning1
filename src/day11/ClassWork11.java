package day11;

public class ClassWork11 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 20; j++) {
                count++;
                //Nested Loops
                // Вложенные циклы
            }
        }
        System.out.println(count);

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                for (int k = 0; k < i; k++) {
                    for (int l = 0; l < j; l++) {
                        // i, j, k, l;
                    }
                }
            }
        }
    }
}