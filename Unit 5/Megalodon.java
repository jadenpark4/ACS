public class Megalodon extends Animal {
    private int teeth;
    // private boolean isHungry;
    private String name;
    // private double height;
    // private double weight;
    private int age;

    // name, weight

    public Megalodon(int teeth, String name) {
        super(4, 10, 70, true, "megalodon");
        this.teeth = teeth;
        // this.isHungry = isHungry;
        this.name = name;
        // this.height = height;
        // this.weight = weight;
        // this.age = age;
    }

    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teeth) {
        if (teeth < 0) {
            throw new IllegalArgumentException();
        }
        this.teeth = teeth;
    }

    // public boolean isHungry() {
    // return isHungry;
    // }

    // public void setHungry(boolean isHungry) {
    // this.isHungry = isHungry;
    // }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    // public double getheight() {
    // return height;
    // }

    // public void setheight(double height) {
    // if (height <= 0) {
    // throw new IllegalArgumentException();
    // }
    // this.height = height;
    // }

    // public double getWeight() {
    // return weight;
    // }

    // public void setWeight(double weight) {
    // if (weight <= 0) {
    // throw new IllegalArgumentException();
    // }
    // this.weight = weight;
    // }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException();
        }
        this.age = age;
    }

    public void makeNoise() {
        System.out.println("chompppp");
    }

    // public void feed() {
    // if (isHungry == true) {
    // System.out.println("You fed the megalodon.");
    // isHungry = false;
    // }
    // }

    public String attack(String animal, double height_in_feet) {
        if (animal == null || height_in_feet <= 0) {
            throw new IllegalArgumentException();
        }
        if (height_in_feet < 26) {
            return "Your megalodon, " + name + ", ate the " + animal + ".";
        } else {
            return "Your megalodon, " + name + ", was unable to kill the " + animal + ", since it was too big.";
        }
    }

    // public String toString() {
    // if (isHungry == true) {
    // return "Your hungry megalodon, " + name + ", has " + teeth + " teeth, is " +
    // height + " feet long, "
    // + weight
    // + "pounds heavy, and " + age + " years old.";
    // } else {
    // return "Your full megalodon, " + name + ", has " + teeth + " teeth, is " +
    // height + "feet long, " + weight
    // + "pounds heavy, and " + age + " years old.";
    // }

    // }
}
