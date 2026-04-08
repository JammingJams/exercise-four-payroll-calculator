package com.pluralsight;

import java.util.Scanner;

public class PayRollCalculatorApp {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String firstName = keyboard.nextLine();

        System.out.print("Enter amount of hours worked: ");
        double hoursWorked = keyboard.nextDouble();

        System.out.print("Enter pay rate: ");
        double payRate = keyboard.nextDouble();

        double grossIncome = payRate * hoursWorked;

        if (hoursWorked > 40) {
            System.out.printf("Your name is %s and your BONUS gross income is $%.2f", firstName, grossIncome * 1.5);
        }
        else {
            System.out.printf("Your name is %s and your gross income is $%.2f", firstName, grossIncome);
        }


    }
}
