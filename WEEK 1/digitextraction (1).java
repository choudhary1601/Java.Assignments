import java.util.Scanner;

public class digitextraction {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        int once= number%10;
        int tens= (number/10)%10;
        int hundreds= (number/100)%10;

        System.out.println("Hundreds digit is: "+hundreds);
        System.out.println("Tens digit is: "+tens); 
        System.out.println("Once digit is: "+once);
        
        input.close();
    }
}