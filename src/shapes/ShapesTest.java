package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Rectangle box1 = new Rectangle(5, 6);
        System.out.println("-----------Rectangle details------------");
        System.out.println("Area" + box1.getArea());
        System.out.println("Perimeter: " + box1.getPerimeter());

//        Second exercise
        Rectangle box2 = new Square(5);
        System.out.println("-----------Square details------------");
        System.out.println("Perimeter: " + box2.getPerimeter());
        System.out.println("Area: " + box2.getArea());
        System.out.println("-----------Shutting dowm------------");
    }
}
