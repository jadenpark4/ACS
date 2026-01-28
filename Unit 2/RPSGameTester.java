public class RPSGameTester {
    public static void main(String[] args) {
        Player player = new Player();
        NPC opponent = new NPC();
        opponent.setChoice(RPSGame.generateRandomChoice());
        RPSGame game = new RPSGame(player, opponent);
        game.start();
        System.out.println(game.displayResults());
    }
}
