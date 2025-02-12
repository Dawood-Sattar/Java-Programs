import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Factorial Number : ");

        int x = input.nextInt();
        int y = 1;
        for (int i = 0; i < x; x--) {
            y *= x;
        }
        System.out.println("Your Factorial : " + y);

        input.close();
    }
}
