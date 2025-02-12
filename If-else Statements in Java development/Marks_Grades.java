import java.util.Scanner;

public class Marks_Grades {
    public static void main(String[] args) {
        Scanner percentage = new Scanner(System.in);

        // Q.1 Calculate the percentage of 5 subjects by taking input from the user with
        // scanner class and printing the percentage

        System.out.print("Math Score:");
        int math = percentage.nextInt();

        System.out.print("Science Score:");
        int science = percentage.nextInt();

        System.out.print("English Score:");
        int english = percentage.nextInt();

        System.out.print("Computer Score:");
        int computer = percentage.nextInt();

        System.out.print("Physics Score:");
        int physics = percentage.nextInt();

        float sum = (math + computer + physics + english + science);

        float percent = (sum / 500) * 100;
        System.out.println("Percentage:" + percent);

        if (percent >= 90) {
            System.out.println("You are Awarded with A+ Certificate");
        } else if (percent >= 80) {
            System.out.println("You are Awarded with A Certificate");
        } else if (percent >= 70) {
            System.out.println("You are Awarded with B Certificate");
        } else if (percent >= 60) {
            System.out.println("You are Awarded with C Certificate");
        } else {
            System.out.println("You are Awarded with Fail Certificate");
        }
        percentage.close();
    }
}
