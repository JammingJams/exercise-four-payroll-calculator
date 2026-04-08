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

        System.out.printf("Your name is %s and your gross income is $%.2f", firstName, hoursWorked * payRate);



    }
}
