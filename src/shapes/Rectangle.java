package shapes;

public class Rectangle {
    //    fields
    protected int length;
    protected int width;

    //    constructor
    public Rectangle() {

    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    //    methods
    public void setArea(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public long getArea() {
        return (long) this.length * this.width;
    }

    public void setPerimeter(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public long getPerimeter() {
        return (this.length + this.length) + (this.width + this.width);
    }
}