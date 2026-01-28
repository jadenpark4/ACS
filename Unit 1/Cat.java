public class Cat {
    String name;
    String ownerName;
    int moodLevel;
    String catId;
    char catChar;
    boolean isHungry;

    public Cat(String name, String ownerName, int moodLevel, String catId) {
        this.name = name;
        this.ownerName = ownerName;
        this.moodLevel = moodLevel;
        this.catId = catId;
        this.isHungry = true;
    }

    public Cat() {
        this.name = "Unnamed Cat";
        this.ownerName = "Unknown";
        this.moodLevel = 5;
        this.catId = PurrfectUtils.validateCatId("0000");
        this.catChar = PurrfectUtils.generateCatChar(this.catId);
        this.isHungry = true;
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

    public int getMoodLevel() {
        return moodLevel;
    }

    public void setMoodLevel(int moodLevel) {
        if (moodLevel >= 0 && moodLevel <= 10) {
            this.moodLevel = PurrfectUtils.validateMoodLevel(moodLevel);;
        }
        else if (moodLevel > 10) {
            this.moodLevel = 10;
        }
        else {
            this.moodLevel = 0;
        }
    }

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = PurrfectUtils.validateCatId(catId);
    }

    public char getCatChar() {
        return catChar;
    }

    public void setCatChar(char catChar) {
        this.catChar = catChar;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }

    public String generateCatTag() {
        String catTag = (catId + catChar);
        return catTag;
    }

    public String toString() {
        // todo
        return this.name + " is a cat. " + "\n" + "Their tag is " 
        + this.catId + "." + "\n" + PurrfectUtils.determineCatMood(this);
    }

    public boolean equals(Cat other) {
        if (this.name.equals(other.name) && this.ownerName.equals(other.ownerName) 
            && this.moodLevel == other.moodLevel 
            && this.catId == other.catId 
            && this.catChar == other.catChar 
            && this.isHungry == other.isHungry) {
            return true;
        } else {
            return false;
        }
    }
}
