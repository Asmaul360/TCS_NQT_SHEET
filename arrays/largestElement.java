package arrays;
import java.util.Scanner;
public class largestElement {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the size of the array :");
        int size = in.nextInt();
        int arr[]=new int [size];
        System.out.println("Enter the elements of the array :");
        for(int i =0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        
        System.out.println("The largest element in the array is : "+largest);
        in.close();
    }
    
}
