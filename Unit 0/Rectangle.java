public class Rectangle { // A class should always have capitilization on first word
    private int length;
    private int width;
    private int area;

    // constructors
    // general default constructor
    public Rectangle() {
        // Initialize the private instance variables
        length = 5;
        width = 10;
    }

    public Rectangle(int squareSideLength) {
        length = squareSideLength;
        width = squareSideLength;
    }

    // defines the instance variables with the local parameters
    public Rectangle(int desiredLength, int desiredWidth) {
        length = desiredLength;
        width = desiredWidth;
    }

    // is equal method
    //use == if lowercase data type, uppercase(nonprimitive) is .equals
    public boolean equals(Rectangle otherRect) {
        if (this.length == otherRect.length 
            && this.width == otherRect.width
            ) {
            return true;
        }
        return false;
    }

    // getters (ask the question about the class)
    // making it public gives consent to the tester to see width/length
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    // setters (allow us to go in and changing around attributes in the class)
    public void setLength(int newLength) {
        length = newLength;
    }

    public void setWidth(int newWidth) {
        width = newWidth;
    }

    // methods
    public int getArea() {
        int area = length * width;
        return area;
    }

    public int getPerimeter() {
        int perimeter = (2 * length) + (2 * width);
        return perimeter;
    }

    public double getDiagonal() {
        int lengthSquared = length * length;
        int widthSquared = width * width;
        double diagonal = Math.sqrt(lengthSquared + widthSquared);
        return diagonal;
    }

    public String toString() {
        area = length * width;
        return "This rectangle has a length of " + length
            + " and a width of " + width
            + ". Its area is " + area
            + ".";
    }
}
