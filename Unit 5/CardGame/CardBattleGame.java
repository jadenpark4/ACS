import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CardBattleGame {

    // TODO: Implement the full game.
    // Must print:
    // == CARD CLASH ==
    // Starting: Player/Bot
    // Winner: Player/Bot
    public static String playGame(ArrayList<Card> playerDeck, ArrayList<Card> botDeck, Random rng) {
        // TODO
        System.out.println("== CARD CLASH ==");
        PlayerState player = new PlayerState("Player", playerDeck);
        PlayerState bot = new PlayerState("Bot", botDeck);

        boolean playerTurn = rng.nextBoolean();
        System.out.println("Starting: " + (playerTurn ? "Player" : "Bot"));

        while (player.hasAnythingLeft() && bot.hasAnythingLeft()) {
            PlayerState current = playerTurn ? player : bot;
            PlayerState other = playerTurn ? bot : player;
            drawAndPlayIfNeeded(current, other);
            attackOnce(current, other);

            // remove defeated cards
            if (other.active != null && other.active.isDefeated()) {
                other.active = null;
            }

            playerTurn = !playerTurn;
        }

        String winner = player.hasAnythingLeft() ? "Player" : "Bot";
        System.out.println("Winner: " + winner);

        return winner;
    }

    // ----- helpers you may implement or use -----

    // Draw top card if no active, apply on-play effects
    public static void drawAndPlayIfNeeded(PlayerState self, PlayerState other) {
        // TODO
        if (self.active != null) {
            return;
        }
        if (self.deck.isEmpty())
            return;
        self.active = self.deck.remove(0);

        // Apply pending ripple damage
        if (self.pendingDamage > 0) {
            self.active.takeDamage(self.pendingDamage);
            self.pendingDamage = 0;
        }

        Ability ability = self.active.resolvedAbility();
        self.active.applySelfOnPlay(ability);

        // Handle RIPPLE ping
        int ping = ability.pingDamageOnPlay();
        if (ping > 0) {
            if (other.active != null) {
                other.active.takeDamage(ping);
            } else {
                other.pendingDamage += ping;
            }
        }

        // Handle RIPPLE cycle
        if (ability.cyclesOnPlay()) {
            self.deck.add(self.active);
            self.active = null;
            if (!self.deck.isEmpty()) {
                self.active = self.deck.remove(0);
            }
        }
    }

    // One attack (self active attacks other active if both exist)
    public static void attackOnce(PlayerState attacker, PlayerState defender) {
        // TODO
        if (attacker.active == null || defender.active == null) {
            return;
        }

        int dmg = attacker.active.computeDamageAgainst(defender.active);
        defender.active.takeDamage(dmg);
    }

    // Optional local run (not graded)
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // ArrayList<Card> player = DecksAndChecks.buildDefaultDeck();
    // ArrayList<Card> bot = BotFactory.buildBotDeck();

    // if (!DecksAndChecks.isValidDeck(player)) {
    // System.out.println("Player deck invalid!");
    // return;
    // }

    // playGame(player, bot, new Random());
    // }
}
