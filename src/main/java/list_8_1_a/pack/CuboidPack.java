package list_8_1_a.pack;

public class CuboidPack extends Pack {

    private double width;

    private double length;

    private double height;

    public CuboidPack(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateSurfaceArea() {
        return 2 * width * length + 2 * width * height + 2 * length * height;
    }

    @Override
    public String toString() {
        return "Cuboid {" +
                "width=" + width +
                ", length=" + length +
                ", height=" + height +
                "} " + super.toString();
    }
}
