public class LineTester {
    public static void main(String[] args) {
        // Testing Line 1
        Line line1 = new Line(5, 4, -17);
        System.out.println(line1.toString());
        double slope1 = line1.calculateSlope();
        System.out.println(slope1);
        boolean onLine1 = line1.isCoordinateOnLine(5, -2);
        System.out.println(onLine1);

        // Testing Line 2
        Line line2 = new Line(-25, 40, 30);
        System.out.println(line2.toString());
        double slope2 = line2.calculateSlope();
        System.out.println(slope2);
        boolean onLine2 = line2.isCoordinateOnLine(5, -2);
        System.out.println(onLine2);

    }
}
