package Formulas;

import java.util.Scanner;

public class SecondEquationOfMotion {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.print(" Vi : ");
        int Vi = value.nextInt();

        System.out.print(" t :");
        int t = value.nextInt();

        System.out.print(" a : ");
        int a = value.nextInt();

        double formula = Vi * t + 0.5 * a * (t * t);
        System.out.println(" Distance : " + formula);

        value.close();
    }
}
