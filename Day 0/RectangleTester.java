public class RectangleTester {
    public static void main (String[] args) {
        // Declaration: type name
        // Instantiation/initialization: = new type();
        Rectangle one = new Rectangle();
        Rectangle two = new Rectangle(6, 7);
        Rectangle three = new Rectangle(4, 10);
        Rectangle four = new Rectangle(8, 8);

        System.out.println("Testing getWidth: " + one.getWidth());

        System.out.println("Testing getLength: " + two.getLength());

        System.out.println("Testing setLength: " + three.getLength());
        three.setLength(12);
        System.out.println("After the setter, length is " + three.getLength());
    }
}