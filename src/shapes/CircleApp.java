package shapes;

import util.Input;
import shapes.Circle;
import java.text.DecimalFormat;

public class CircleApp {

    public static void main(String[] args) {

        Input circleApp = new Input();
        System.out.println("please enter a radius for your circle");
        double radius = circleApp.getDouble();
        Circle circle1 = new Circle(radius);

        System.out.println("Area: " + circle1.getArea());
        System.out.println("Circumference: " + circle1.getCircumference());


        DecimalFormat dfArea = new DecimalFormat("###.##");
        System.out.println("Rounded value (DecimalFormat): "+dfArea.format(circle1.getArea()));

        DecimalFormat dfCircumference = new DecimalFormat("###.##");
        System.out.println("Rounded value (DecimalFormat): "+dfCircumference.format(circle1.getCircumference()));
    }
}
