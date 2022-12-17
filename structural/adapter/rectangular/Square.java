package patterns.structural.adapter.rectangular;

public class Square implements RectangularShape {

    private int side1;

    public Square(int side1) {
        this.side1 = side1;
    }

    @Override
    public void drawRectangularShape() {
        for (int i = 0; i < side1; i++) {
            for (int j = 0; j < side1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
