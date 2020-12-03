package newCourse2Day07.shape;

public class Main {
    public static void main(String[] args) {

        Line line1 = new Line('-', 30);
        Rectangle rectangle1 = new Rectangle('*', 30, 5);

        Shape[] shapes1 = {line1, rectangle1};
        Picture picture1 = new Picture('=', shapes1);
        picture1.draw();

        Shape[] shapes2 = {picture1, line1, rectangle1};
        Picture picture2 = new Picture('#', shapes2);
        picture2.draw();

        Shape[] shapes3 = {picture1, picture2, line1, rectangle1};
        Picture picture3 = new Picture('+', shapes3);
        picture3.draw();
    }
}
