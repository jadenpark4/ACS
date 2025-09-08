public class Chair {

    private String color; //= "blue";
    private String texture; // = "wavy";
    private String feel; // = "comfy";
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
        color = "blue";
        texture = "wavy";
        feel = "comfy";
        totalLen = 3;
        height = 1.5;
        isBending = false;
        chairShape = 'L';
        chairLegs = 4;
    }

    public Chair(String chairColor) {
        color = chairColor;
        texture = "wavy";
        feel = "comfy";
        totalLen = 3;
        height = 1.5;
        isBending = false;
        chairShape = 'L';
        chairLegs = 4;
    }

    public Chair(String chairColor, double chairHeight) {
        color = chairColor;
        texture = "wavy";
        feel = "comfy";
        totalLen = 3;
        height = chairHeight;
        isBending = false;
        chairShape = 'L';
        chairLegs = 4;
    }

    public boolean equals(Chair otherChair) { //use == if lowercase data type, uppercase(nonprimitive) is .equals
    if (this.color.equals(otherChair.color) &&
        this.height == otherChair.height &&
        this.texture.equals(otherChair.texture) &&
        this.feel.equals(otherChair.feel) &&
        this.totalLen == otherChair.totalLen &&
        this.isBending.equals(otherChair.isBending) &&
        this.chairShape == otherChair.chairShape &&
        this.chairLegs == otherChair.chairLegs
        ) {
            return true;
        }
        return false;
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

    public String toString() {
        return "The chair is " + color 
        + ", has a " + texture
        + " texture, with a " + feel
        + " feel, is shaped like the letter " + chairShape 
        + ", has a length of " + totalLen 
        + ", has a height of " + height
        + " feet, and has " + chairLegs 
        + " legs.";
    }

    // bend
    // distort
    // fix
    // discolor
    // stretch

}