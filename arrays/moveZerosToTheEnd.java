package arrays;
import java.util.Scanner;
public class moveZerosToTheEnd {
  public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size=in.nextInt();
    int arr[]=new int [size];
    System.out.println("Enter "+size+" elements :");
    for(int i=0;i<arr.length;i++){
      arr[i]=in.nextInt();
    }
    for(int i=0;i<arr.length;i++){
      if(arr[i]==0){
        int j=i+1;
        int num=arr[i];
        while(j<arr.length){
          arr[j-1]=arr[j];
          j++;
        }
        arr[arr.length-1]=num;
        i--;
      }
    }
   for(int i=0;i<arr.length;i++){
    System.out.print(arr[i] + " ");
}
    in.close();
  }
}
