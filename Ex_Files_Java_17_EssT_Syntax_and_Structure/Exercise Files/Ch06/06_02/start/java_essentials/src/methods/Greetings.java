package methods;

import java.util.Scanner;

/*
 * OUR FIRST METHOD
 * Write a method that greets a user by name.
 */
public class Greetings {

    public static void main(String args[]){

    }

    public static void greetUser(){
        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hi there, " + name);
    }
}

