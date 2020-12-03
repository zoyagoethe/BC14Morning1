package newCourse2Day07.shape;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(char symbol, int width, int height) {
        super(symbol);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void draw() {
        for (int a = 1; a <= height; a++) {
            for (int b = 2; b <= width; b++) {
                System.out.print(symbol);
            }
            System.out.println(symbol);
        }
    }
}
