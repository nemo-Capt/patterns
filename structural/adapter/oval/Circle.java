package patterns.structural.adapter.oval;

public class Circle implements OvalShape {

    private int radius1;

    public Circle(int radius1) {
        this.radius1 = radius1;
    }

    @Override
    public void drawOvalShape() {
        for (int i = -radius1; i <= radius1; i++) {
            for (int j = -radius1; j <= radius1; j++) {
                if (i * i + j * j <= radius1 * radius1) {
                    System.out.print("* ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    @Override
    public int getRadius1() {
        return radius1;
    }

    @Override
    public int getRadius2() {
        return getRadius1();
    }
}
