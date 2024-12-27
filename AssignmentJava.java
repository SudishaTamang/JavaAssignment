package basic;

import java.util.Scanner;

public class AssignmentJava {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println(
                    "1. Check if a number is positive, negative, or zero\n" +
                            " 2. Determine if a number is even or odd\n" +
                            "3. Display numbers from 1 to a given number\n" +
                            "4. Display Fibonacci series up to a given number\n" +
                            "5. Exit\n"+
                            "Enter a number:"
            );
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Please enter a number:");
                    int n1 = scanner.nextInt();
                    if (n1 > 0) {
                        System.out.println("The number is positive.");
                    } else if (n1 < 0) {
                        System.out.println("The number is negative.");
                    } else {
                        System.out.println("The number is zero.");
                    }
                    break;
                case 2:
                    System.out.println("Please enter a number:");
                    int n2 = scanner.nextInt();
                    if (n2 % 2 == 0) {
                        System.out.println("The number is even.");
                    } else {
                        System.out.println("The number is odd.");
                    }
                    break;

                case 3:
                    System.out.println("Please enter a number:");
                    int n3 = scanner.nextInt();
                    while (n3 > 0) {
                        System.out.println(n3);
                        n3 = n3 - 1;
                    }
                    break;

                case 4:
                    System.out.println("Please enter a number:");
                    int n4 = scanner.nextInt();
                    //Initialize variables for Fibonacci series
                    int num1 = 0, num2 = 1;
                    System.out.println("Fibonacci numbers up to" + n4 + ":");
                    //Print Fibonacci numbers up to the limit
                    while (num1 <= n4) {
                        System.out.println(num1 + " ");
                        int next = num1 + num2;
                        num1 = num2;
                        num2 = next;
                    }
                    break;

                case 5:
                    System.out.println("The system has ended.");
                    break;
                default:
                    System.out.println("Invalid input,try again");

            }
        }
        while (choice <= 5);
    }
}