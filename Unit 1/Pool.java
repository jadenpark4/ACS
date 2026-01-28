public class Pool {
    private String name;
    private String ownerName;
    private String username;
    private int cleanlinessLevel;
    private boolean needsChemicalCheck;

    public Pool(String name, String ownerName, int cleanlinessLevel) {
        this.ownerName = PoolUtils.fixName(ownerName);
        this.username = PoolUtils.generateUsername(ownerName);
        this.cleanlinessLevel = PoolUtils.validateCleanlinessLevel(cleanlinessLevel);
        this.needsChemicalCheck = false;
    }

    public Pool() {
        this.name = "Unnamed Pool";
        this.ownerName = "Unnamed Owner";
        this.username = "Unnamed Owner";
        this.cleanlinessLevel = 5;
        this.needsChemicalCheck = true;
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
        this.ownerName = PoolUtils.fixName(ownerName);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCleanlinessLevel() {
        return cleanlinessLevel;
    }

    public void setCleanlinessLevel(int cleanlinessLevel) {
        this.cleanlinessLevel = PoolUtils.validateCleanlinessLevel(cleanlinessLevel);
    }

    public boolean isNeedsChemicalCheck() {
        return needsChemicalCheck;
    }

    public void setNeedsChemicalCheck(boolean needsChemicalCheck) {
        this.needsChemicalCheck = needsChemicalCheck;
    }

    public String toString() {
        return "== ABOUT POOL ==" + "\n" + "Name: "
        + name + "\n" + "Owner Name: "
        + ownerName + "\n" + "Username: "
        + username + "\n" + "Cleanliness Level: "
        + cleanlinessLevel + "\n" + "Does pool need chemical check? "
        + needsChemicalCheck;
    }

    public boolean equals(Pool other) {
        if (this.name.equals(other.name) && this.ownerName.equals(other.ownerName) 
            && this.username.equals(other.username)
            && this.cleanlinessLevel == other.cleanlinessLevel 
            && this.needsChemicalCheck == other.needsChemicalCheck) {
            return true;
        } else {
            return false;
        }
    }
}
