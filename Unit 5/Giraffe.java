public class Giraffe extends Animal {
    private double neckLength;
    // private double height;
    private String spotPattern;
    // private int age;
    private String favoriteTree;
    private boolean isInAfrica;
    // private boolean isHungry;

    // habitat

    public Giraffe(double neckLength, String spotPattern, String favoriteTree,
            boolean isInAfrica) {
        super(3, 6, 2, true, "giraffe");
        this.neckLength = neckLength;
        // this.height = height;
        this.spotPattern = spotPattern;
        // this.age = age;
        this.favoriteTree = favoriteTree;
        this.isInAfrica = isInAfrica;
    }

    public double getNeckLength() {
        return neckLength;
    }

    public void setNeckLength(double neckLength) {
        this.neckLength = neckLength;
    }

    // public double getHeight() {
    // return height;
    // }

    // public void setHeight(double height) {
    // this.height = height;
    // }

    public String getSpotPattern() {
        return spotPattern;
    }

    public void setSpotPattern(String spotPattern) {
        this.spotPattern = spotPattern;
    }

    // public int getAge() {
    // return age;
    // }

    // public void setAge(int age) {
    // this.age = age;
    // }

    public String getFavoriteTree() {
        return favoriteTree;
    }

    public void setFavoriteTree(String favoriteTree) {
        this.favoriteTree = favoriteTree;
    }

    public boolean isInAfrica() {
        return isInAfrica;
    }

    public void setInAfrica(boolean isInAfrica) {
        this.isInAfrica = isInAfrica;
    }

    // public void feed() {
    // if (isHungry == true) {
    // System.out.println("You fed the megalodon.");
    // isHungry = false;
    // }
    // }

    public void makeNoise() {
        System.out.println("hummmmm");
    }

    public String stretch(int extension) {
        neckLength = neckLength + extension;
        return "Your giraffe's neck is now " + neckLength + " feet long.";
    }

    // public String useTimeMachine(int years) {
    // int newAge = years + age;
    // return "After using the time machine that travelled the giraffe for " + years
    // + " years, your giraffe is now "
    // + newAge + " years old.";
    // }

    // public String toString() {
    // if (isInAfrica == true) {
    // return "Your African giraffe, has a neck length of " + neckLength + " feet,
    // is " + height
    // + " feet tall, has a " + spotPattern + " spot pattern, is " + age + " years
    // old, and likes the "
    // + favoriteTree + " type of tree.";
    // } else {
    // return "Your non-African giraffe, has a neck length of " + neckLength + "
    // feet, is " + height
    // + " feet tall, has a " + spotPattern + " spot pattern, is " + age + " years
    // old, and likes the "
    // + favoriteTree + " type of tree.";
    // }
    // }
}
