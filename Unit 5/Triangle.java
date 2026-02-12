public class Triangle extends Polygon {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        super(3);
        this.base = base;
        this.height = height;
    }

    public Triangle() {
        super(3);
        this.base = 3;
        this.height = 4;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        double area = base * height * 0.5;
        return area;
    }

    public String toString() {
        return "This is a polygon. \n It is a triangle with a base of " + base + " and height of " + height
                + ". Its area is " + (base * height * 0.5) + ".";
    }
}
