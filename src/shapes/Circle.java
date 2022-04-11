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
        double area = Math.abs(PI) * (this.radious * this.radious);
        return area;
    }

    public double getCircumference() {


        return 0;
    }
}
