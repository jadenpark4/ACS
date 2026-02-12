public abstract class Animal {
    private int age;
    private double height;
    private double weight;
    private boolean isHungry;
    private String type;

    public Animal(int age, double height, double weight, boolean isHungry, String type) {
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.isHungry = isHungry;
        this.type = type;
    }

    public Animal() {

    }

    public void feed() {
        if (isHungry == true) {
            System.out.println("You fed the animal.");
            isHungry = false;
        }
    }

    public String toString() {
        return "Your animal is a " + type + " that is " + age + " years old, weighs " + weight + " pounds, is " + height
                + " feet tall, and isHungry is currently: " + isHungry;
    }

    public abstract void makeNoise();
}