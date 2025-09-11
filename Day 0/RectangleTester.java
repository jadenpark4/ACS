public class RectangleTester {
    public static void main(String[] args) {
        // Declaration: type name
        // Instantiation/initialization: = new type();
        Rectangle one = new Rectangle();
        Rectangle two = new Rectangle(5, 10);

        // System.out.println("Testing getWidth: " + one.getWidth());

        // System.out.println("Testing getLength: " + two.getLength());

        two.setLength(12);

        // System.out.println("Testing getLength: " + two.getLength());

        System.out.println(two.toString());

        if (one.equals(two)) {
            System.out.println("Chair 1 and 2 are equal.");
        } else {
            System.out.println("Chair 1 and 2 are NOT equal.");
        }

        System.out.println("The area of the rectangle is " + one.getArea());
        System.out.println("The perimeter of the rectangle is " + one.getPerimeter());
        System.out.println("The diagonal of the rectangle is " + one.getDiagonal());
    }
}