package shapes;
//
//public class Square extends Rectangle {
//
//    public Square(){
//
//    }
//    public Square(int side) {
//        this.length = side;
//        this.width = side;
//    }
//
//    @Override
//    public long getArea() {
//        return (long) this.length * this.length;
//    }
//
//    @Override
//    public int getPerimeter() {
//        return this.length * 4;
//    }
//
//    @Override
//    public String toString() {
//        return "Square{" +
//                "length = " + this.length +
//                ", width = " + this.width +
//                 "}" +
//                "";
//    }


    //    public void setArea(int length) {
//        this.length = length;
//        this.width = length;
//    }
//
//    public void setPerimeter(int length) {
//        this.length = length;
//        this.width = length;
//    }
//}




//   FOR INTERFACES AND ABSTRACT CLASSES



public class Square extends Quadrilateral {
    protected int length;
    protected int width;

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    void setLength() {

    }

    @Override
    void setWidth() {

    }
}