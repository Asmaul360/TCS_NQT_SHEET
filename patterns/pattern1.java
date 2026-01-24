// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// *****
// *****
// *****
// *****
// *****

// hasNextInt() → checks first
// nextInt() → then reads

import java.util.Scanner;
class pattern1{
  public static void main(String[] args) {
   Scanner in=new Scanner(System.in);
   System.out.println("Enter a number : ");
   if(in.hasNextInt()){
     int num = in.nextInt();
   for(int i=0;i<num;i++){
    for (int j=0;j<num;j++){
    System.out.print("*");
  }
  System.out.println();
}
   }
   else{
    System.out.println("Enter a valid number");
   }
  in.close();
  }
}