import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner calculator = new Scanner(System.in);

        System.out.print("Enter One of these Operators (+ , - , * , / ,%) =");
        char operators = calculator.next().charAt(0);

        System.out.print("Enter First Number:");
        double firstNumber = calculator.nextDouble();

        System.out.print("Enter Second Number:");
        double secondNumber = calculator.nextDouble();

        switch (operators) {
            case '+':
                System.out.println("Addition:" + (firstNumber + secondNumber));
                break;
            case '-':
                System.out.println("Subtraction:" + (firstNumber - secondNumber));
                break;
            case '*':
                System.out.println("Multiplication:" + (firstNumber * secondNumber));
                break;
            case '/':
                System.out.println("Division:" + (firstNumber / secondNumber));
                break;
            case '%':
                System.out.println("Remainder:" + (firstNumber % secondNumber));
                break;
            default:
                System.out.println("Invalid Operator");
        }

        calculator.close();
    }
}
