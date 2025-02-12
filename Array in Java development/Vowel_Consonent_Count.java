import java.util.ArrayList;

public class Vowel_Consonent_Count {
    public static void main(String[] args) {

        ArrayList<Character> vowels = new ArrayList<>();
        ArrayList<Character> consonant = new ArrayList<>();

        String input = "Java Programming";

        for (int i = 0; i < input.length(); i++) {

            char a = input.charAt(i);

            if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O'
                    || a == 'U') {
                vowels.add(a);

            } else if (Character.isLetter(a)) {
                consonant.add(a);
            }
        }

        System.out.println("Vowels : " + vowels.size() + "Consonants : " + consonant.size());
    }
}
