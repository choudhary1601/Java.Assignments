import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double principal = input.nextDouble();
        double rate = input.nextDouble();
        double time = input.nextDouble();

        double simpleInterest = principal * rate * time / 100;
        System.out.println("Simple interest is: " + simpleInterest);

        double finalAmount = principal + simpleInterest;
        System.out.println("Final amount is: " + finalAmount);
        input.close();


    }
    
}