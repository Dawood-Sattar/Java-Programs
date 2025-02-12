import java.util.Scanner;

public class Vowel_Consonant {
    public static void main(String[] args) {
        Scanner identify = new Scanner(System.in);

        System.out.print("Enter the Character : ");
        char inputWord = identify.next().charAt(0);

        if (inputWord == 'a' || inputWord == 'e' || inputWord == 'i' || inputWord == 'o' || inputWord == 'u'
                || inputWord == 'A' || inputWord == 'E' || inputWord == 'I' || inputWord == 'O' || inputWord == 'U') {
            System.out.println("Input Value is Vowel");
        } else {
            System.out.println("Entered Value is Consonant");
        }
        identify.close();
    }
}
