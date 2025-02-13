import java.util.Scanner;
import java.util.ArrayList;

public class Palindrome_Two {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Character> reverseString = new ArrayList<>();
        ArrayList<Character> actualString = new ArrayList<>();

        System.out.print("Enter the Word : ");
        String userword = input.nextLine();
        String word = userword.toLowerCase();

        for (int i = word.length() - 1; i >= 0; --i) {
            reverseString.add(word.charAt(i));
        }

        for (int j = 0; j < word.length(); j++) {
            actualString.add(word.charAt(j));
        
        }

        // == Operator checks for reference equality not content equality 
        if(reverseString.equals(actualString)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }

        input.close();
    }

}
