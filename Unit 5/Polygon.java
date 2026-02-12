public abstract class Polygon {
    private int numberOfSides;

    public Polygon(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public abstract double getArea();

    public abstract String toString();

}
