package Formulas;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);

        System.out.print("Consumer Name : ");
        String name = bill.next();

        System.out.print("Consumer Number : ");
        Long consumerNo = bill.nextLong();

        System.out.print("Previous Month Reading : ");
        double preMR = bill.nextDouble();

        System.out.print("Current Month Reading : ");
        double curMR = bill.nextDouble();

        double billDifference = curMR - preMR;

        if (billDifference >= 101 && billDifference <= 200) {

            System.out.print("Enter Data 'c' for commercial or 'd' for Domestic : ");
            char input = bill.next().charAt(0);

            switch (input) {
                case 'c':
                    double commercial = billDifference * 4.5;
                    System.out.println("Name : " + name);
                    System.out.println("Consumer No : " + consumerNo);
                    System.out.println("Bill Amount: " + commercial + "Rs");
                    System.out.println("Bill Type is Commercial");
                    break;
                case 'd':
                    double domestic = billDifference * 2.5;
                    System.out.println("Name : " + name);
                    System.out.println("Consumer No : " + consumerNo);
                    System.out.println("Bill : " + domestic);
                    System.out.println("Bill Type is Domestic");
                    break;
            }
        } else if (billDifference >= 201 && billDifference <= 500) {
            System.out.print("Enter Data 'c' for commercial or 'd' for Domestic : ");
            char input = bill.next().charAt(0);

            switch (input) {
                case 'c':
                    double commercial = billDifference * 6;
                    System.out.println("Name : " + name);
                    System.out.println("Consumer No : " + consumerNo);
                    System.out.println("Bill : " + commercial);
                    System.out.println("Bill Type is Commercial");
                    break;
                case 'd':
                    double domestic = billDifference * 4;
                    System.out.println("Name : " + name);
                    System.out.println("Consumer No : " + consumerNo);
                    System.out.println("Bill : " + domestic);
                    System.out.println("Bill Type is Domestic");
                    break;
            }
        } else if (billDifference >= 1 && billDifference <= 100) {
            System.out.print("Enter Data 'c' for commercial or 'd' for Domestic : ");
            char input = bill.next().charAt(0);

            switch (input) {
                case 'c':
                    double commercial = billDifference * 2;
                    System.out.println("Name : " + name);
                    System.out.println("Consumer No : " + consumerNo);
                    System.out.println("Bill : " + commercial);
                    System.out.println("Bill Type is Commercial");
                    break;
                case 'd':
                    double domestic = billDifference * 1;
                    System.out.println("Name : " + name);
                    System.out.println("Consumer No : " + consumerNo);
                    System.out.println("Bill : " + domestic);
                    System.out.println("Bill Type is Domestic");
                    break;
            }
        } else {
            System.out.print("Enter Data 'c' for commercial or 'd' for Domestic : ");
            char input = bill.next().charAt(0);

            switch (input) {
                case 'c':
                    double commercial = billDifference * 7;
                    System.out.println("Name : " + name);
                    System.out.println("Consumer No : " + consumerNo);
                    System.out.println("Bill : " + commercial);
                    System.out.println("Bill Type is Commercial");
                    break;
                case 'd':
                    double domestic = billDifference * 6;
                    System.out.println("Name : " + name);
                    System.out.println("Consumer No : " + consumerNo);
                    System.out.println("Bill : " + domestic);
                    System.out.println("Bill Type is Domestic");
                    break;
            }
        }
        bill.close();
    }
}
