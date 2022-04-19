package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
//        boolean keepMakingCircle = true;
//
//        do {
//            Input circleApp = new Input();
//
//            System.out.println("please enter a radius for your circle");
//            double radius = circleApp.getDouble();
//            Circle circle1 = new Circle(radius);
//
//            System.out.println("----------------Circle details---------------");
//            System.out.println("Area: " + circle1.getArea());
//            System.out.println("Circumference: " + circle1.getCircumference());
//
//
//            DecimalFormat dfArea = new DecimalFormat("###.##");
//            System.out.println("Rounded value (DecimalFormat): " + dfArea.format(circle1.getArea()));
//
//            DecimalFormat dfCircumference = new DecimalFormat("###.##");
//            System.out.println("Rounded value (DecimalFormat): " + dfCircumference.format(circle1.getCircumference()));
//
//            Input input = new Input();
//            System.out.println("----------------System off---------------");
//            System.out.println("cotinue making a circle?");
//            if (input.yesNo()) {
//                keepMakingCircle = true;
//
//                System.out.println("----------------System on---------------");
//            } else {
//
//                System.out.println("----------------Shutting dowm---------------");
//                keepMakingCircle = false;
//            }
//        } while (keepMakingCircle);
        Input input = new Input();

        input.getInt();
    }
}
