public class StudentRecord {
    // instance variables
    private String name;
    private int[] scores;

    // constructors
    public StudentRecord(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    // getters
    // to-do: implement getters

    
    // to-do: implement getTestScore
    public String getName() {
        return name;
    }

    public int[] getScores() {
        return scores;
    }

    public int getTestScore(int testNumber) {
        if (testNumber < 0 || testNumber >= scores.length) {
            return -1;
        }
        return scores[testNumber];
    }

    // inherited methods
    // to-do: implement toString
    @Override
    public String toString() {
        String s = "[";
        for (int i = 0; i < scores.length; i++) {
            s += scores[i];
            if (i < scores.length - 1) {
                s += ", ";
            }
        }
        s += "]";
        return name + "'s scores: " + s;
    }
    // methods

    public boolean equals(StudentRecord other) {
        if (this.name.equals(other.name)
            && this.scores == other.scores) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * returns the average (arithmetic mean) of the values in scores
     * precondition: 0 <= first < last < scores.length
     * 
     * @param first - the first index of the scores array
     * 
     * @param last - the last index of the scores array
     * 
     * @return the double average of the values in scores
     */
    public double getAverage(int first, int last) {
        double sum = 0;
        for (int i = first; i <= last; i++) {
            sum += scores[i];
        }
        return sum / (last - first + 1);
    }

    /*
     * Determines if each successive value in scores is greater
     * than or equal to the previous value
     * 
     * @return true if student has improved, false otherwise
     */
    public boolean hasImproved() {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[i - 1]) {
                return false;
            }
        }
        return true;
    }

    /*
     * The method determines if the student has improved and returns the average
     * score appropriately:
     * If the student has improved, returns the average
     * of the top half of the scores array.
     * Otherwise, returns the average of all of the values in scores
     * 
     * @return the double average of test scores
     */

    public double getFinalAverage() {
        if (hasImproved()) {
            int start = scores.length / 2;
            return getAverage(start, scores.length - 1);
        }
        return getAverage(0, scores.length - 1);
    }
}