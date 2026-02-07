import java.util.ArrayList;

public class TestRunner {

    public static void main(String[] args) {

        // -------------------------------
        // Create the answer key
        // -------------------------------
        ArrayList<String> key = new ArrayList<>();
        key.add("A");
        key.add("C");
        key.add("D");
        key.add("E");
        key.add("B");
        key.add("C");
        key.add("E");
        key.add("B");
        key.add("B");
        key.add("C");

        // -------------------------------
        // Create student answer sheets
        // -------------------------------
        ArrayList<String> answers1 = new ArrayList<>();
        answers1.add("A");
        answers1.add("B");
        answers1.add("D");
        answers1.add("E");
        answers1.add("A");
        answers1.add("C");
        answers1.add("?");
        answers1.add("B");
        answers1.add("D");
        answers1.add("C");

        StudentAnswerSheet s1 = new StudentAnswerSheet("Alice", answers1);

        ArrayList<String> answers2 = new ArrayList<>();
        answers2.add("A");
        answers2.add("C");
        answers2.add("D");
        answers2.add("E");
        answers2.add("B");
        answers2.add("C");
        answers2.add("E");
        answers2.add("B");
        answers2.add("B");
        answers2.add("C");

        StudentAnswerSheet s2 = new StudentAnswerSheet("Bob", answers2);

        // -------------------------------
        // Create TestResults object
        // -------------------------------
        ArrayList<StudentAnswerSheet> submissions = new ArrayList<>();
        TestResults results = new TestResults(key, submissions);

        // Submit students
        results.submit(s1);
        results.submit(s2);

        // -------------------------------
        // Grade tests
        // -------------------------------
        results.gradeTests();

        // -------------------------------
        // Print results
        // -------------------------------
        for (StudentAnswerSheet s : results.getSubmissions()) {
            System.out.println(s.getName() + " score: " + s.getTestScore());
        }

        // -------------------------------
        // Highest scoring student
        // -------------------------------
        System.out.println("Highest scoring student: " +
                results.highestScoringStudent());
    }
}