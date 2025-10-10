public class Dog {
    // Instance variables
    private String name;
    private String ownerName;
    private int age;
    private int dogId;
    private char dogChar;
    private String dogTag;
    private boolean stillInFacility;

    // Constructors
    public Dog(String name, String ownerName, int age, int dogId) {
        this.name = name;
        this.ownerName = ownerName;
        this.age = age;
        this.dogId = PawesomeUtils.validateDogId(dogId);
        this.dogChar = PawesomeUtils.generateDogChar(this.dogId);
        this.dogTag = PawesomeUtils.generateDogTag(this.dogId, this.dogChar);
        this.stillInFacility = true;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getAge() {
        return age;
    }

    public int getDogId() {
        return dogId;
    }

    public char getDogChar() {
        return dogChar;
    }

    public String getDogTag() {
        return dogTag;
    }

    public boolean getStillInFacility() {
        return stillInFacility;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDogId(int dogId) {
        this.dogId = PawesomeUtils.validateDogId(dogId);
        char newChar = PawesomeUtils.generateDogChar(this.dogId);
        setDogChar(newChar);

        String newTag = PawesomeUtils.generateDogTag(this.dogId, this.dogChar);
        setDogTag(newTag);
    }

    public void setDogChar(char dogChar) {
        this.dogChar = dogChar;
        this.dogTag = PawesomeUtils.generateDogTag(dogId, dogChar);
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

    // Inherited methods
    // Spot is a good dog. They are 7 years old and belong to Sandra. They are currently in our facility. For employee use only: DogTag is 123L.
    public String toString() {
        if (stillInFacility) {
            return name + " is a good dog. They are " 
                + age + " years old and belong to " 
                + ownerName 
                + ". They are currently in our facility. For employee use only: DogTag is " 
                + dogTag + ".";
        } else {
            return name + " is a good dog. They are " 
                + age + " years old and belong to " 
                + ownerName + ". They are currently NOT in our facility. For employee use only: DogTag is " 
                + dogTag + ".";
        }
    }

    public boolean equals(Dog other) {
        if (this.name.equals(other.name) && this.ownerName.equals(other.ownerName) 
            && this.age == other.age 
            && this.dogId == other.dogId 
            && this.dogChar == other.dogChar 
            && this.dogTag.equals(other.dogTag) 
            && this.stillInFacility == other.stillInFacility) {
            return true;
        } else {
            return false;
        }
    }
}
