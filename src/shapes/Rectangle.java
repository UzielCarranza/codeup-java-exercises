package shapes;
//
//public class Rectangle {
//    //    fields
//    protected int length;
//    protected int width;
//
//    //    constructor
//    public Rectangle() {
//
//    }
//
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    //    methods
//
//    public long getArea() {
//        return (long) this.length * this.width;
//    }
//
//    public int getPerimeter() {
//        return (this.length + this.length) + (this.width + this.width);
//    }
//
//    @Override
//    public String toString() {
//        return "Square{" +
//                "length = " + this.length +
//                "width = " + this.width +
//                "}" +
//                "";
//    }


//    public void setArea(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public long getArea() {
//        return (long) this.length * this.width;
//    }
//
//    public void setPerimeter(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public long getPerimeter() {
//        return (this.length + this.length) + (this.width + this.width);
//    }


//}

//    INTERFACES AND ABSTRACT EXERCISES


public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(int length, int width){
        super(length, width);
    }
    @Override
    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }

    @Override
    public double getArea() {
        return (length * width);
    }

    @Override
    void setLength() {

    }

    @Override
    void setWidth() {

    }
}
