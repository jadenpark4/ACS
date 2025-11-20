public class Course {
    // instance variables
    private String courseName;
    private StudentRecord[] enrolledStudents;

    // constructors
    public Course(String courseName, StudentRecord[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    // getters
    // to-do: implement getters
    public String getCourseName() {
        return courseName;
    }

    public StudentRecord[] getEnrolledStudents() {
        return enrolledStudents;
    }

    // setters
    // to-do: implement setters
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setEnrolledStudents(StudentRecord[] enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    // inherited methods

    // to-do: implement toString
    @Override
    public String toString() {
        String output = "== " + courseName + " ==\n";
        for (int i = 0; i < enrolledStudents.length; i++) {
            output += (i + 1) + ".) " + enrolledStudents[i].toString() + "\n";
        }
        return output;
    }

    // methods

    /*
     * Iterates through the enrolledStudents array and returns the name of the
     * student with the best final average.
     * 
     * @return the name of the student with the best final average
     */
    // to-do: implement findBestStudent
    public String findBestStudent() {
        double bestAvg = -1;
        String bestName = "";

        for (StudentRecord sr : enrolledStudents) {
            double avg = sr.getFinalAverage();
            if (avg > bestAvg) {
                bestAvg = avg;
                bestName = sr.getName();
            }
        }
        return bestName;
    }

    /*
     * Iterates through the enrolledStudents array and returns the average of the
     * specified test number.
     * 
     * @return a double representing the average of the specified test number
     */
    // to-do: implement calculateTestAverage

    public double calculateTestAverage(int testNumber) {
        double sum = 0;
        int count = 0;

        for (StudentRecord sr : enrolledStudents) {
            int score = sr.getTestScore(testNumber);
            if (score != -1) {
                sum += score;
                count++;
            }
        }
        if (count == 0) {
            return 0.0;
        }
        return sum / count;
    }

}
