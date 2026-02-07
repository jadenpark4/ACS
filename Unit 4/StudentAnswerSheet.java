import java.util.ArrayList;

public class StudentAnswerSheet {
    private String name;
    private double testScore;
    private ArrayList<String> answers;

    public StudentAnswerSheet(String name, ArrayList<String> answers) {
        if (name == null || answers == null) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.answers = answers;
        this.testScore = 0.0;
    }

    public String getName() {
        return name;
    }

    public double getTestScore() {
        return testScore;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTestScore(double testScore) {
        this.testScore = testScore;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    public double getGrade(ArrayList<String> key) {
        if (key == null || answers == null) {
            throw new IllegalArgumentException();
        }
        double score = 0.0;
        for (int i = 0; i < key.size(); i++) {
            if (answers.get(i).equals("?")) {
                // no change
            } else if (answers.get(i).equals(key.get(i))) {
                score += 1.0;
            } else {
                score -= 0.25;
            }
        }
        return score;
    }
}
