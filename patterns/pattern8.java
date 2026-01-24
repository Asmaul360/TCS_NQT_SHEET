// Pattern 8


// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:


// *********
//  *******
//   *****
//    ***
//     *

import java.util.Scanner;
public class pattern8 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number : ");
    if(in.hasNextInt()){
      int n=in.nextInt();
      int num=n;
      
      for(int i=1;i<=n;i++){
        for(int j=1;j<i;j++){
          System.out.print(" ");          
        }
        for(int k=1;k<=num*2-1;k++){
          System.out.print("*");
        }       
        num--;
        System.out.println(); 

      }
    }
    else{
      System.out.println("Invalid input !!");
    }
  }
  
}
