import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int mark = input.nextInt();

        System.out.println(GradingSystem.classifymark(mark));

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        System.out.println(LeapYear.isLeapYear(year));

        MenuCalculator.runCalculator(input);

        System.out.print("Enter the number: ");
        int number= input.nextInt();
        System.out.println(" ");

        System.out.println(prime.isprime(number));
        System.out.println(" ");

        
        System.out.print("Enter first number: ");
        int first = input.nextInt();

        System.out.print("Enter second number: ");
        int second = input.nextInt();

        System.out.println("GCD: " + GreatestCommonDivisor.gcd(first, second));

        System.out.println("enter your number to be reversed");
        int no = input.nextInt();

        System.out.println("here is your number reversed: " + NumberReversal.reverseNumber(no));
        input.close();

        

    }
}