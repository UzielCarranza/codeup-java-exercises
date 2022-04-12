package shapes;

class Square extends Rectangle {

    public Square(int side) {
        this.length = side;
        this.width = side;
    }

    public void setPerimeter(int length) {
        this.length = length;
        this.width = this.length;
    }
}
