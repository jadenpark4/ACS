public class Chair {

    private String color; //= "Blue";
    private String texture; // = "Wavy";
    private String feel; // = "Comfy";
    private int totalLen; // = 3;
    private double height; // = 1.5;
    private Boolean isBending; // = true;
    private char chairShape; // = 'L';
    private int chairLegs;

    // "" used for all strings
    // Strings use more than one bucket of memory (capital letter data type like "String" is not primitive (check))
    // CMD + / toggles the commenting

    // public static void main() {

    // }

    public Chair() {
        color = "Blue";
        texture = "Wavy";
        feel = "Comfy";
        totalLen = 3;
        height = 1.5;
        isBending = false;
        chairShape = 'L';
        chairLegs = 4;
    }

    public void bend() { // (public) (what comes out) (name of function(inputs)) it's called a method signature
        isBending = true;
        System.out.println("The chair is now bending.");
    }

    public void distort() {
        // chairShape = 'Z';
        chairShape = 'W';
        System.out.println("Your chair now looks like: " + chairShape);
    }

    public void fix() {
        chairShape = 'L';
        System.out.println("Your chair now looks like: L.");
    }

    public void discolor() {
        color = "White";
        System.out.println("Your chair is now white.");
    }

    public void stretch() {
        totalLen = 5;
        System.out.println(totalLen);
    }
    public void addLeg() {
        chairLegs = 5;
        System.out.println("The chair now has " + chairLegs + " legs.");
    }
    public void removeLeg(int numberLegsRemoved) {
        if (chairLegs < numberLegsRemoved)
        {
            System.out.println("There aren't enough chairs to do this action!");
            chairLegs = 0;
        } else {
            chairLegs = chairLegs - numberLegsRemoved;
            System.out.println("The chair now has " + chairLegs + " legs, after you removed " + numberLegsRemoved + " legs.");
        }
        if (chairLegs == 0)
        {
            System.out.println("There are no legs left.");
        }
    }
    public void getBetterPosture() {
        if (!isBending)
        {
            System.out.println("The seat is upright.");
        }
        else {
            System.out.println("Sit up and stop being lazy.");
        }
    }

    // bend
    // distort
    // fix
    // discolor
    // stretch

}