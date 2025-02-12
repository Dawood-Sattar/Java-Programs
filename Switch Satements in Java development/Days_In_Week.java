import java.util.Scanner;

public class Days_In_Week {
    public static void main(String[] args) {
        Scanner day = new Scanner(System.in);

        System.out.print("Enter No of day: ");
        int dayNo = day.nextInt();

        switch (dayNo) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Frida");
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.print("Input Not Valid");
        }

        day.close();
    }
}
