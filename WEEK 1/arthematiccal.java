import java.util.Scanner; 

public class arthematiccal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("enter first numbers: ");
        int a = input.nextInt();
        System.out.println("enter second number: ");
        int b = input.nextInt();

        
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        input.close(); 
    }
    
}
