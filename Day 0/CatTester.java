public class CatTester {
    public static void main(String[] args) {
        Cat myCat = new Cat("Betsy", "Tabby"); // 11. Added 'new' to create a new object (Cat)
        Cat otherCat = new Cat("Tiger Beast", "Tabby"); // 12. Also added 'new' to create a new object (Cat)
        System.out.println(myCat.toString());
        System.out.println("My Cat's Name: " + myCat.getName()); // 13. Added the System.out.println function to properly print out the cat's name

        System.out.println("Are the cat's equal? " + myCat.equals(otherCat)); // 14. Instead of returning, we print this out. 15. Added space between ? and the end quotation mark

        System.out.println("Is my cat hungry? " + myCat.feed()); // 16. changed "print" to "System.out.println"

        String firstName = "Tiger";
        String lastName = "Beast"; // 17. Because we are declaring a variable, we only need one '='s instead of 2
        String name = firstName + " " + lastName;

        System.out.println("Changing the cat's name...");
        myCat.setName(name);


        System.out.println("The two cat's are the same now: " + myCat.equals(otherCat));

    }

}
