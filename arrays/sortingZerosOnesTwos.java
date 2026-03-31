package arrays;
import java.util.Scanner;
public class sortingZerosOnesTwos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size=in.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements for the array :");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        for(int i =0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int pointer1=arr[i];
                    arr[i]=arr[j];
                     arr[j]=pointer1;

                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
