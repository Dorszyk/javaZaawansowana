package Opp.Ex4;


public class Square extends Rectangle {

    public Square(String color, boolean isFiled, double width, double length) {
        super(color, isFiled, width, length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public String toString() {
        return String.format("Square with width=%f and length = % f which is subclass off %s", width, length,
                super.toString());
    }


}
