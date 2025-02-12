package Formulas;

import java.util.Scanner;

public class ThirdEquationOfMotion {
    public static void main(String[] args) {

        Scanner distance = new Scanner(System.in);

        System.out.print("Vi : ");
        int Vi = distance.nextInt();

        System.out.print("a : ");
        int a = distance.nextInt();

        System.out.print("t : ");
        int t = distance.nextInt();

        double formula = Math.sqrt(Math.pow(Vi, 2) + a * t);

        System.out.println("Square of Vf : " + formula);
        distance.close();
    }
}
