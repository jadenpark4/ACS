public class Player {
    private String name;
    private String choice;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getChoice() {
        return choice;
    }
    
    public void setChoice(String choice) {
        String c = choice.toLowerCase().trim();
        if (!RPSGame.validateChoice(c)) {
            this.choice = RPSGame.generateRandomChoice();
        } else {
            this.choice = choice;
        }
    }

    public String toString() {
        return name + " chose " + choice + ".";
    }
}
