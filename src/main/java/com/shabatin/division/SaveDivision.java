package main.java.com.shabatin.division;

import java.util.Scanner;

public class SaveDivision {

    private final Scanner scanner = new Scanner(System.in);

    public void start() {

        System.out.print("Enter first integer: ");
        int a = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int b = 0;
        double result = 0;

        while (b == 0) {
            b = scanner.nextInt();
            try {
                result = a / b;
            } catch (ArithmeticException arithmeticException) {
                System.out.println("It's ZERO! You can't divide by Zero");
                System.out.print("And now, Enter second number ");
            }
        }
        System.out.println("Division of two integers is " + result);
    }
}
