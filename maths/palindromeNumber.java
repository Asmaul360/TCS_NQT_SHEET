package maths;

import java.util.Scanner;

// Q: Write a Java program to check whether a given number is a Palindrome number or not.
//    A palindrome number reads the same backwards as forwards.
//    Example: 121 → Palindrome, 1331 → Palindrome, 123 → Not Palindrome.

public class palindromeNumber {

    public static void main(String[] args) {

        // Scanner to take input from the user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // user input

        int original = num;  // storing original number
        int reversed = 0;    // to store reversed number

        // Logic to reverse the number
        while (num > 0) {
            int digit = num % 10;       // get last digit
            reversed = reversed * 10 + digit; // build reverse
            num = num / 10;             // remove last digit
        }

        // Checking if palindrome
        if (original == reversed) {
            System.out.println(original + " is a Palindrome number.");
        } else {
            System.out.println(original + " is NOT a Palindrome number.");
        }

        sc.close(); // close scanner
    }
}
