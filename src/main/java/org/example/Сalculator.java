package org.example;

import java.util.Scanner;

public class Сalculator {

    public static void main(String[] args) {
        int firstNum = 0;
        int secondNum = 0;
        String operation = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        while (true) {
            try {
                firstNum = scanner.nextInt();
                break;
            } catch (RuntimeException ex) {
                System.out.println("Please enter correct value");
                scanner.nextLine();
            }
        }
        System.out.println("Please enter second number");
        while (true) {
            try {
                secondNum = scanner.nextInt();
                break;
            } catch (RuntimeException ex) {
                System.out.println("Please enter correct value");
                scanner.nextLine();
            }

        }
        System.out.println("Please enter operation which you do ( +, -, /, *)");
        while (true) {
            operation = scanner.next();
            switch (operation) {
                case "+" -> System.out.print(firstNum + secondNum);
                case "-" -> System.out.print(firstNum - secondNum);
                case "/" -> System.out.print(firstNum / secondNum);
                case "*" -> System.out.print(firstNum * secondNum);
                default -> {
                    System.out.print("Invalid value, please enter correct value\n");
                    scanner.nextLine();
                }
            }

        }

    }
}