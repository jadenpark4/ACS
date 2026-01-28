public class LineTester {
    public static void main(String[] args) {
        // Testing Line 1
        /*
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
        */

        Point p1 = new Point(2, 7);
        Point p2 = new Point(1, 4);
        Point p3 = new Point(11, 18);
        Point p4 = new Point(4, 13);

        Line pointLine = new Line(p1, p2);
        System.out.println("Using calculateSlope(): " + pointLine.calculateSlope());
        System.out.println("Using calculateSlopeFromPoints(): " 
                            + pointLine.calculateSlopeFromPoints());

        if (pointLine.calculateSlope() == pointLine.calculateSlopeFromPoints()) {
            System.out.println("The slopes are equal.");
        } else {
            System.out.println("The slopes are NOT equal.");
        }

        System.out.println("Is p1 on the line? " + pointLine.isOnLine(p1));
        System.out.println("Is p2 on the line? " + pointLine.isOnLine(p2));
        System.out.println("Is p3 on the line? " + pointLine.isOnLine(p3));
        System.out.println("Is p4 on the line? " + pointLine.isOnLine(p4));
    }
}
