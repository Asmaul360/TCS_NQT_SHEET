/*
Question:
Write a Java program to find the sum of the digits of a given number.
Example:
Input: 567
Digits: 5, 6, 7
Calculation: 5 + 6 + 7 = 18
Output: The sum of the digits is: 18
*/

package maths;
import java.util.Scanner;

public class sumOfDigits {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter a digit : ");
    int num = in.nextInt();
    int sum = 0;

    while(num > 0){
      int i = num % 10;   // extract last digit
      sum = sum + i;      // add it to sum
      num = num / 10;     // remove last digit
    }

    System.out.println("The sum of the digit is : " + sum);

    in.close();
  }
}
