package day02.hw2;

public class HomeWorkAn2 {
    public static void main(String[] args) {
        int firstSide = 10;
        int secondSide = 20;
        findeRechtangleSquare(firstSide, secondSide);
        findeRechtanglePerimeter(firstSide, secondSide);


        int customerRechtangleSideUno = 28;
        int customerRechtangleSideDuo = 23;
        findeRechtangleSquare(customerRechtangleSideUno, customerRechtangleSideDuo);

    }

    private static void findeRechtanglePerimeter(int a, int b) {
        System.out.println("Perimeter: " + 2 * (a + b));
    }

    private static void findeRechtangleSquare(int a, int b) {
        System.out.println("Fläche: " + a * b);
    }

}
