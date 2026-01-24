// Pattern 7

// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

//     *
//    ***
//   *****
//  *******
// *********

import java.util.Scanner;
public class pattern7 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number : ");
    if (in.hasNextInt()) {
      int num=in.nextInt();
      int n=num;
     
      for(int i=1;i<=num;i++){
        for(int j=1;j<=n-1;j++){
          System.out.print(" ");
        }
       for(int k=0;k<(i*2)-1;k++){
         System.out.print("*");
       }
      
       System.out.println("");
       n--;
      }
    } else {
      System.out.println("Invalid input !!");
    }

  }
}
