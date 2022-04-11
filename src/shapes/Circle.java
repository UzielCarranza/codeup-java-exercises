package shapes;

import static java.lang.Math.PI;

public class Circle {
    //    fields
    private double radious;

    //methods
    public Circle(double radius) {
        this.radious = radius;
        double circumference = 2 * (Math.abs(PI) * radius);
        System.out.println(circumference);
    }

    public double getArea() {

        return 0;
    }

    public double getCircumference() {

        return 0;
    }
}
