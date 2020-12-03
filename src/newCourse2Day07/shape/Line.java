package newCourse2Day07.shape;

public class Line extends Shape {
    private int length;

    public Line(char symbol, int length) {
        super(symbol);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void draw() {
        for (int i = 0; i < this.length; i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }
}
