package arrays;

import java.util.*;

public class maximumConsecutiveOnes{
  public static void main(String[] args) {
    Scanner in =new Scanner (System.in);
    System.out.println("Enter the size of the array :");
    int size=in.nextInt();
    int arr[]=new int[size];
    System.out.println("Enter the elements in the array :");
    for(int i=0;i<arr.length;i++){
      arr[i]=in.nextInt();
    }
    int count=0;
    int max=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]==1){
        count++;
        max=Math.max(max,count);
      }
      else{
        // max=count;
        count=0;
      }
    }
    System.out.println("The maximum consecutive ones is : "+max);
    in.close();
    }
}