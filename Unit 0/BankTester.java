public class BankTester {
    public static void main(String[] args) {
        Bank bank1 = new Bank(6, 7);
        System.out.println(bank1.computeTotalEmployees());
        System.out.println(bank1.toString());
        bank1.hireMembers(4, false);
        System.out.println(bank1.toString());
        System.out.println(bank1.getNumberOfLoanOfficers());
    }
}
