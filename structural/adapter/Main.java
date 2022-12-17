package patterns.structural.adapter;

import patterns.structural.adapter.oval.Circle;
import patterns.structural.adapter.oval.Oval;
import patterns.structural.adapter.oval.OvalShape;
import patterns.structural.adapter.rectangular.Rectangle;
import patterns.structural.adapter.rectangular.RectangularShape;
import patterns.structural.adapter.rectangular.Square;

public class Main {

    public static void main(String[] args) {

        System.out.println("Original oval shapes");
        OvalShape circle = new Circle(3);
        circle.drawOvalShape();
        System.out.println();
        OvalShape oval = new Oval(2, 3);
        oval.drawOvalShape();

        System.out.println();

        System.out.println("Original rectangular shapes");
        RectangularShape square = new Square(4);
        square.drawRectangularShape();
        System.out.println();
        RectangularShape rectangle = new Rectangle(3, 6);
        rectangle.drawRectangularShape();

        System.out.println();

        System.out.println("New rectangular shapes converted from the original oval shapes");
        RectangularShape convertedCircle = new RectangularAdapter(circle);
        convertedCircle.drawRectangularShape();
        System.out.println();
        RectangularShape convertedOval = new RectangularAdapter(oval);
        convertedOval.drawRectangularShape();
    }
}
