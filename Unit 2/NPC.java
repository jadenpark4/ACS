public class NPC {
    private String choice;

    public NPC() {
        choice = RPSGame.generateRandomChoice();
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
        return "Opponent chose " + choice + ".";
    }
}