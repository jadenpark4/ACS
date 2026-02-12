public class Rectangle extends Polygon {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        super(4);
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
        super(4);
        this.width = 4;
        this.length = 3;
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

    public double getArea() {
        double area = width * length;
        return area;
    }

    public String toString() {
        return "This is a polygon. \n It is a triangle with a length of " + length + " and width of " + width
                + ". Its area is " + (width * length) + ".";
    }
}
