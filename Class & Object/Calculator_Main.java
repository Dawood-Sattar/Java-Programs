import java.util.Scanner;

class Calculation {

    void Multiply(double a, double b) {
        System.out.println("Multiplication = " + (a * b));
    }

    void Divide(double a, double b) {

        System.out.println("Divid = " + (a / b));
    }

    void Add(double a, double b) {
        System.out.println("Add" + (a + b));
    }

}

public class Calculator_Main {
    public static void main(String[] args) {

        Calculation object = new Calculation();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1 for Multiplication: 2 for Addition : 3 for Division : ");
        int Choosen = input.nextInt();
        switch (Choosen) {
            case 1:
                System.out.print("Enter first numbers : ");
                double a = input.nextDouble();
                System.out.print("Enter second numbers : ");
                double b = input.nextDouble();
                object.Multiply(a, b);
                break;
            case 2:
                System.out.print("Enter first numbers : ");
                double x = input.nextDouble();
                System.out.print("Enter second numbers : ");
                double y = input.nextDouble();
                object.Add(x, y);
                break;
            case 3:
                System.out.print("Enter first numbers : ");
                double n = input.nextDouble();
                System.out.print("Enter second numbers : ");
                double m = input.nextDouble();
                object.Multiply(n, m);
                break;

            default:
                System.out.println("Invalid Input");
                break;
        }
        input.close();
    }
}