public class Rectangle { // A class should always have capitilization on first word
    private int length;
    private int width;

    // constructors
    // general default constructor
    public Rectangle() {
        // Initialize the private instance variables
        length = 5;
        width = 8;
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
    public int calculateArea() {
        int area = length * width;
        return area;
    }

    public int calculatePerimeter() {
        int perimeter = (2 * length) + (2 * width);
        return perimeter;
    }

    public double calculateDiagonal() {
        int lengthSquared = length * length;
        int widthSquared = width * width;
        double diagonal = Math.sqrt(lengthSquared + widthSquared);
        return diagonal;
    }
}
