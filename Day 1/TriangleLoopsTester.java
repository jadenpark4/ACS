public class TriangleLoopsTester {
    public static void main(String[] args) {
        String outputA = TriangleLoops.createLetterTriangleUp(3, 'A');
        System.out.println(outputA);
        String outputB = TriangleLoops.createLetterTriangleUp(5, 'B');
        System.out.println(outputB);
        String outputC = TriangleLoops.createLetterTriangleDown(5, 'C');
        System.out.println(outputC);
        String outputD = TriangleLoops.createLetterTriangleDown(4, 'D');
        System.out.println(outputD);
        String outputE = TriangleLoops.createNumbersTriangle(3);
        System.out.println(outputE);
        String outputF = TriangleLoops.createAlphabetTriangle(6);
        System.out.println(outputF);
    }
}
