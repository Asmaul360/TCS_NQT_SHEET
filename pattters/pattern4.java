// Pattern 4

// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:



// 1
// 22
// 333
// 4444
// 55555

// Print the pattern in the function given to you.

import java.util.Scanner;
public class pattern4 {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter a number :");
    if (in.hasNextInt()) {
      int num=in.nextInt();
      for(int i=1;i<=num;i++){
        for(int j=1;j<=i;j++){
          System.out.print(i);
        }
        System.out.println();
      }
    }else{
      System.out.println("Invalid input !!");

    }
    in.close();

  }
  
}
