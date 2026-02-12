public class Square extends Rectangle {
    public Square(double sidelength) {
        super(sidelength, sidelength);
    }

    public Square() {
        super(4, 4);
    }

    public String toString() {
        return "This is a polygon. \n It is a triangle with a length of " + super.getLength() + " and width of "
                + super.getWidth()
                + ". Its area is " + (getArea()) + ". \n It is also a square.";
    }

}
