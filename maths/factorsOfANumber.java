package maths;
import java.util.Scanner;

public class factorsOfANumber {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int num = in.nextInt();

    for(int i = 1; i <= Math.sqrt(num); i++){
      if(num % i == 0){
        System.out.println(i);

        if(i != num/i){   // Avoid duplicate for perfect square
          System.out.println(num/i);
        }
      }
    }
  }
}
