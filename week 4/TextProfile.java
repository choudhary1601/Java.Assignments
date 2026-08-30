class Profile {
    private String name;
    private int age;
    private double heightMetres;

    Profile(String name, int age, double heightMetres) {
        if (name.trim().isEmpty() || age < 0 || heightMetres <= 0) {
            throw new IllegalArgumentException("Invalid data");
        }

        this.name = name;
        this.age = age;
        this.heightMetres = heightMetres;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    double getHeightMetres() {
        return heightMetres;
    }

    public String toString() {
        return name + " " + age + " " + heightMetres;
    }
}

public class TextProfile {
    public static void main(String[] args) {

        String name = args[0];
        int age = Integer.parseInt(args[1]);
        double height = Double.parseDouble(args[2]);

        Profile p = new Profile(name, age, height);

        System.out.println(p);
        System.out.println("Age as String: " + Integer.toString(age));
    }
}
