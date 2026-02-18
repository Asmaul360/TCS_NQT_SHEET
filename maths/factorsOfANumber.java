/*
Question:
Write a Java program to print all the factors of a given number 
using an optimized approach (iterate till square root of the number).

Example:
Input: 36
Output: 1, 36, 2, 18, 3, 12, 4, 9, 6
*/

package maths;
import java.util.Scanner;

public class factorsOfANumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = in.nextInt();

        System.out.println("The factors of given number " + num + " are :");

        boolean first = true;

        for(int i = 1; i <= Math.sqrt(num); i++){
            if(num % i == 0){

                if(!first) System.out.print(", ");
                System.out.print(i);
                first = false;

                if(i != num/i){
                    System.out.print(", " + (num/i));
                }
            }
        }

        in.close();
    }
}
