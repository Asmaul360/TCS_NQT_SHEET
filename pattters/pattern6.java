// Pattern 6

// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// 12345
// 1234
// 123
// 12
// 1

import java.util.Scanner;
public class pattern6 {
  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    System.out.println("Enter a number : ");
    if(in.hasNextInt()){
      int num=in.nextInt();
      int n=num;
      for(int i=1;i<=num;i++){
        for(int j=1;j<=n;j++){
          System.out.print(j);
        }
        n--;
        System.out.println();
      }
    }
    else{
      System.out.println("Invalid number !!");
    }
    in.close();
  }
}
