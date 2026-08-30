class Course {
    private String code;
    private String title;
    private int capacity;
    private int enrolled;

    Course(String code, String title, int capacity) {
        this.code = code;
        this.title = title;

        if (capacity > 0)
            this.capacity = capacity;
        else
            this.capacity = 1;

        enrolled = 0;
    }

    boolean enroll() {
        if (enrolled < capacity) {
            enrolled++;
            return true;
        }
        return false;
    }

    boolean withdraw() {
        if (enrolled > 0) {
            enrolled--;
            return true;
        }
        return false;
    }

    boolean isFull() {
        return enrolled == capacity;
    }

    int getAvailableSeats() {
        return capacity - enrolled;
    }

    public String toString() {
        return code + " " + title + " Enrolled: "
                + enrolled + "/" + capacity;
    }
}

public class CourseEnrollment {
    public static void main(String[] args) {

        Course c = new Course("C101", "Java", 3);

        System.out.println(c);
        System.out.println(c.enroll());
        System.out.println(c.enroll());
        System.out.println(c.getAvailableSeats());

        System.out.println(c.enroll());
        System.out.println(c.isFull());

        System.out.println(c.enroll());

        System.out.println(c.withdraw());
        System.out.println(c.getAvailableSeats());

        c.withdraw();
        c.withdraw();

        System.out.println(c.withdraw());
    }
}
