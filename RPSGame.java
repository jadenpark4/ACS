public class RPSGame {
    private Player player;
    private NPC opponent;

    public RPSGame (Player player, NPC opponent) {
        this.player = player;
        this.opponent = opponent;
    }

    public void start() {

    }

    public void setPlayerValues(String name, String choice) {

    }

    public boolean didPlayerWin() {
        if ((player.getChoice().equals("rock")
            && opponent.getChoice().equals("scissors"))
            || (player.getChoice().equals("paper")
            && opponent.getChoice().equals("rock")) 
            || (player.getChoice().equals("scissors")
            && opponent.getChoice().equals("paper"))) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "== GAME RESULTS ==" + "\n" + player.getName() +
            " chose " + player.getChoice() + ".\n" + "Opponent chose " +
            opponent.getChoice() + ".\n" + 
    }

    public String displayResults() {
        return "";
    }

    public static boolean validateChoice(String choice) {
        if (choice.equals("rock") || choice.equals("paper")
            || choice.equals("scissors")) {
            return true;
        } else {
            return false;
        }
    }

    public static String generateRandomChoice() {
        int num = (int) (Math.random() * 3) + 1;
        if (num == 1) {
            return "rock";
        } else if (num == 2) {
            return "paper";
        } else {
            return "scissors";
        }
    }
}
