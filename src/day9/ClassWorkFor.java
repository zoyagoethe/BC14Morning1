package day9;

public class ClassWorkFor {
    public static void main(String[] args) {
        int lines = 10;
        triangle(lines);
    }

    private static void triangle(int number) {
        String star = "*";
        String line ="";
        for (int i = 0; i < number ; i++) {
            line = line + star;
            System.out.println(line);
        }
    }
}
