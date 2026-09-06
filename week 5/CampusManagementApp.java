class Student {

    String name;

    Student(String name) {
        this.name = name;
    }

    // Method overloading
    void display() {
        System.out.println("Student Name: " + name);
    }

    void display(String course) {
        System.out.println("Student Name: " + name);
        System.out.println("Course: " + course);
    }

    void display(String course, int marks) {
        System.out.println("Student Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
    }
}


public class CampusManagementApp {

    public static void main(String[] args) {

        System.out.println("CAMPUS REGISTRY");
        System.out.println("----------------");

        Student s = new Student("Roma");

        s.display();

        s.display("Computer Science");

        s.display("Java", 85);
    }
}