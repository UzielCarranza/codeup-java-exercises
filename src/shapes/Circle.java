package shapes;
import static java.lang.Math.PI;

public class Circle {
    //    fields
    private double radious;

    //methods
    public Circle(double radius) {
        this.radious = radius;
    }

    public double getArea() {
        return Math.abs(PI) * (this.radious * this.radious);
    }

    public double getCircumference() {

        return 2 * (Math.abs(PI) * this.radious);
    }
}
