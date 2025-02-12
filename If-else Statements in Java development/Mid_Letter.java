import java.util.Scanner;

public class Mid_Letter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter any word : ");
        String word = input.nextLine();

        if(word.length() % 2 == 0){
            System.out.println("Mid letter is : " + word.charAt(word.length() / 2 - 1));
        } else {
            System.out.println("Mid letter is : " + word.charAt(word.length() / 2));
        }
        input.close();
    }
}
