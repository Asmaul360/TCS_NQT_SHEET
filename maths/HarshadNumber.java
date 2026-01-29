package maths;

import java.util.Scanner;

public class HarshadNumber {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter a number : ");
    int num=in.nextInt();
    int n=num;
    int sum=0;
   while(num>0){
    int a =num%10;
    sum=sum+a;
    num=num/10;

   }
   if(n%sum==0){
    System.out.println("This is a Harshad Number :"+n);
   }
   else{
    System.out.println("This is not a Harshad Number :"+n);

   }
  }
}
