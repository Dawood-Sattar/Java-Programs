package Formulas;

import java.util.Scanner;

public class GravitationalForce {
    public static void main(String[] args) {
        Scanner force = new Scanner(System.in);

        System.out.print("Enter the value of m1 :");
        double m1 = force.nextDouble();

        System.out.print("Enter the value of m2 :");
        double m2 = force.nextDouble();

        System.out.print("Enter distance between two bodies r :");
        double r = force.nextDouble();

        double F = 6.67 * Math.pow(10, -11) * ((m1 * m2) / (r * r));
        System.out.println("Force between two bodies is : " + F);

        force.close();
    }
}
