import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class DecksAndChecks {

    // ----------------------------
    // CHECKERS (students implement)
    // ----------------------------

    // Rule: no single card may have more than 1 ability
    public static boolean checkOneAbilityPerCard(ArrayList<Card> deck) {
        // TODO
        for (int i = 0; i < deck.size(); i++) {
            if (deck.get(i).hasBastion() == true) {
                if (deck.get(i).hasCleave() == true || deck.get(i).hasRipple() == true) {
                    return false;
                }
            }
            if (deck.get(i).hasCleave() == true) {
                if (deck.get(i).hasBastion() == true || deck.get(i).hasRipple() == true) {
                    return false;
                }
            }
            if (deck.get(i).hasRipple() == true) {
                if (deck.get(i).hasBastion() == true || deck.get(i).hasCleave() == true) {
                    return false;
                }
            }
        }
        return true;
    }

    // Rule: no more than 3 total ability cards in the deck
    public static boolean checkNoMoreThanThreeAbilityCards(ArrayList<Card> deck) {
        // TODO
        int abilityCount = 0;
        for (int i = 0; i < deck.size(); i++) {
            if (deck.get(i).hasBastion() || deck.get(i).hasCleave() || deck.get(i).hasRipple()) {
                abilityCount += 1;
            }
            if (abilityCount > 3) {
                return false;
            }
        }
        return true;
    }

    // Rule: no duplicate abilities in the deck (max one BASTION, one RIPPLE, one
    // CLEAVE)
    public static boolean checkNoDuplicateAbilities(ArrayList<Card> deck) {
        // TODO
        int hasBastion = 0;
        int hasRipple = 0;
        int hasCleave = 0;
        // for (Card c : deck) {
        // if (c.hasBastion())
        // hasBastion++;
        // if (c.hasRipple())
        // hasRipple++;
        // if (c.hasCleave())
        // hasCleave++;
        // }
        // return hasBastion >= 1 && hasRipple >= 1 && hasCleave >= 1;
        for (int i = 0; i < deck.size(); i++) {
            if (deck.get(i).hasBastion() == true) {
                hasBastion += 1;
            }
            if (deck.get(i).hasRipple() == true) {
                hasRipple += 1;
            }
            if (deck.get(i).hasCleave() == true) {
                hasCleave += 1;
            }
            if (hasBastion > 1 || hasRipple > 1 || hasCleave > 1) {
                return false;
            }
        }
        return true;
    }

    // Rule: strength and toughness must be 1..5, and strength+toughness <= 6
    public static boolean checkStatsInRange(ArrayList<Card> deck) {
        // TODO
        for (int i = 0; i < deck.size(); i++) {
            if (deck.get(i).getStrength() < 1 || deck.get(i).getStrength() > 5) {
                return false;
            }
            if (deck.get(i).getToughness() < 1 || deck.get(i).getToughness() > 5) {
                return false;
            }
            if (deck.get(i).getStrength() + deck.get(i).getToughness() > 6) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValidDeck(ArrayList<Card> deck) {
        // TODO: return true only if:
        // - deck has size 5
        // - AND all checks return true
        if (deck == null || deck.size() != 5) {
            return false;
        }
        return checkOneAbilityPerCard(deck) && checkNoDuplicateAbilities(deck) && checkNoMoreThanThreeAbilityCards(deck)
                && checkStatsInRange(deck);
    }

    // ----------------------------
    // DECK BUILDERS (students implement)
    // ----------------------------

    // Must create 5 cards, all 3/3, no abilities
    // If the user doesn't want to input a custom deck, this method should return
    // deck
    // of your choice for them to play with.
    public static ArrayList<Card> buildDefaultDeck() {
        // TODO -- WIP
        ArrayList<Card> deck = new ArrayList<>();
        deck.add(new NamedCard("Stone1", CardType.GRANITE, 3, 3, false, false, false));
        deck.add(new NamedCard("Paper1", CardType.PARCHMENT, 3, 3, false, false, false));
        deck.add(new NamedCard("Blade1", CardType.BLADE, 3, 3, false, false, false));
        deck.add(new NamedCard("Stone2", CardType.GRANITE, 3, 3, false, false, false));
        deck.add(new NamedCard("Paper2", CardType.PARCHMENT, 3, 3, false, false, false));

        return deck;
    }

    // Prompts the user 5 times using Scanner and validates inputs.
    // Required prompt order per card:
    // name, type, strength, toughness, bastion(y/n), ripple(y/n), cleave(y/n)
    public static ArrayList<Card> buildUserDeck(Scanner sc) {
        // TODO
        ArrayList<Card> deck = new ArrayList<>();
        while (deck.size() < 5) {
            System.out.println("Enter card as: ");
            System.out.println("name, type, strength, toughness, bastion(y/n), ripple(y/n), cleave(y/n)");
            String line = sc.nextLine();
            String[] parts = line.split(",");
            String name = parts[0].trim();
            CardType type = CardType.fromText(parts[1].trim());
            if (parts.length != 7) {
                System.out.println("Invalid format.");
                continue;
            }
            int strength;
            int toughness;
            try {
                strength = Integer.parseInt(parts[2].trim());
                toughness = Integer.parseInt(parts[3].trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid numbers.");
                continue;
            }

            if (strength < 1 || strength > 5 || toughness < 1 || strength > 5 || strength + toughness > 6) {
                System.out.println("Invalid stats.");
            }
            boolean bastion = isYes(parts[4]);
            boolean ripple = isYes(parts[5]);
            boolean cleave = isYes(parts[6]);
            int abilityCount = 0;
            if (bastion)
                abilityCount++;
            if (ripple)
                abilityCount++;
            if (cleave)
                abilityCount++;
            if (abilityCount > 1) {
                System.out.println("Only one ability per card");
            }
            deck.add(new NamedCard(name, type, strength, toughness, bastion, ripple, cleave));
        }

        if (!isValidDeck(deck)) {
            System.out.println("Deck violates deck rules.");
            return null;
        }
        return deck;
    }

    // ----------------------------
    // Optional helpers you may use
    // ----------------------------

    public static boolean isYes(String s) {
        if (s == null)
            return false;
        s = s.trim().toLowerCase();
        return s.equals("y") || s.equals("yes");
    }
}
