package patterns.structural.adapter.oval;

public class Oval implements OvalShape {

    private int radius1;
    private int radius2;

    public Oval(int radius1, int radius2) {
        this.radius1 = radius1;
        this.radius2 = radius2;
    }

    @Override
    public void drawOvalShape() {
        for (int i = -radius1; i <= radius1; i++) {
            for (int j = -radius2; j <= radius2; j++) {
                if (makePositive(i * j) * 2 <= radius1 * radius2) {
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
        return radius2;
    }

    private int makePositive(int number) {
        return number >= 0 ? number : number * -1;
    }
}
