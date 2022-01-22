package list_8_1_a.pack;

public class SphericalPack extends Pack {

    private double radius;

    public SphericalPack(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2.0);
    }

    @Override
    public String toString() {
        return "Spherical {" +
                "radius=" + radius +
                "} " + super.toString();
    }
}
