public class TheaterMember {
    private String name;
    private boolean loyaltyCredits[];

    public TheaterMember(String name) {
        this.name = name;
        boolean[] loyaltyCredits = new boolean[10];
        this.loyaltyCredits = loyaltyCredits;
        // loyaltyCredits.length = 10;// add length 10 for array
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean[] getLoyaltyCredits() {
        return loyaltyCredits;
    }

    public void setLoyaltyCredits(boolean[] loyaltyCredits) {
        this.loyaltyCredits = loyaltyCredits;
    }

    public void grantLoyaltyCredit() {
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (loyaltyCredits[i] == false) {
                loyaltyCredits[i] = true;
                return;
            }
        }
    }

    public int countLoyaltyCredits() {
        int count = 0;
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (loyaltyCredits[i] == true) {
                count++;
            }
        }
        return count;
    }

    public String determineMembershipStatus() {
        int count = 0;
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (loyaltyCredits[i] == true) {
                count++;
            }
        }
        if (count >= 6) {
            return "Gold Member";
        } else if (count >= 3 && count <= 5) {
            return "Silver Member";
        } else {
            return "Plus Member";
        }
    }

    public String loyaltyHistory() {
        String history = "Loyalty History: ["; // Loyalty History: [X, X, X, X, -, -, -, -, -, -]
        for (int i = 0; i < 9; i++) {
            if (loyaltyCredits[i] == true) {
                history = history + "X, ";
            } else {
                history = history + "-, ";
            }
        }
        if (loyaltyCredits[9] == true) {
            history = history + "X";
        } else {
            history = history + "-";
        }
        history = history + "]";
        return history;
    }

    public String toString() { // Steven Spielberg (Silver Member), Loyalty History: [X, X, X, X, -, -, -, -,
                               // -, -]
        return name + " (" + determineMembershipStatus() + "), " + loyaltyHistory();
    }

    public boolean equals(TheaterMember other) {
        if (this.name.equals(other.name) && this.loyaltyCredits == other.loyaltyCredits) {
            return true;
        } else {
            return false;
        }
    }
}
