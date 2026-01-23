package maths;
import java.util.Scanner;
public class positiveornegative {
  public static void main(String[] args) {
    Scanner in=new Scanner (System.in);
    System.out.println("Enter the number :");
    int num=in.nextInt();
    if(num>=0){
      System.out.print("The  umber is positive : "+num);
    }
    else{
      System.out.print("The  umber is negative : "+num);
    }
  }
}
