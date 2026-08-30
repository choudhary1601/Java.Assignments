public class StudentRecord {

    private String studentId;
    private int marks;
    private String name;

    public StudentRecord(String studentId, int marks, String name) {

        if (name == null || studentId == null || marks < 0 || marks > 100) {
            System.out.println("Invalid record");
            return;
        }

        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }

    public String getStudentId() {
        return studentId;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        StudentRecord s1 = new StudentRecord("25csu201", 100, "Roma");

        s1.setMarks(100);

        System.out.println(s1.getMarks());
    }
}