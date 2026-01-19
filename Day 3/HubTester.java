public class HubTester {
    public static void main(String[] args) {

        // 39 exceptions

        System.out.println("===== STUDENT TESTER =====");
        // Student Tester

        System.out.println("= Invalid name =");

        try {
            Student s1 = new Student("J@den", "P12345678!", "jaden@gmail.com");
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

        System.out.println("= Student email missing '@' =");

        try {
            Student s3 = new Student("J@den", "P12345678!", "jaden.gmail.com");
            // System.out.println("ERROR: Exception was not expected but not thrown.");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the email was missing an '@', as intended");
        }

        System.out.println("= Null student name =");

        try {
            new Student(null, "P12345678!", "jaden@gmail.com");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the student name was null, as intended");
        }

        System.out.println("= Blank student name =");

        try {
            new Student("", "P12345678!", "jaden@gmail.com");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the student name was blank, as intended");
        }

        System.out.println("= Null student password =");

        try {
            new Student("Jaden", null, "jaden@gmail.com");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the student password was null, as intended");
        }

        System.out.println("= Null student email =");

        try {
            new Student("Jaden", "P12345678!", null);
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the student email was null, as intended");
        }

        System.out.println("= Blank student email =");

        try {
            new Student("Jaden", "P12345678!", "");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the student email was blank, as intended");
        }

        System.out.println("= Email missing dot =");

        try {
            new Student("Jaden", "P12345678!", "jaden@gmailcom");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the student email was missing a dot, as intended");
        }

        System.out.println("= Duplicate student name =");

        try {
            new Student("Dupe", "P12345678!", "dupe@gmail.com");
            new Student("Dupe", "P12345678!", "dupe2@gmail.com");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when there were duplicate student names, as intended");
        }

        System.out.println("= resetPassword when name missing =");

        try {
            Student bad = new Student("BadName", "P12345678!", "badname@gmail.com");
            bad.name = "";
            bad.resetPassword();
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when resetPassword was attempted on a blank name, as intended");
        }

        System.out.println("= Assignment Storage Null =");

        Student submit = new Student("Submit", "P12345678!", "submit@gmail.com");

        try {
            submit.assignments = null;
            submit.submitAssignment("HW", "Desc");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the assignment storage was null, as intended");
        }

        System.out.println("= Assignment Limit Reached =");

        try {
            submit.assignments = new Assignment[1];
            submit.submitAssignment("HW", "Desc");
            submit.submitAssignment("HW2", "Desc");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the assignment limit was reached, as intended");
        }

        System.out.println("= Assignment Title Null =");

        try {
            submit.submitAssignment(null, "Desc");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the assignment title was null, as intended");
        }

        System.out.println("= Assignment Title Blank =");

        try {
            submit.submitAssignment("", "Desc");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the assignment title was blank, as intended");
        }

        System.out.println("= Assignment Desciption Null =");

        try {
            submit.submitAssignment("HW", null);
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the assignment description was null, as intended");
        }

        System.out.println("= Assignment Desciption Blank =");

        try {
            submit.submitAssignment("HW", "");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the assignment description was blank, as intended");
        }

        System.out.println("===== STUDENT NAME TEST =====");
        Student nameTest = new Student("TestBoi", "P12345678!", "testboi777@gmail.com");

        System.out.println("= Change name null =");

        try {
            nameTest.changeName(null);
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the student's name was changed to 'null', as intended");
        }

        System.out.println("= Change name blank =");

        try {
            nameTest.changeName("");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the student's name was changed to blank, as intended");
        }

        System.out.println("= Changed name contains '@' =");

        try {
            nameTest.changeName("J@den");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the student's name was changed to new name with an '@', as intended");
        }

        System.out.println("= Changed name to a duplicate =");

        try {
            new Student("Taken", "HiImTaken1111!", "taken@gmail.com");
            nameTest.changeName("Taken");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the student's name was changed to a taken name, as intended");
        }

        System.out.println("===== HUB CLASS TESTER =====");
        // Hub Class Exception Tests

        Hub hub = new Hub();

        System.out.println("= Blank student name =");

        try {
            hub.registerStudent("", "P12345678!", "tester@gmail.com");
            // System.out.println("ERROR: Exception was not expected but not thrown.");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the student name was blank, as intended");
        }

        System.out.println("= Blank student null =");

        try {
            hub.registerStudent(null, "P12345678!", "tester@gmail.com");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the student name was null, as intended");
        }

        System.out.println("= Student email missing '@' =");

        try {
            hub.registerStudent("Test", "P12345678!", "testergmail.com");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the student email was missing an '@', as intended");
        }

        System.out.println("= Password Null =");

        try {
            hub.registerStudent("Test", null, "tester@gmail.com");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the registered student's password was null, as intended");
        }

        System.out.println("= Password Blank =");

        try {
            hub.registerStudent("Test", "", "tester@gmail.com");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the registered student's password was blank, as intended");
        }

        System.out.println("= Email Null =");

        try {
            hub.registerStudent("Test", "P12345678!", null);
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the registered student's email was null, as intended");
        }

        System.out.println("= Email Blank =");

        try {
            hub.registerStudent("Test", "P12345678!", "");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the registered student's email was blank, as intended");
        }

        System.out.println("= Registered Student Name Contains '@' =");

        try {
            hub.registerStudent("Te@st", "P12345678!", "test@gmail.com");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the registered student's name had an '@', as intended");
        }

        System.out.println("= Login Username Null =");

        try {
            hub.loginStudent(null, "P12345678!");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the login username was null, as intended");
        }

        System.out.println("= Login Username Blank =");

        try {
            hub.loginStudent("", "P12345678!");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the login username was blank, as intended");
        }

        System.out.println("= Login Password Null =");

        try {
            hub.loginStudent("Log123", null);
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the login password was null, as intended");
        }

        System.out.println("= Login Password Blank =");

        try {
            hub.loginStudent("Log123", "");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the login password was blank, as intended");
        }

        System.out.println("= Login User Not Found =");

        try {
            hub.loginStudent("Log123", "P12345678!");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the login user was not found, as intended");
        }

        System.out.println("= Login Wrong Password =");

        try {
            Student example = hub.registerStudent("Example", "P12343567!", "coolname@gmail.com");
            hub.loginStudent("Example", "PPPPPPP111!");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the login passward was incorrect, as intended");
        }

        System.out.println("===== ASSIGNMENT CLASS TESTER =====");
        // Assignment Class Exception Tests

        System.out.println("= Null class title =");

        try {
            Assignment a1 = new Assignment(null, "Test description");
            // System.out.println("ERROR: Exception was not expected but not thrown.");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the assignment title was null, as intended");
        }

        System.out.println("= Null class description =");

        try {
            Assignment a2 = new Assignment("Test Class", null);
            // System.out.println("ERROR: Exception was not expected but not thrown.");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the assignment description was null, as intended");
        }
    }
}
