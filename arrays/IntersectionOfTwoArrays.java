package arrays;
import java.util.Scanner;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the size of array 1 :");
        int size1=in.nextInt();
        int arr1[]=new int [size1];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=in.nextInt();
        }
        System.out.println("Enter the size of array 2 :");
        int size2=in.nextInt();
        int arr2[]=new int [size2];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=in.nextInt();
        }
        System.out.println("The elements after insertion are :");
       
        for(int i =0;i<arr1.length;i++){
          if(i < arr1.length - 1 && arr1[i] == arr1[i+1]){
    continue;
}
           else{for(int j=0;j<arr2.length;j++){
            if(arr1[i]==arr2[j]){
                System.out.println(arr1[i]);
                break;
            }
           }}
        }
        
    }
}
