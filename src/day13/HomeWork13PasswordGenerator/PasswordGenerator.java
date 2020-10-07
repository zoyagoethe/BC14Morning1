package day13.HomeWork13PasswordGenerator;

/* a-z (маленькие буквы): 97-122
   A-Z (большие буквы): 65-90
   0-9 (цифра): 48-57 */

public class PasswordGenerator {
    public static void main(String[] args) {
        System.out.println(passwordGenerator(8));
        System.out.println(passwordGenerator(15));

    }

    private static String passwordGenerator(int n) {
        String password = "";
        for (int i = 0; i < n; i++) {
            int min = 48;
            int max = 122;
            char c = (char) ((Math.random() * (max - min) + 1) + min);
            password += c;
        }
        return password;
    }
}
