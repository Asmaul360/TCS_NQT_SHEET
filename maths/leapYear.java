package maths;

import java.util.Scanner;

public class leapYear {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter a number : ");
    int num=in.nextInt();
    if((num %100!=0 || num%400==0)&&(num%4==0)){
      System.out.println("Leap Year");
    }
    else{
      System.out.println("Not Leap Year");
    }
  }
}
