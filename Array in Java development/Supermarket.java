import java.util.Scanner;
import java.util.ArrayList;

public class Supermarket {
    public static void main(String[] args) {
        // Write a program taking user input of buying supermarket items and show thier
        // billing data
        Scanner input = new Scanner(System.in);

        System.out.print("No of Items : ");
        int noOfItem = input.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        int cost =0;

        int i = 0;
        while (i < noOfItem) {
            int j = i + 1;
            System.out.print("Enter Cost of " + j + " item : ");
            int a = input.nextInt();

            list.add(a);
            i++;
        }

        for (int counts: list){
            cost+=counts;
        }
        System.out.println("Net Cost : " + cost);

        input.close();
    }
}
