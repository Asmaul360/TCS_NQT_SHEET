package arrays;
import java.util.Scanner;
public class sumOfElements {
  public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    System.out.println("Enter the size of the array ");
    int size=in.nextInt();
    int arr[]=new int[size];
    System.out.println("Enter "+size+" elements ");
    for(int i=0;i<size;i++){
      arr[i]=in.nextInt();
    }
    int sum=0;
    for(int i=0;i<arr.length;i++){
    sum=sum+arr[i];
    }
    System.out.print("The sum of elements of the array : "+sum);
    in.close();
  }
}
