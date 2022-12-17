package patterns.structural.adapter;

import patterns.structural.adapter.oval.OvalShape;
import patterns.structural.adapter.rectangular.RectangularShape;

public class RectangularAdapter implements RectangularShape {

    private OvalShape ovalShape;

    public RectangularAdapter(OvalShape ovalShape) {
        this.ovalShape = ovalShape;
    }

    @Override
    public void drawRectangularShape() {
        for (int i = 0; i < ovalShape.getRadius1() * 2 + 1; i++) {
            for (int j = 0; j < ovalShape.getRadius2() * 2 + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
