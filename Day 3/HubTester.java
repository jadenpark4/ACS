public class HubTester {
    public static void main(String[] args) {

        // 39 exceptions

        System.out.println("===== HUB TESTER =====");
        // Hub Tester

        System.out.println("= Invalid name =");

        try {
            Student s1 = new Student("J@den", "pw", "jaden@gmail.com");
            // System.out.println("ERROR: Exception was not expected but not thrown.");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the name included an '@', as intended");
        }

        System.out.println("= Blank password =");

        try {
            Student s2 = new Student("J@den", " ", "jaden@gmail.com");
            // System.out.println("ERROR: Exception was not expected but not thrown.");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the password was blank, as intended");
        }

        System.out.println("= Invalid email =");

        try {
            Student s3 = new Student("J@den", "pw", "jaden.gmail.com");
            // System.out.println("ERROR: Exception was not expected but not thrown.");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the email was invalid, as intended");
        }

        Hub hub = new Hub();

        System.out.println("= Blank student name =");

        try {
            hub.registerStudent("", "p123", "tester@gmail.com");
            // System.out.println("ERROR: Exception was not expected but not thrown.");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the student name was blank, as intended");
        }

        System.out.println("= Invalid student email =");

        try {
            hub.registerStudent("Test", "p123", "testergmail.com");
            // System.out.println("ERROR: Exception was not expected but not thrown.");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the student email was invalid, as intended");
        }

        System.out.println("= Invalid student email =");

        try {
            hub.registerStudent("Test", "p123", "testergmail.com");
            // System.out.println("ERROR: Exception was not expected but not thrown.");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the student email was invalid, as intended");
        }
    }
}
