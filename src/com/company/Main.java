package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        String firstName; // holds user's first name.
        String lastName; //holds user's last name.
        int age; //holds user's age.
        String address; //holds user's address.
        double test1, test2, test3; //holds user's three test scores.
        double totalTest; //holds the total score of all three tests.
        double average; //holds the average of the three test scores.

        Scanner person = new Scanner(System.in);

        //Gets the user's first name.
        System.out.print("What is your first name? ");
        firstName = person.nextLine();

        //Gets the user's last name.
        System.out.print("What is your last name? ");
        lastName = person.nextLine();

        //Gets the user's address.
        System.out.print("What is your address? ");
        address = person.nextLine();

        //Gets the user's age.
        System.out.print("How old are you? ");
        age = person.nextInt();

        //Gets the user's first test score.
        System.out.print("Enter test score 1: ");
        test1 = person.nextDouble();

        //Gets the user's second test score.
        System.out.print("Enter test score 2: ");
        test2 = person.nextDouble();

        //Gets the user's third test score.
        System.out.print("Enter test score 3: ");
        test3 = person.nextDouble();

        //Displays the user's first name, last name, age, and address.
        System.out.println("Hello, " + firstName + " " + lastName + ". Your age is " + age + " and your address is " + address + ".");

        //Displays the user's first test score.
        System.out.println("Test score 1: " + test1);

        //Displays the user's second test score.
        System.out.println("Test score 2: " + test2);

        //Displays the user's third test score.
        System.out.println("Test score 3: " + test3);

        //Adds the total score of the tests.
        totalTest = test1 + test2 + test3;

        //Divides the total score of the tests by the number of tests scored.
        average = totalTest / 3;

        //Displays the average.
        System.out.println("Test average: " + average);
    }
}
