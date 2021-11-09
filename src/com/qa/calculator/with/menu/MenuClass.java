package com.qa.calculator.with.menu;

import java.util.Scanner;

import static com.qa.calculator.with.menu.CalculatorMethods.addition;
import static com.qa.calculator.with.menu.CalculatorMethods.subtraction;
import static com.qa.calculator.with.menu.CalculatorMethods.multiplication;
import static com.qa.calculator.with.menu.CalculatorMethods.division;

public class MenuClass {

    Scanner scanner = new Scanner(System.in);
    boolean menuFlag = true;
    int number1;
    int number2;

    public void startApp() {


        while (menuFlag) {


            System.out.println("-".repeat(50));
            System.out.println("Welcome to the Calculator Application. Please choose an option:");
            System.out.println("*".repeat(50));
            System.out.println("\t1). Addition");
            System.out.println("\t2). Subtraction");
            System.out.println("\t3). Multiplication");
            System.out.println("\t4). Division");
            System.out.println("\t0). Exit");
            System.out.println("*".repeat(50));

            int menuOption = scanner.nextInt();

            switch (menuOption) {
                case 1:
                    System.out.println("Please enter the first number you wish to add:");
                    number1 = scanner.nextInt();
                    System.out.println("Please enter the second number you wish to add:");
                    number2 = scanner.nextInt();
                    System.out.println("The answer is:");
                    System.out.println(addition(number1, number2));
                    break;
                case 2:
                    System.out.println("Please enter the first number you wish to subtract:");
                    number1 = scanner.nextInt();
                    System.out.println("Please enter the second number you wish to subtract:");
                    number2 = scanner.nextInt();
                    System.out.println("The answer is:");
                    System.out.println(subtraction(number1, number2));
                    break;
                case 3:
                    System.out.println("Please enter the first number you wish to multiply:");
                    number1 = scanner.nextInt();
                    System.out.println("Please enter the second number you wish to multiply:");
                    number2 = scanner.nextInt();
                    System.out.println("The answer is:");
                    System.out.println(multiplication(number1, number2));
                    break;
                case 4:
                    System.out.println("Please enter the first number you wish to divide:");
                    number1 = scanner.nextInt();
                    System.out.println("Please enter the second number you wish to divide:");
                    number2 = scanner.nextInt();
                    System.out.println("The answer is:");
                    System.out.println(division(number1, number2));
                    break;
                case 0:
                    System.out.println("Exiting...");
                    menuFlag = false;
                    break;
                default:
                    System.out.println("Please try again.");
            }
        }
        scanner.close();
    }



}
