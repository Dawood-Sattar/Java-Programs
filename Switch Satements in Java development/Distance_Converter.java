import java.util.Scanner;

public class Distance_Converter {
    public static void main(String[] args) {
        Scanner unit = new Scanner(System.in);

        System.out.print("Enter Any Value:");
        int inputNo = unit.nextInt();

        System.out.print("Enter Unit km , m, miles =");
        String unitType = unit.next();

        switch (unitType) {
            case "m":
                System.out.println("Value in m : " + inputNo * 1000);
                break;
            case "km":
                System.out.println("Value in km : " + inputNo);
                break;
            case "miles":
                System.out.println("Value in miles : " + inputNo * 0.621371);
                break;
            default:
                System.out.println("Invalid Input");
        }
        unit.close();
    }
}
