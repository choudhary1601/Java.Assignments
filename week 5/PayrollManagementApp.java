class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }

    // Method overloading
    void display() {
        System.out.println("Employee Name: " + name);
    }

    void display(double salary) {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }

    void display(double salary, int bonus) {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
    }
}


public class PayrollManagementApp {

    public static void main(String[] args) {

        System.out.println("PAYROLL MANAGEMENT");
        System.out.println("------------------");

        Employee e = new Employee("Roma");

        e.display();

        e.display(30000);

        e.display(30000, 5000);
    }
}