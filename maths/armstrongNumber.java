/*
Question:
Write a Java program to check whether a given number is an Armstrong number or not.
An Armstrong number is a number whose sum of its digits raised to the power of the 
number of digits is equal to the number itself.

Example:
Input: 153
Digits: 1, 5, 3
Number of digits = 3
Calculation: 1^3 + 5^3 + 3^3 = 153
Output: Armstrong Number
*/

package maths;
import java.util.Scanner;

public class armstrongNumber {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter a number :");
    int num = in.nextInt();

    int n = num;
    int a = num;

    int count = 0;

    // Counting digits
    while(num > 0){
      num = num / 10;
      count++;
    }

    System.out.println("How many digits: " + count);

    int sum = 0;

    // Calculating Armstrong sum
    while (n > 0) {
      int i = n % 10;
      sum = sum + (int)Math.pow(i, count);
      n = n / 10;
    }

    // Checking Armstrong condition
    if(sum == a){
      System.out.println("Armstrong number");
    }
    else{
      System.out.println("Not an Armstrong number");
    }

    in.close();
  }
}
