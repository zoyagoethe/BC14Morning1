package day13.HomeWork13;

/*Давайте напишем генератор паролей. Методу передаётся длина пароля. И метод генерирует пароль,
используя латиницу, цифры и некоторые спецсимволы(на ваш выбор).*/

import com.sun.org.apache.bcel.internal.generic.ARETURN;

public class HomeWork13 {
    public static void main(String[] args) {
        System.out.println(generatePassword(8));
    }

    private static String generatePassword(int n) {
        String password = "";
        for (int i = 0; i < n; i++) {
            int min = 65;
            int max = 90;
            char c = (char) ((Math.random() * (max - min) + 1) + min);
            password += c;
        }
        return password;
    }
}