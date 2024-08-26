package Assignments;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Assume the number is prime
        boolean isPrime = true;

        // Check if the number is less than 2
        if (number < 2) {
            isPrime = false;
        } else {
            // Check for factors from 2 to number - 1
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    // If a factor is found, the number is not prime
                    isPrime = false;
                    break;
                }
            }
        }

        // Display the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}

