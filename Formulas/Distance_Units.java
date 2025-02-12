package Formulas;
import java.util.Scanner;
public class Distance_Units {
    
    // Write a Java program that converts Kilometers into Miles, Cm, m and feet.
    public static void main(String[ ] args){
        Scanner converter = new Scanner(System.in);

        System.out.print("Enter No in In Kilometer:");
        int inputNo = converter.nextInt();

        System.out.println("km to m : " + inputNo*1000);
        System.out.println("km to cm : " + inputNo*100000);
        System.out.println("km to miles : " + inputNo*0.621371);
        System.out.println("km to feet : " + inputNo*3280.84 );

        converter.close();
    }
}
