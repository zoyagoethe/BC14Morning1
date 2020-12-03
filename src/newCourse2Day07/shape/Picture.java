package newCourse2Day07.shape;

public class Picture extends Shape {

    private Shape[] shapes;
    private int lengthFrame = 30;

    public Picture(char symbol, Shape[] shapes) {
        super(symbol);
        this.shapes = shapes;
    }

    @Override
    public void draw() {
        for (int i = 0; i < lengthFrame; i++) {
            System.out.print(this.symbol);
        }
        System.out.println();
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].draw();
        }
        System.out.println();
        for (int i = 0; i < lengthFrame; i++) {
            System.out.print(this.symbol);
        }
        System.out.println();
    }
}
