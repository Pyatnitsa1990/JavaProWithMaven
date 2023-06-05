package org.example;

import java.util.Scanner;

public class Сalculator {
    private static final String ALLOW_OPERATORS = "+-*/";

    public static void main(String[] args) {
        calculate();

    }

    public static void calculate() {
        System.out.println("Please enter following expression [num1 operation num2] where operations is +-*/ and separator must be space ");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String[] operators = scanner.nextLine().split(" ");
            if ("Q".contains(operators[0])) {
                break;
            }
            if (invalid(operators))
                continue;

            int num1 = Integer.parseInt(operators[0]);
            int num2 = Integer.parseInt(operators[2]);

            switch (operators[1]) {
                case "+" -> System.out.println(num1 + num2);
                case "-" -> System.out.println(num1 - num2);
                case "/" -> System.out.println(num1 / num2);
                case "*" -> System.out.println(num1 * num2);
            }
        }
    }

    private static boolean invalid(String[] operators) {

        if (operators.length != 3) {
            System.out.println("must 3 elements");
            return true;
        }

        if (parseStringToInteger(operators[0]) == null || parseStringToInteger(operators[2]) == null) {
            System.out.println("one of the nums is invalid");
            return true;
        }

        if (!ALLOW_OPERATORS.contains(operators[1])) {
            System.out.println("contains invalid operations allowed only +-*/");
            return true;
        }
        return false;
    }

    private static Integer parseStringToInteger(String num) {
        Integer result = null;
        try {
            result = Integer.valueOf(num);
        } catch (RuntimeException ex) {
            //System.err.println("Please enter correct value");
        }
        return result;
    }


}