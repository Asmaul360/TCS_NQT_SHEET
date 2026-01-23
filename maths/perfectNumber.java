package maths;
import java.util.Scanner;
public class perfectNumber {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int num=in.nextInt();
    int sum=0;
    for(int i=1;i<num;i++){
      if(num%i==0){
        sum=sum+i;
      }
    }
    if(sum==num){
      System.out.println("Perfect number : "+num);
    }else{
      System.out.println("Not a Perfect number : "+num);

    }
    in.close();
  }
}

