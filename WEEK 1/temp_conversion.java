import java.util.Scanner;

public class temp_conversion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double C= input.nextFloat();
        double F= ((9.0/5.0)*C)+32;

        System.out.println("Fahrenheit temperature is: "+F);
    input.close();
    }
}