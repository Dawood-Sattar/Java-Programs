import java.util.Scanner;

public class Currency_Converter {
    public static void main(String[] args) {

        Scanner currency = new Scanner(System.in);

        System.out.println("Choose a Number; ");

        System.out.print(
                "1. Dollar to rupees : 2. Rupees to Dollar : 3. Euro to Rupees : 4. Rupees to Euro : 5. Yen to Rupee : 6. Rupee to Yen :");
        int n = currency.nextInt();

        switch (n) {
            case 1:
                System.out.print("Enter the amount in Dollars '$' : ");
                double a = currency.nextDouble();
                System.out.println("Your amount in Rupees : " + (a * 280) + " Rs");
                break;

            case 2:
                System.out.print("Enter the amount in Rupees 'Rs' : ");
                double b = currency.nextDouble();
                System.out.println("Your amount in Dollars : " + (b / 280) + " $");
                break;

            case 3:
                System.out.print("Enter the amount in Euro '€' : ");
                double c = currency.nextDouble();
                System.out.println("Your amount in Rupees : " + (c * 293) + " Rs");
                break;

            case 4:
                System.out.print("Enter the amount in Rupees 'Rs' : ");
                double d = currency.nextDouble();
                System.out.println("Your amount in  Euro : " + (d / 293) + " €");
                break;

            case 5:
                System.out.print("Enter the amount in Yen '¥' : ");
                double e = currency.nextDouble();
                System.out.println("Your amount in Rupees : " + (e * 1.80) + " Rs");
                break;

            case 6:
                System.out.print("Enter the amount in Rupees 'Rs' : ");
                double f = currency.nextDouble();
                System.out.println("Your amount in Yen : " + (f / 1.80) + " ¥");
                break;

            default:
                System.out.println("Input No is not Valid");
        }
        currency.close();
    }
}
