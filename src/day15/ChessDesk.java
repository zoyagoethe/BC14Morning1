package day15;

/*File6.Task3: Шахматная доска
        Выведите на экран в шахматном порядке символы.
        *-*-*-*-
        -*-*-*-*
        *-*-*-*-
        -*-*-*-*
        *-*-*-*-
        -*-*-*-*
        *-*-*-*-
        -*-*-*-**/

public class ChessDesk {
    public static void main(String[] args) {
        displayChessBoard(8);

    }

    public static boolean checkOdd(int number) {
        return number % 2 == 0;
    }

    private static void displayChessBoard(int number) {
        char symbol1 = '*';
        char symbol2 = '_';
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (checkOdd(i) && !checkOdd(j) || !checkOdd(i) && checkOdd(j)) {
                    System.out.print(symbol1);
                } else {
                    System.out.print(symbol2);
                }
            }
            System.out.println();

        }
    }
}
