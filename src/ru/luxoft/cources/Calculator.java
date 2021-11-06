package ru.luxoft.cources;

import java.util.Scanner;

public class Calculator {
    private Scanner scanner;

    public Calculator() {
        this.scanner = new Scanner(System.in);
    }

    public void Calculate() {
        int firstNumber = 0;
        int secondNumber = 0;
        String userInput = "";

        boolean goFinish = true;
        while (goFinish) {
            if (scanner.hasNextInt()) firstNumber = scanner.nextInt();
            if (scanner.hasNextInt()) secondNumber = scanner.nextInt();
            if (scanner.hasNext()) userInput = scanner.nextLine();

            double result = 0;
            switch (userInput.trim()) {
                case "q":
                    goFinish = false;
                    break;
                case "+":
                    result = plus(firstNumber, secondNumber);
                    break;
                case "-":
                    result = minus(firstNumber, secondNumber);
                    break;
                case "*":
                    result = multiply(firstNumber, secondNumber);
                    break;
                case "/":
                    if (secondNumber != 0) {
                        result = divide(firstNumber, secondNumber);
                    }
                    break;
                case "!":
                    result = fact(firstNumber);
                    break;
                default:
                    result = 0;
                    break;
            }
            if (goFinish) System.out.println(result);
        }
    }

    private static int plus(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    private static int minus(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }

    private static int multiply(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }

    private static int divide(int numberOne, int numberTwo) {
        return numberOne / numberTwo;
    }

    private static int fact(int numberOne) {
        int rez = 1;
        for (int i = 1; i <= numberOne; i++) rez *= i;
        return rez;
    }
}
