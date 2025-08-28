public class ChairTester {
    public static void main (String[] args) {
        System.out.println("Yo, what's up!");

        Chair libChair = new Chair(); //Computer runs the public Chair()
        libChair.bend();
        libChair.distort();
        libChair.addLeg();
    }
}