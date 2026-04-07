package arrays;
import java.util.Scanner;
public class MissingNumber_ElementryMathematics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size=in.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements :");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        int n=arr.length;
        int sum=n*(n+1)/2;
        int arraySum=0;
        for(int i=0;i<arr.length;i++){
           arraySum+=arr[i];
        }
        System.out.println("The missing is : "+(sum-arraySum));
    }
}
