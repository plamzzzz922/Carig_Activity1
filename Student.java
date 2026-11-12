public class Student {
    private String name;
    private String studentId;
    private double grade;

    public Student(String name, String studentId, double grade) {
        this.name = name;
        this.studentId = studentId;
        this.grade = grade;
    }

    public String getName() { return name; }
    public String getStudentId() { return studentId; }
    public double getGrade() { return grade; }

    public void setGrade(double grade) { this.grade = grade; }

    public void displayInfo() {
        System.out.println("Name: " + name + " | ID: " + studentId + " | Grade: " + grade);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Gielyn Anne Viluan", "2026-001", 85.0);
        Student s2 = new Student("Maru Joaquin Carig", "2026-002", 88.5);

        s1.setGrade(92.0);

        s1.displayInfo();
        s2.displayInfo();
    }
}