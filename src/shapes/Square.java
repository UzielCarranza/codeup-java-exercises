package shapes;

public class Square extends Rectangle {

    public Square(){

    }
    public Square(int side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public long getArea() {
        return (long) this.length * this.length;
    }

    @Override
    public int getPerimeter() {
        return this.length * 4;
    }


    //    public void setArea(int length) {
//        this.length = length;
//        this.width = length;
//    }
//
//    public void setPerimeter(int length) {
//        this.length = length;
//        this.width = length;
//    }
}
