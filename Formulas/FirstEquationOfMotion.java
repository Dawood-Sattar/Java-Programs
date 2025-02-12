package Formulas;

import java.util.Scanner;

public class FirstEquationOfMotion {
    public static void main(String[] args) {
        Scanner vf = new Scanner(System.in);

        System.out.print("vi : ");
        int vi = vf.nextInt();

        System.out.print("a : ");
        int a = vf.nextInt();

        System.out.print("t : ");
        int t = vf.nextInt();

        double formula = vi + (a * t);
        System.out.println("Vf : " + formula);

        vf.close();
    }
}
