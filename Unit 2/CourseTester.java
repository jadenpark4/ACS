public class CourseTester {
    public static void main(String[] args) {
        int[] scores1 = {90, 89, 91, 95};
        StudentRecord ana = new StudentRecord("Ana", scores1);
        ana.toString().equals("Ana's scores: [90, 89, 91, 95]");
        System.out.println(ana.getAverage(0, 3));
        System.out.println(ana.getTestScore(1));
    }
}
