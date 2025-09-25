public class Bank {
    private int numberOfLoanOfficers;
    private int numberOfTellers;

    // Constructors

    public Bank(int desiredNumberOfLoanOfficers, int desiredNumberOfTellers) {
        this.numberOfLoanOfficers = desiredNumberOfLoanOfficers;
        this.numberOfTellers = desiredNumberOfTellers;
    }

    // Setters and getters

    public void setNumberOfLoanOfficers(int numberOfLoanOfficers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
    }

    public void setNumberOfTellers(int numberOfTellers) {
        this.numberOfTellers = numberOfTellers;
    }

    public int getNumberOfLoanOfficers() {
        return numberOfLoanOfficers;
    }

    public int getNumberOfTellers() {
        return numberOfTellers;
    }

    // Methods

    public int computeTotalEmployees() {
        int totalEmployees = numberOfLoanOfficers + numberOfTellers;
        return totalEmployees;
    }

    public String toString() {
        return "This bank has " + numberOfLoanOfficers
            + " loan officers and " + numberOfTellers
            + " tellers.";
    }

    public boolean equals(Bank other) {
        if (other.numberOfLoanOfficers == this.numberOfLoanOfficers
            && other.numberOfTellers == this.numberOfTellers) {
            return true;
        } else {
            return false;
        }
    }

    public void hireMembers(int numberToHire, boolean isLoanOfficer) {
        if (isLoanOfficer == true) {
            numberOfLoanOfficers = numberOfLoanOfficers + numberToHire;
        } else {
            numberOfTellers = numberOfTellers + numberToHire;
        }
    }
}
