import java.util.Scanner;

public class RPSGame {
    private Player player;
    private NPC opponent;

    public RPSGame (Player player, NPC opponent) {
        this.player = player;
        this.opponent = opponent;
    }

    public void start() {
        // Collect name and set up scanner + attempts
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.nextLine().trim();
        int attempts = 0;
        String choice;

        // First prompt
        System.out.println("Choose rock, paper, or scissors: ");
        choice = scan.nextLine().trim().toLowerCase();

        // Give more attempts
        while (!validateChoice(choice) && attempts < 2) {
            attempts++;
            System.out.println("Invalid choice. Try again (" + (3 - attempts) + " attempt(s) left).");
            System.out.println("Choose rock, paper, or scissors: ");
        }

        // After 3 failed attempts
        if (!validateChoice(choice)) {
            choice = generateRandomChoice();
            System.out.println("Invalid choice entered three times. Assigning random choice: " + choice);
        }

        setPlayerValues(name, choice);
        scan.close();
    }

    public void setPlayerValues(String name, String choice) {
        player.setName(name);
        player.setChoice(choice);
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
        if (player.getChoice().equals(opponent.getChoice())) {
            return "It's a tie!";
        }
        return didPlayerWin() ? player.getName() + " won! Congratulations!"
            : "Opponent won! Better luck next time!";
    }

    public String displayResults() {
        return "== GAME RESULTS ==" + "\n" + player.getName() +
            " chose " + player.getChoice() + ".\n" + "Opponent chose " +
            opponent.getChoice() + ".\n" + toString();
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
