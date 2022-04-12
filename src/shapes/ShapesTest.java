package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Rectangle box1 = new Rectangle(5, 4);
        System.out.println("Area: " + box1.getArea());
        System.out.println("Perimeter: " + box1.getPerimeter());

//        Second exercise
        Square box2 = new Square();
        box2.setPerimeter(5);
        System.out.println("Perimeter: " + box2.getPerimeter());

        box2.setArea(5);
        System.out.println("Area: " + box2.getArea());
    }
}
