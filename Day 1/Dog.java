public class Dog {
    private String name;
    private String ownerName;
    private int age;
    private int dogId;
    private char dogChar;
    private String dogTag;
    private boolean stillInFacility;

    public Dog(String name, String ownerName, int age, int dogId) {
        this.name = name;
        this.ownerName = ownerName;
        this.age = age;
        this.dogId = dogId;
        this.dogTag = generateDogTag();
        this.dogChar = Dog.generateDogChar(this.dogId);
        this.stillInFacility = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDogId() {
        return dogId;
    }

    public void setDogId(int dogId) {
        this.dogId = dogId;
    }

    public char getDogChar() {
        return dogChar;
    }

    public void setDogChar(char dogChar) {
        this.dogChar = dogChar;
    }

    public String getDogTag() {
        return dogTag;
    }

    public void setDogTag(String dogTag) {
        this.dogTag = dogTag;
    }

    public boolean isStillInFacility() {
        return stillInFacility;
    }

    public void setStillInFacility(boolean stillInFacility) {
        this.stillInFacility = stillInFacility;
    }

    // Spot is a good dog. They are 7 years old and belong to Sandra. They are currently in our facility. For employee use only: DogTag is 123L.
    public String toString() {
        if (stillInFacility) {
            return name + " is a good dog. They are " + age + " years old and belong to " + ownerName + ". They are currently in our facility. For employee use only: DogTag is " + dogTag + ".";
        } else {
            return name + " is a good dog. They are " + age + " years old and belong to " + ownerName + ". They are currently NOT in our facility. For employee use only: DogTag is " + dogTag + ".";
        }
    }

    public boolean equals(Dog other) {
        if (this.name.equals(other.name) && this.ownerName.equals(other.ownerName) && this.age == other.age && this.dogId == other.dogId && this.dogChar == other.dogChar && this.dogTag.equals(other.dogTag) && this.stillInFacility == other.stillInFacility) {
            return true;
        } else {
            return false;
        }
    }

    public String generateDogTag() {
        dogTag = "" + dogId + dogChar;
        return dogTag;
    }

    public static char generateDogChar(int dogId) {
        int dig1 = dogId / 100;
        int dig2 = (dogId % 100) / 10;
        int dig3 = dogId % 10;
        char dogChar = (char) ('F' + ((dig1 + dig2 + dig3) % 10));
        return dogChar;
    }

    public static String pickup(Dog dog, String personName) {
        if (dog.ownerName.equals(personName)) {
            dog.stillInFacility = false;
            return dog.name + " has been picked up by their owner " + personName;
        } else {
            return dog.name + " cannot be picked up by " + personName + ", because the names don't match!";
        }
    }

    public static void checkIn(Dog dog, String personName) {
        dog.stillInFacility = true;
        dog.ownerName = personName;
    }
}
