package maths;

import java.util.Scanner;

/*
  Program: Check whether a number is a Harshad Number
  ---------------------------------------------------
  A Harshad Number (Niven Number) is a number that is divisible 
  by the sum of its digits.

  Example:
    Number = 18
    Sum of digits = 1 + 8 = 9
    18 % 9 == 0  →  So 18 is a Harshad Number
*/

public class HarshadNumber {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter a number : ");
    int num = in.nextInt();   // user input
    int n = num;              // store original number

    int sum = 0;              // to store sum of digits

    // Extract each digit and add to sum
    while(num > 0){
      int a = num % 10;       // last digit
      sum = sum + a;          // add digit to sum
      num = num / 10;         // remove last digit
    }

    // Check Harshad condition
    if(n % sum == 0){
      System.out.println("This is a Harshad Number : " + n);
    }
    else{
      System.out.println("This is not a Harshad Number : " + n);
    }
  }
}
