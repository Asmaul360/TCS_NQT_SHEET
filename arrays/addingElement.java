package arrays;
import java.util.Scanner;
public class addingElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size=in.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements for the array :");
        for(int i =0;i<arr.length;i++){
            arr[i]=in.nextInt();            
        }
        System.out.println("Element you want to enter in the array :");
        int num=in.nextInt();
        System.out.println("Enter the number or position where you want to enter the element :");
        int position=in.nextInt();
        size=size+1;
        int  arr1[]=new int [size];
        if(position>arr.length){
            return;
        }
        for(int i=0;i<arr1.length;i++){
           if(i<position){
            arr1[i]=arr[i];
           }
           else if(i==position){
            arr1[i]=num;
           }  
           else{
            arr1[i]=arr[i-1];
           }
        }
        System.out.println("New array elements are :");
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        in.close();
    }
}
