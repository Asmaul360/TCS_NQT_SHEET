package maths;

import java.util.Scanner;

/*
  Program: Check whether a number is an Automorphic Number
  ---------------------------------------------------------

  Automorphic Number Definition:
  A number is called AUTOMORPHIC if its square ends with 
  the same digits as the number itself.

  Example:
    Number = 25
    Square = 25 * 25 = 625
    625 ends with 25 → So 25 is an Automorphic Number

  Other examples:
    5 → 25 ends with 5
    6 → 36 ends with 6
    76 → 5776 ends with 76
*/

public class AutomorphicNumber {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = in.nextInt();

    int original = num;      // store original number
    int square = num * num;  // square of the number

    int temp1 = num;
    int temp2 = square;

    int digitCountNum = 0;   // number of digits in num
    int digitCountSquare = 0; // number of digits in square

    int sumDigitsNum = 0;     // sum of digits of num
    int lastDigitsSum = 0;    // sum of last digits from square

    // Count digits of number + sum digits of number
    while(temp1 > 0){
      int d = temp1 % 10;
      sumDigitsNum += d;
      temp1 /= 10;
      digitCountNum++;
    }

    // Count digits of the square
    while(temp2 > 0){
      temp2 /= 10;
      digitCountSquare++;
    }

    // Extract LAST digitCountNum digits from square
    int copySquare = square;  // because temp2 is finished
    for(int i = digitCountSquare; i > (digitCountSquare - digitCountNum); i--){
      int d = copySquare % 10;
      lastDigitsSum += d;
      copySquare /= 10;
    }

    // Compare both sums
    if(sumDigitsNum == lastDigitsSum){
      System.out.println(original + " is an Automorphic Number");
    } else {
      System.out.println(original + " is NOT an Automorphic Number");
    }
  }
}
