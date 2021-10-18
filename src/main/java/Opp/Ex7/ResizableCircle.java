package Opp.Ex7;

public class ResizableCircle extends CircleGeometricObject implements Resizable{


    public ResizableCircle(float radius) {
        super(radius);
    }

    @Override
    public void resizable(int percent) {
        radius = radius * percent /100;

    }

    @Override
    public String toString() {
        return "ResizableCircle{" +
                "radius=" + radius +
                '}';
    }
}
