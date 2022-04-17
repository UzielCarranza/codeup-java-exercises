package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected int length;
    protected int width;


    public Quadrilateral(){

    }
    public Quadrilateral(int length, int width){
        this.length = length;
        this.width = width;

    }

    public int getLength() {
        return length;
    }

    abstract void setLength();

    public int getWidth() {
        return width;
    }

    abstract void setWidth();
}
