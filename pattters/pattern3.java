// Pattern 3


// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:


// 1
// 12
// 123
// 1234
// 12345

import java.util.Scanner;
public class pattern3 {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter a number : ");
    if(in.hasNextInt()){
      int num=in.nextInt();
      for(int i=1;i<=num;i++){
        for(int j=1;j<=i;j++){
          System.out.print(j);
        }
        System.out.println();
      }

    }
    else{
      System.out.println("Invalid input !!");
    }
    in.close();
  }
}
