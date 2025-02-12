package Formulas;

import java.util.Scanner;

public class StudentPresentAbsent {
    public static void main(String[] args) {
        /*
         * Q1. Write a program calculating the no of students present in a class
         * [Dialy], absent in a class [daily]
         * and who are not attending classes
         */

        Scanner present = new Scanner(System.in);

        System.out.print("Total Student:");
        int totalStudents = present.nextInt();

        System.out.print("Students Present Today:");
        int presentStudents = present.nextInt();

        double absent = totalStudents - presentStudents;
        System.out.print("Students Absent Today:" + absent);

        present.close();
    }
}
