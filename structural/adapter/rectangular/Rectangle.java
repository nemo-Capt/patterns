package patterns.structural.adapter.rectangular;

public class Rectangle implements RectangularShape {

    private int side1;
    private int side2;

    public Rectangle(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public void drawRectangularShape() {
        for (int i = 0; i < side1; i++) {
            for (int j = 0; j < side2; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
