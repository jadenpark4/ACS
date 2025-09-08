public class ChairTester {
    public static void main (String[] args) {
        System.out.println("Yo, what's up!");

        Chair libChair = new Chair(); //Computer runs the public Chair()
        Chair libChair2 = new Chair("red");
        Chair libChair3 = new Chair("pink", 6.7);
        System.out.println(libChair.toString());
        libChair.bend();
        libChair.distort();
        libChair.addLeg();
        int numberLegsRemoved = 3;
        libChair.removeLeg(numberLegsRemoved);
        libChair.getBetterPosture();
        System.out.println(libChair.toString());
        System.out.println(libChair2.toString());
        System.out.println(libChair3.toString());
        if (libChair.equals(libChair2)) {
            System.out.println("Chair 1 and 2 are equal.");
        } else {
            System.out.println("Chair 1 and 2 are NOT equal.");
        }
    }
}