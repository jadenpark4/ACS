public class NPC {
    private String choice;

    public NPC() {
        // return choice by generateRandomChoice()
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice; // validate
    }

    public String toString() {
        return "Opponent chose " + choice + ".";
    }
}