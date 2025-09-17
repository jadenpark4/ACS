public class Student {
    private String name;
    private String id;
    private int grade;

    // Constructors

    public Student(String name, int grade) {
        this.grade = grade;
        this.name = name;
        this.id = generateId();
    }
    
    public Student(String name) {
        this.grade = 10;
        this.name = name;
        this.id = generateId();
    }

    // Getters and setters
    public int getGrade() {
        return grade;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int setGrade(int grade) {
        this.grade = grade;
        return grade;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Methods

    public boolean equals(Student other) {
        if (this.name.equals(other.name)
            && this.grade == other.grade
            && this.id.equals(other.id)
            ) {
            return true;
        }
        return false;
    }

    public String generateId() {
        int num1 = (int) (Math.random() * 8) + 1;
        int num2 = (int) (Math.random() * 8) + 1;
        int num3 = (int) (Math.random() * 8) + 1;
        int num4 = (int) (Math.random() * 10);
        int num5 = (int) (Math.random() * 10);
        int num6 = (int) (Math.random() * 10);
        int num7 = (int) (Math.random() * 10);
        String idText = "" + num1 + num2 + num3 + "-" + num4 + num5 + num6 + num7;
        return idText;
    }

    public String toString() {
        return name
            + " is a " + grade
            + "th grade student. Their id is " + id
            + ".";
    }


}
