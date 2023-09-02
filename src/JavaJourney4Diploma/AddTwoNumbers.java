package JavaJourney4Diploma;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
        scanner.close();

        // Credits
        /*
           This program was created by Prayangshu Biswas.
           Date: 09.03.2023
        */
    }
}
