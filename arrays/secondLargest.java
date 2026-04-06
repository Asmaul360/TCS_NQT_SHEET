package arrays;
import java.util.Scanner;
public class secondLargest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size=in.nextInt();
        int arr[]=new int [size];
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        int Largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>Largest){
                secondLargest = Largest;
                Largest=arr[i];
            }            
            else if(arr[i]>secondLargest && arr[i]<Largest){
                secondLargest=arr[i];
            }            
        }


       
        System.out.println("The largest element is : "+Largest);
        System.out.println("The second largest element is : "+secondLargest);
    
    }
}
