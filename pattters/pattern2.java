// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:


// *
// **
// ***
// ****
// *****

import java.util.Scanner;
public class pattern2 {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
System.out.println("Enter a number :");
if(in.hasNextInt()){
  int num=in.nextInt();
  for(int i=0;i<num;i++){
    for(int j=0;j<=i;j++){
      System.out.print("*");
    }
    System.out.println();
  }

}
else{
  System.out.println("Invalid number !! ");
}
in.close();
}
}
