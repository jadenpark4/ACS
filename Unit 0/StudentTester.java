public class StudentTester {
    public static void main(String[] args) {
        Student student1 = new Student("Haru", 10); // Name: Haru, Grade: 10
        Student student2 = new Student("Fred", 11);
        Student student3 = new Student("Sully");
        Student student4 = new Student("Logan");

        System.out.println(student1.toString()); // print name, grade, and id
        System.out.println(student2.toString()); // print name, grade, and id
        System.out.println(student3.toString()); // print name, grade, and id
        System.out.println(student4.toString()); // print name, grade, and id
        
        System.out.println("Logan moved up to the " + student1.setGrade(11) + "th grade.");

        if (student1.equals(student2)) {
            System.out.println(student1.getName()
                + " and " + student2.getName() + " are equal.");
        } else {
            System.out.println(student1.getName()
                + " and " + student2.getName() + " are NOT equal.");
        }
    }
}
