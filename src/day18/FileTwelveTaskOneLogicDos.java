package day18;

/*
We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5
        inches each). Return true if it is possible to make the goal by choosing from the given bricks. This is a little harder than it
        looks and can be done without any loops. See also: Introduction to MakeBricks
        makeBricks(3, 1, 8) → true
        makeBricks(3, 1, 9) → false
        makeBricks(3, 2, 10) → true
*/
public class FileTwelveTaskOneLogicDos {
    public static void main(String[] args) {
        System.out.println(makeBricks(3, 1, 8));// → true
        System.out.println(makeBricks(3, 1, 9));// → false
        System.out.println(makeBricks(3, 2, 10));// → true
    }

    private static boolean makeBricks(int countSmallBricks, int countBigBricks, int goal) {
        int smallBricks = 1;
        int bigBricks = 5;
        int size = countSmallBricks * smallBricks + countBigBricks * bigBricks;
        if (size >= goal) {
            return true;
        }
        return false;
        //return (countSmallBricks*1 + countBigBricks*5) >= goal;
    }
}
