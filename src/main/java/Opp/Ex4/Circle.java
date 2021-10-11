package Opp.Ex4;

public class Circle extends Shape {

    private float radius;

    public Circle(String color, boolean isFiled, float radius) {
        super(color, isFiled);
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getArea() {
        return (float) (Math.PI * radius * radius);
    }

    @Override
    public float getPerimeter() {
        return 0;
    }

    public float getPerimetre() {
        return (float) (2 * Math.PI * radius);
    }

    @Override
    public String toString() {
        return String.format("Okrąg o promieniu = %f subclass off %s", radius, super.toString());


    }
}
