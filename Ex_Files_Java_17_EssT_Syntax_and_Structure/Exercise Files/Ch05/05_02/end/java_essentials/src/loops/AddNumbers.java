package loops;

import java.util.Scanner;

/*
 * DO WHILE LOOP:
 * Write a program that allows a user to enter two numbers,
 * and then sums up the two numbers. The user should be able to
 * repeat this action until they indicate they are done.
 */
public class AddNumbers {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        int runAgain = 0;

        do{
            System.out.println("Enter the first number");
            double number1 = scanner.nextDouble();

            System.out.println("Enter the second number");
            double number2 = scanner.nextDouble();

            double sum = number1 + number2;
            System.out.println("The sum is " + sum);

            System.out.println("Would you like to start over? Enter 1 for yes, 2 for no.");
            runAgain = scanner.nextInt();

        }while(runAgain == 1);

        scanner.close();
    }
}