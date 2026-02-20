package arrays;
import java.util.Scanner;
public class medianOfArray {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size=in.nextInt();
    int arr[]=new int [size];
    System.out.println("Enter "+ size +" elements :");
    for(int i=0;i<size;i++){
      arr[i]=in.nextInt();
    }
    if(size%2==0){
      int median=(arr[size/2]+arr[(size/2)-1])/2;
      System.out.println("As the size is even the median is : "+median);
    }
    else{
      int median=arr[size/2];
      System.out.println("As the size is odd the median is :"+median);
    }
    in.close();
  }
}
