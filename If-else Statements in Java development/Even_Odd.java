import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        // Detect Even Odd and Prime number
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even number.");
        } else {
            System.out.println("Odd number.");
        }
        input.close();
    }
}
