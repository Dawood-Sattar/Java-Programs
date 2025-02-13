import java.util.Scanner;

public class Palindrome_One {
    public static void main(String[] args) {

        System.out.print("Enter Word : ");
        Scanner input = new Scanner(System.in);

        String originalStr = input.next();
        String reversedStr = "";

        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }

        String b = reversedStr;
        String a = originalStr;

        String x = a.toLowerCase();
        String y = b.toLowerCase();

        if (x.equals(y)) {
            System.out.println("Your Word is Palendrome");
        } else {
            System.out.print("Word is not Palendrome");
        }
        input.close();
    }
}
