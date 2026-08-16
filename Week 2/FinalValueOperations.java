import java.util.Scanner;

public class FinalValueOperations {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int X = 0;

        System.out.print("Enter number of operations: ");
        int n = input.nextInt();

        input.nextLine(); // consume leftover newline

        for (int i = 1; i <= n; i++) {

            System.out.print("Enter operation: ");
            String operation = input.nextLine();

            if (operation.contains("+")) {
                X++;
            } 
            else {
                X--;
            }
        }

        System.out.println("Final value of X: " + X);

        input.close();
    }
}