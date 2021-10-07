package Opp.Ex3;

public class Rectangle extends Shape {

    protected double width, length;

    public Rectangle(String color, boolean isFiled, double width, double length) {
        super(color, isFiled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public float getArea() {
        return (float) (2 * width + 2 * length);

    }

    @Override
    public String toString() {
        return String.format("Rectangle with width=%f and length = % f which is subclass off %s", width, length,
                super.toString());
    }
}
