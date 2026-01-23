// Find all the palindrome numbers in a given range
package maths;
import java.util.Scanner;
public class countAllPalindromeNum {
  public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   System.out.println("Enter the first range : ");
   int num1=in.nextInt();
   System.out.println("Enter the second range : ");
   int num2=in.nextInt();
  //  int index=0;
   int count=0;
  // int arr[];
   for(int i=num1;i<=num2;i++){
    int num=i;
    int sum=0;
    int  a;
    while(num>0){
      a=num%10;
      sum=sum*10+a;
      num=num/10;
      
    }
    if(sum==i){
      count++;
    }
   
   }
   int index=0;
   int[] arr = new int[count];
   for(int i=num1;i<=num2;i++){
    int num=i;
    int sum=0;
    int  a;
    while(num>0){
      a=num%10;
      sum=sum*10+a;
      num=num/10;
      
    }
    if(sum==i){
     arr[index]=i;index++;

    }
   
   }
for(int i = 0; i < arr.length; i++){
    System.out.print(arr[i] + " ");
}

in.close();
  }
}
