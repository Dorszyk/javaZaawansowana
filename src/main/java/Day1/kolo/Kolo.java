package Day1.kolo;

public class Kolo {

    protected double radius;

    protected final static double PI = Math.PI;

    public Kolo(double radius) {
        this.radius = radius;
    }

    protected final double calculatieSurface() {
        return PI * radius * radius;
    }

    protected final double calculatieSurface(boolean negative) {
        return 2.0;
    }
    protected final double calculatieSurface(double value) {
        return 2.0;
    }
    protected final double calculatieSurface(float value) {
        return 2.0;
    }

    protected final double calculatieSurface(final long negative) {
        return 1231231142312111111L;
    }

}
